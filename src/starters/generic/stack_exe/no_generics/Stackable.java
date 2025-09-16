package starters.generic.stack_exe.no_generics;

public interface Stackable {
	void push(int value);
	int pop() throws Exception;
	int top() throws Exception;
	boolean isEmpty();
}
