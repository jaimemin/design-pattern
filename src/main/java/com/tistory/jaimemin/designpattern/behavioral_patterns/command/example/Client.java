package com.tistory.jaimemin.designpattern.behavioral_patterns.command.example;

public class Client {

	public static void main(String[] args) {
		// Receiver 객체들 생성
		Device device = new Device();
		Stereo stereo = new Stereo();
		TV tv = new TV();

		// Command 객체들 생성
		Command turnOnDevice = new TurnOnCommand(device);
		Command turnOffDevice = new TurnOffCommand(device);
		Command adjustVolumeStereo = new AdjustVolumeCommand(stereo);
		Command changeChannelTV = new ChangeChannelCommand(tv);

		// Invoker 객체 생성 및 명령 실행
		RemoteControl remote = new RemoteControl();
		remote.setCommand(turnOnDevice);
		remote.pressButton();
		remote.setCommand(adjustVolumeStereo);
		remote.pressButton();
		remote.setCommand(changeChannelTV);
		remote.pressButton();
		remote.setCommand(turnOffDevice);
		remote.pressButton();
	}
}
