package com.tistory.jaimemin.designpattern.behavioral_patterns.command.after;

import com.tistory.jaimemin.designpattern.behavioral_patterns.command.before.Game;

public class GameEndCommand implements Command {

	private Game game;

	public GameEndCommand(Game game) {
		this.game = game;
	}

	@Override
	public void execute() {
		game.end();
	}

	@Override
	public void undo() {
		new GameStartCommand(this.game).execute();
	}
}
