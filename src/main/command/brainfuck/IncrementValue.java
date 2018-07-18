package main.command.brainfuck;

import main.command.Command;
import main.language.brainfuck.BrainFuck;

public class IncrementValue implements Command {

	private BrainFuck command;

	public IncrementValue(BrainFuck command) {
		this.command = command;
	}

	@Override
	public void execute() {
		this.command.incrementValue();
	}

}
