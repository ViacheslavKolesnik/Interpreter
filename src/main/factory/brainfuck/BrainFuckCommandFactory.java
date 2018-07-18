package main.factory.brainfuck;

import main.command.Command;
import main.command.brainfuck.*;
import main.factory.CommandFactory;
import main.language.Language;
import main.language.brainfuck.BrainFuck;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Slavian on 7/17/2018.
 */
public class BrainFuckCommandFactory implements CommandFactory{

    private Map<Character,Command> dictionary;
    private BrainFuck brainFuck;

    public BrainFuckCommandFactory (Language language){
        brainFuck = (BrainFuck) language;
        dictionary = new HashMap<Character,Command>(){{
            put('>', new IncrementPointer(brainFuck));
            put('<', new DecrementPointer(brainFuck));
            put('+', new IncrementValue(brainFuck));
            put('-', new DecrementValue(brainFuck));
            put('.', new PrintValue(brainFuck));
            put('[', new StartCycle(brainFuck));
            put(']', new EndCycle(brainFuck));
        }};
    }

    @Override
    public Command createCommand(char operator) {
        return dictionary.get(operator);
    }

    public BrainFuck getBrainFuck(){
        return brainFuck;
    }
}
