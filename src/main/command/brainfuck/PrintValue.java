package main.command.brainfuck;

import main.command.Command;
import main.language.brainfuck.BrainFuck;

public class PrintValue implements Command{

	private BrainFuck command;

	public PrintValue(BrainFuck command) {
		this.command = command;
	}

	@Override
	public void execute() {
		this.command.printValue();
	}

}
