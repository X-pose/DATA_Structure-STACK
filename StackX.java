package StackPack;

//Stack type - char
public class StackX {
	int top;
	int maxSize;
	char[] array;
	
  //Constructor
	StackX(int max) {
		maxSize = max;
		top = -1;
		array = new char[maxSize];
		
	}

//Inserting values - Push method
	public void Push(char value) {
		if (!isFull()) {
			array[++top] = value;
		} else {
			System.out.println("Stack is Full !!");
		}
		
	}

//Removing values from stack - Poping values
	public char pop() {

		if (!isEmpty()) {
			return array[top--];
		} else {
			System.out.println("Stack is empty!!");
			return 'B';
		}
	}

//Peeking the top value
	public char peek() {

		if (!isEmpty()) {
			return array[top];
		} else {
			System.out.println("Stack is empty!!");
			return 'P';
		}
	}

//Checking whether stack is empty or not
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

//Checking whether stack is full or not
	public boolean isFull() {
		if (top == maxSize - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
