/**
 * 
 */
package mystack;

/**
 * @author Russell Ng
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null){
			System.out.println("Stack is empty");
			return null;
		}
		T value = theStack.val;
		theStack = theStack.next;
		return value;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intStack = new MyStack<>();

		intStack.push(1);
		intStack.push(2);
		System.out.println(intStack.pop());
		intStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> personStack = new MyStack<>();

		Person p1 = new Person();
		p1.setFname("Russell");
		p1.setLname("Ng");
		personStack.push(p1);
		Person p2 = new Person();
		p2.setFname("Christelle");
		p2.setLname("Scharff");
		personStack.push(p2);
	}

}
