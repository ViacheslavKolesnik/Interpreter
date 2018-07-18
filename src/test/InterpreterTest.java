package test;

import main.factory.CommandFactory;
import main.factory.brainfuck.BrainFuckCommandFactory;
import main.interpreter.Interpreter;
import main.interpreter.brainfuck.BrainFuckInterpreter;
import main.language.brainfuck.BrainFuck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Slavian on 7/17/2018.
 */
public class InterpreterTest {

    @Test
    public void test(){
        String inputString = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        String expected = "Hello World!\n";
        BrainFuck brainFuck = new BrainFuck();
        CommandFactory brainFuckCommandFactory = new BrainFuckCommandFactory(brainFuck);
        Interpreter brainFuckInterpreter = new BrainFuckInterpreter(brainFuckCommandFactory);

        brainFuckInterpreter.interpret(inputString);
        assertEquals(expected, brainFuck.getResult());
    }
}
