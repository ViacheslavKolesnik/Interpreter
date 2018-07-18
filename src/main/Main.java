package main;

import main.factory.CommandFactory;
import main.factory.brainfuck.*;
import main.interpreter.Interpreter;
import main.interpreter.brainfuck.BrainFuckInterpreter;
import main.language.brainfuck.BrainFuck;

/**
 * Created by Slavian on 7/17/2018.
 */
public class Main {
    public static void main(String[] args) {
        String inputString = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";

        BrainFuck brainFuck = new BrainFuck();
        CommandFactory brainFuckCommandFactory = new BrainFuckCommandFactory(brainFuck);
        Interpreter brainFuckInterpreter = new BrainFuckInterpreter(brainFuckCommandFactory);

        brainFuckInterpreter.interpret(inputString);
        System.out.println(brainFuck.getResult());
    }
}
