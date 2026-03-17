package arrayquestions;

public class QuestionsDay2 {
	
	
	public void calling() {
		this.findSecondLargest();
		System.out.println();
		this.moveZerostoEnd();
		
//		Control Flow
		System.out.println();
		this.fibonacciSeries();
		System.out.println();
		this.printPattern();
		
	// String 
		System.out.println();
		this.removeDuplicateChar();
	}

	// Arrays

//	find the second largest element in an array without sorting the array.

	public void findSecondLargest() {
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		// got the maxx
		
		// we need the another loop for the second max 
		// consider the first element as the secondmax
		int secondmax = arr[0];
		for( int sr = 0 ; sr < arr.length ; sr++) {
			
			if( arr[sr] > secondmax && arr[sr] < max) {
				
				// what we write in the condition here is the second max number is first number 
				// then we check it with the other number and it should be less than max then it is the second max number
				secondmax = arr[sr];
			}
		}
		System.out.println("Second Max element is an array is : " + secondmax);

	}
	
	
	// move all zeros in an array to the end while maintaining the order of other elements.
	
	public void moveZerostoEnd() {
		int[] arr1 =  {0, 1, 0, 3, 12};
		int countZ =  0;
		
		// The last remaining elements will be automatically zero
		// If to show output is array we have to store into the array
		int[] result = new int[arr1.length];
		int index= 0 ;
		for(int i = 0 ; i < arr1.length ; i++) {
			
			if(arr1[i] != 0) {
				result[index] = arr1[i];
				index++;
			}
			
		
		}
		
		// another loop to print the array as the remaning values will be zero by default
		System.out.println("Printing the zeros at the last of an array : ");
		System.out.print("{ ");
		for(int d = 0 ; d < result.length ; d++) {
			System.out.print(result[d]+ " ");
		}
		System.out.println("}");
		
	}
	
	// control flow problem
	
//	first n Fibonacci numbers using a loop
	
	public void fibonacciSeries() {
		int n = 20 ;
//		we have to print till 20 numbers
		
		int a = 0 ;
		int b = 1; 
		System.out.println("Fibonnacci Series till the value of n : ");
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i = 0 ; i < n ; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b; 
			b = c;
		}
	}
	
	// print pattern
//	1
//	12
//	123
//	1234
//	12345
	
	public void printPattern() {
		int n = 5;
		System.out.println("Printing the Pattern : ");
		for(int i = 1 ; i <= n ; i++) {
			//  the outer loop is for rows
			
			for(int j = 1 ; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	// String questions
	
//	remove duplicate characters from a string
	
	public void removeDuplicateChar() {
		
		String ori = "Programming";
	
		String output = "";
		
		for(int i = 0 ; i < ori.length(); i++) {
			boolean isDuplicate = false;
			char ch = ori.charAt(i);
			for(int j = 0 ; j < i ; j++) {
				
				if(ori.charAt(j) == ch) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}
	
	
}
