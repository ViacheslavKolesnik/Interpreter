package main.language.brainfuck;

import main.language.Language;

import java.util.Stack;

public class BrainFuck implements Language {

	private int[] values = new int[30000];
	private int valuePointer = 0;
	private int expressionPointer = 0;
	private String result = "";
	private Stack<Integer> cycles = new Stack<>();

	public int getExpressionPointer() {
		return expressionPointer;
	}
	public void setExpressionPointer(int expressionPointer) {
		this.expressionPointer = expressionPointer;
	}
	public String getResult(){
		return result;
	}

	public void incrementPointer() {
		valuePointer++;
	}
	public void decrementPointer() {
		valuePointer--;
	}
	public void incrementValue() {
		values[valuePointer]++;
	}
	public void decrementValue() {
		values[valuePointer]--;
	}
	public void printValue() {
		result = result.concat((char)values[valuePointer] + "");
	}
	public void startCycle(){
		cycles.push(expressionPointer + 1);
	}
	public void endCycle(){
		if(values[valuePointer] != 0){
			expressionPointer = cycles.peek()-1;
		} else {
			cycles.pop();
		}
	}
}
