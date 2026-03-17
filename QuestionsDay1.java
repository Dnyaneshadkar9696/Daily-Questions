package arrayquestions;

import java.util.Scanner;

public class QuestionsDay1 {

	// in this Questions class we will solve 2 control flow stactements and 2 Array
	// Questions and 2 String

	// Array Questions
	// find the duplicate elements in an array
	//

	Scanner sc = new Scanner(System.in);

	public void call() {
		this.duplicateFind();
		System.out.println();
		this.elementOnceAppear();
		System.out.println();

		// Control flow
		this.firstNonrepeating();
		System.out.println();
		this.checkArmstrong();
		
		//String 
		System.out.println();
		this.checkPalindrome();
		System.out.println();
		this.countVowelC();

	}

	public void duplicateFind() {
		int[] arr = { 23, 56, 76, 45, 76, 43, 23 };
		// here the duplicate element is 76 so

		System.out.println("Duplicate elements are : ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				// if we take j as 0 here then the condition of if is true one as the element is
				// checked the entire array
				// including the element for whom we are checking

				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}

		}

	}

	// to find an element that appears once in the array all others are twice
	// appeared
	public void elementOnceAppear() {

		int[] arrr = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
//		int count = 0;
		// for this question we keep the count of the single element
		System.out.println("Element that appears onecin the array : ");
		for (int i = 0; i < arrr.length; i++) {

			// we have to reset the count for the every element
			int count = 0;

			for (int j = 0; j < arrr.length; j++) {
				if (arrr[i] == arrr[j]) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println(arrr[i]);
			}
		}

	}

	// *************** Control flow statement questions

	// to print the first non repeating element in an array

	public void firstNonrepeating() {

		int[] arrN = { 4, 5, 1, 2, 0, 4, 1, 0 };

		System.out.println("First non repeating element in an array : ");
		for (int i = 0; i < arrN.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arrN.length; j++) {
				if (arrN[i] == arrN[j]) {
					count++;
				}

			}
			if (count == 0) {
				System.out.println(arrN[i]);
				break;
			}
		}

	}

	// two check weather the number is an Armstrong number
	public void checkArmstrong() {
		// 153 so digits are 3 so cube of this individual three numbers is equal to 153

		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int real = num;
		int e1 = num;

		// first we have to count the number of digits
		int count = 0;

		while (num > 0) {
//			int digit  = num % 10 ;
//			// it gives the remainder value 3

			count++;
			num = num / 10;

			// It removes the last value
			// and again checks the num value
		}

//		System.out.println(count);

		int total = 0;
		while (e1 > 0) {

			// when the condition is false loop breaks
			// here take one one number
			int digit = e1 % 10;
			// it will give the 3

			// we have to find the cube of three and store it
			int i = 0;
			int sum = 1;
			while (i < count) {
				// the i will go till 2 ie . 0 1 2

				sum = sum * digit;
				i++;

			}

			total = total + sum;

			e1 = e1 / 10;
		}

		if (total == real) {
			System.out.println("The number is armstrong number");
		} else {
			System.out.println("The number is not an armstrong number");
		}

	}

//	********* String questions

	public void checkPalindrome() {
		String pal = "DaD";
		String check = "";
		for (int i = pal.length() - 1; i >= 0; i--) {
			char ch = pal.charAt(i);

			check = check + ch;
//			concat

		}
		
		if(pal.equals(check)) {
			System.out.println("The String is a palindrome");
		}
		else {
			System.out.println("The String is not a Palindrome");
		}
	}
	
	
	// To count Vowels and Consonants in the string
	
	public void countVowelC() {
		
		String random = "My name is Dnyanesh";
		int countV = 0;
		int countO = 0;
		for(int i = 0 ; i < random.length() ; i++) {
			char ch = random.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				countV++;
			}
			else if (ch == ' ') {
				continue;
			}
			else {
				countO++;
			}
		}
		System.out.println("Count of Vowels : " + countV);
		System.out.println("Count of Consonants : "+ countO);
	}

}
