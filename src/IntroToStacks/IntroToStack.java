package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		Random rand = new Random();
		boolean greater = true;
		Stack<Double> myStack = new Stack<Double>();
		//   Don't forget to import the Stack class
		for(int i = 0 ; i <100 ; i++) {
			double number = rand.nextDouble()*100;
			myStack.push(number);
			
		}

		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		String ans1 = JOptionPane.showInputDialog("Enter one whole number from 0-100:");
		String ans2 = JOptionPane.showInputDialog("Enter a second, different, whole number from 0-100:");
		
		int x = Integer.parseInt(ans1);
		int y = Integer.parseInt(ans2);
		
		System.out.println("NUM 1: "+ x);
		System.out.println("NUM 1: "+ y + "\n");
		
		if(x<y) { 
			greater= false;
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		System.out.println("Popping elements off stack...\n\nElements between " + x + " and " + y + ":");
		
		for(int i = 0; i< myStack.size(); i++) {
			double num = myStack.pop();
			
			
			if(x > num && y < num && greater) {
				
				System.out.println(num);
				
			}
			
			if(x < num && y > num && greater == false) {
				
				System.out.println(num);
			}
			
			
		}
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
