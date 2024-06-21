package com.tistory.jaimemin.designpattern.creational_patterns.singleton;

/**
 * 리플렉션을 통해서도 싱글톤 패턴을 깨트리지 못하게 하는 방법
 * Enum은 내부적으로 Serializable을 구현하고 있음
 * 직렬화 역직렬화로부터 싱글톤 패턴을 깨트리는 것으로부터 안전함
 *
 * 단점: 로딩하는 순간 인스턴스 자체가 미리 만들어짐
 * 단점: 상속을 사용하지 못함
 */
public enum EnumSettings {

	INSTANCE;

}
