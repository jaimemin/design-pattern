package com.tistory.jaimemin.designpattern.behavioral_patterns.command.after;

import com.tistory.jaimemin.designpattern.behavioral_patterns.command.before.Light;

public class LightOnCommand implements Command {

	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		new LightOffCommand(this.light).execute();
	}
}
