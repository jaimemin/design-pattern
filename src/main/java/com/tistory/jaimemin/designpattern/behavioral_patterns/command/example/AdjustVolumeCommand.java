package com.tistory.jaimemin.designpattern.behavioral_patterns.command.example;

public class AdjustVolumeCommand implements Command {
	
	private Stereo stereo;

	public AdjustVolumeCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.adjustVolume();
	}
}
