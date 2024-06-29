package com.tistory.jaimemin.designpattern.behavioral_patterns.command.example;

public class TurnOffCommand implements Command {
	
	private Device device;

	public TurnOffCommand(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.turnOff();
	}
}
