package main.command.brainfuck;

import main.command.Command;
import main.language.brainfuck.BrainFuck;

/**
 * Created by Slavian on 7/17/2018.
 */
public class StartCycle implements Command {
    private BrainFuck command;

    public StartCycle(BrainFuck command) {
        this.command = command;
    }

    @Override
    public void execute() {
        this.command.startCycle();
    }
}
