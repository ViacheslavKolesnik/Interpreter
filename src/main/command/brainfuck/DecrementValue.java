package main.command.brainfuck;

import main.command.Command;
import main.language.brainfuck.BrainFuck;

public class DecrementValue implements Command {

	private BrainFuck command;

	public DecrementValue(BrainFuck command) {
		this.command = command;
	}

	@Override
	public void execute() {
		this.command.decrementValue();
	}

}
