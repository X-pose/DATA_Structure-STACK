package StackPack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackX st = new StackX(5); //Creating an object from StackX class
		
    //Inserting values to the st object
		st.push(90);
		st.push(56);
		st.push(78);
		st.push(67);
		st.push(45);
		st.push(33);
		st.push(125);
		st.push(38);
	
    //Peeking the top value
		System.out.println("Peek value is : - " + st.peek());
		
    //Removing values from top
		System.out.println("Pop value is : - " + st.pop());
	}

}
