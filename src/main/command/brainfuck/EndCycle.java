package main.command.brainfuck;

import main.command.Command;
import main.language.brainfuck.BrainFuck;

/**
 * Created by Slavian on 7/17/2018.
 */
public class EndCycle implements Command{
    private BrainFuck command;

    public EndCycle(BrainFuck command) {
        this.command = command;
    }

    @Override
    public void execute() {
        this.command.endCycle();
    }
}
