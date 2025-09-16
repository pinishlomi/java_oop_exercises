package starters.generic.stack_exe.no_generics;

public class StackArray<T> implements Stackable {
	private int[] arr;
	private int topIndex;
	
	public StackArray() {
		arr = new int[2];
		topIndex = -1;
	}
	
	@Override
	public void push(int value) {
		if (topIndex == arr.length-1) {
			int[] temp = new int[arr.length*2];
			System.arraycopy(arr,  0, temp, 0,  arr.length);
			arr = temp;
		}
		topIndex++;
		arr[topIndex] = value;
	}
	
	@Override
	public int pop() throws Exception {
		if (topIndex < 0)
			throw new Exception("Stack is empty, cannot pop");
		
		int topValue = arr[topIndex];
		topIndex--;
		return topValue;
	}

	@Override
	public int top() throws Exception {
		if (topIndex < 0)
			throw new Exception("Stack is empty, cannot pop");

		return arr[topIndex];
	}

	@Override
	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	@Override
	public String toString() {
		if (isEmpty())
			return "[]";
		
		String s = "[";
		for (int i=0 ; i <= topIndex ; i++) {
			s += arr[i];
			if (i < topIndex)
				s+= ", ";
		}
		return s + "]";
	}
}
