package main.command.brainfuck;

import main.command.Command;
import main.language.brainfuck.BrainFuck;

public class DecrementPointer implements Command {
	
	private BrainFuck command;

	public DecrementPointer(BrainFuck command) {
		this.command = command;
	}

	@Override
	public void execute() {
		this.command.decrementPointer();
	}

}
