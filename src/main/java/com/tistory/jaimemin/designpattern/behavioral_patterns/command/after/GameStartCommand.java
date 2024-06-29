package com.tistory.jaimemin.designpattern.behavioral_patterns.command.after;

import com.tistory.jaimemin.designpattern.behavioral_patterns.command.before.Game;

public class GameStartCommand implements Command {

	private Game game;

	public GameStartCommand(Game game) {
		this.game = game;
	}

	@Override
	public void execute() {
		game.start();
	}

	@Override
	public void undo() {
		new GameEndCommand(this.game).execute();
	}
}
