package com.tistory.jaimemin.designpattern.behavioral_patterns.command.example;

public class TurnOnCommand implements Command {
	
	private Device device;

	public TurnOnCommand(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.turnOn();
	}
}
