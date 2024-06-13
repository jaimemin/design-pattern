package com.tistory.jaimemin.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class App {

	public static void main(String[] args) throws Exception {
		Settings settings = Settings.getInstance();

		System.out.println(settings == Settings.getInstance());

		/**
		 * 리플렉션을 통해 싱글턴 패턴 깨트릴 수 있음
		 * 단, enum일 경우 깨트릴 수 없음
		 * Cannot reflectively create enum objects
		 */
		Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
		constructor.setAccessible(true); // private 생성자이기 때문에 setAccessible(true)
		Settings settingsGeneratedByReflector = constructor.newInstance();

		System.out.println(settings == settingsGeneratedByReflector);

		// EnumSettings enumSettings = null;
		// Constructor<?>[] declaredConstructors = EnumSettings.class.getDeclaredConstructors();
		//
		// for (Constructor<?> c : declaredConstructors) {
		// 	c.setAccessible(true);
		// 	enumSettings = (EnumSettings) c.newInstance("INSTANCE");
		// }
		//
		// System.out.println(EnumSettings.INSTANCE == enumSettings);

		/**
		 * 직렬화와 역직렬화를 통해 싱글턴 패턴 깨트릴 수 있음
		 * 리플렉션과 달리 해당 방법은 대응 가능 (readResolve를 재정의하여 instance 반환)
		 *
		 * enum의 경우 별도 처리 없이도 안전함
		 */
		try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
			output.writeObject(settings);
		}

		Settings settingsGeneratedByDeserializable = null;

		try (ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
			settingsGeneratedByDeserializable = (Settings)input.readObject();
		}

		System.out.println(settings == settingsGeneratedByDeserializable);
	}
}
