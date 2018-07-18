package main.factory;

import main.command.Command;

public interface CommandFactory {
	
	Command createCommand(char operator);
}
