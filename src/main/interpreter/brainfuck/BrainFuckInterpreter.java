package main.interpreter.brainfuck;

import main.command.Command;
import main.factory.CommandFactory;
import main.factory.brainfuck.BrainFuckCommandFactory;
import main.interpreter.Interpreter;
import main.language.brainfuck.BrainFuck;

public class BrainFuckInterpreter implements Interpreter {

	private BrainFuckCommandFactory brainFuckCommandFactory;

	public BrainFuckInterpreter(CommandFactory brainFuckCommandFactory){
		this.brainFuckCommandFactory = (BrainFuckCommandFactory) brainFuckCommandFactory;
	}

	@Override
	public void interpret(String expression) {
		BrainFuck brainfuck = brainFuckCommandFactory.getBrainFuck();
		for ( ;
			  brainfuck.getExpressionPointer() < expression.length();
			  brainfuck.setExpressionPointer(brainfuck.getExpressionPointer()+1)) {
			Command command = brainFuckCommandFactory.createCommand(expression.charAt(brainfuck.getExpressionPointer()));
			command.execute();
		}
	}
}
