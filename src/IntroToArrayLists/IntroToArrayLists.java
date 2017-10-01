package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings

		ArrayList<String> numbers = new ArrayList<String>();

		// Don't forget to import the ArrayList class
		numbers.add("55");
		numbers.add("99");
		numbers.add("23");
		numbers.add("102");
		numbers.add("687");

		// 2. Add five Strings to your list

		for (int i = 0; i < numbers.size(); i++) {

			System.out.println(numbers.get(i));

		}

		for (String s : numbers) {
			System.out.println(s);
		}
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < numbers.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(numbers.get(i));
			}
		}
		// 4. Print all the Strings using a for-each loop

		// 5. Print only the even numbered elements in the list.
		for (int i = numbers.size()-1; i >=0; i--) {
				System.out.println(numbers.get(i));
			
		}
		// 6. Print all the Strings in reverse order.
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i).contains("1")) {
				System.out.println(numbers.get(i));
			}
		}
		// 7. Print only the Strings that have the letter 'e' in them.
	}
}
