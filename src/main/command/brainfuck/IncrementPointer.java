package main.command.brainfuck;

import main.command.Command;
import main.language.brainfuck.BrainFuck;

public class IncrementPointer implements Command {

	private BrainFuck command;

	public IncrementPointer(BrainFuck command) {
		this.command = command;
	}

	@Override
	public void execute() {
		this.command.incrementPointer();
	}

}
