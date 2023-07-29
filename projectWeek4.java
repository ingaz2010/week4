package week04;


public class projectWeek4 {
	public static void main(String[] args) {
		
		/*1. Create an array of int called ages that contains the following values: 
		 * 3, 9, 23, 64, 2, 8, 28, 93.
		a. Programmatically subtract the value of the first element in the array from the value 
		in the last element of the array (i.e. do not use ages[7] in your code). Print the result 
		to the console.  

		b. Create a new array with 9 elements (one more than the ages array) 
		 Repeat the step above to ensure it is dynamic (works for arrays of different lengths).

		c. Use a loop to iterate through the array and calculate the average age. 
		Print the result to the console. */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = lastMinusFirst(ages); //calling the method for subtraction and saving as result variable
		System.out.println(result);
		
		int[] numbers = {5, 26, 45, 37, 31, 68, 2, 19, 115};
		result = lastMinusFirst(numbers);
		System.out.println(result);
		
		int sum = 0;
		for(int age : ages) {   //use for loop to get the sum of all values in the list
			sum +=age;
		}
		int averageAge = sum / ages.length; //divide sum by number of values and save it in variable
		System.out.println("Average age: " + averageAge);     //print out the result

		/*2. Create an array of String called names that contains the following values: 
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		a. Use a loop to iterate through the array and calculate the average number of letters 
		per name. Print the result to the console.

		b. Use a loop to iterate through the array again and concatenate all the names together,
		 separated by spaces, and print the result to the console. */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalNumberOfLetters = 0;
		for( String name : names) {            // for loop to find the number of letters in all names
			totalNumberOfLetters += name.length();
		}
		int averageNumberOfLetters = totalNumberOfLetters / names.length;  //calculating average
		System.out.println("Average number of letters in array names is : " + averageNumberOfLetters);
		
		String namesTogether = "";
		for (String name : names) {
			namesTogether += name;    //add new name on every loop
			namesTogether +=" ";      //add space after the name;
		}
		System.out.println("Names concatanated: " + namesTogether);

		
		/*3. How do you access the last element of any array?
		 * Since arrays are 0 based, then the last element will be the number of values in the 
		 * array - 1. It can be accessed by calculating index the following way: 
		 * getting the length of the array and subtracting 1 from it.
		 * For example array ages:
		 * int lastElement = ages[ages.length - 1];
		 */
		System.out.println("Last element in array ages: " + ages[ages.length - 1]);
		 

		/*4. How do you access the first element of any array? 
		 * Arrays are 0 based, so the first element can be accessed at index 0.
		 * For example array ages:
		 * int firstElement = ages[0];
		 */
		System.out.println("First element in array ages: " + ages[0]);

		/*5. Create a new array of int called nameLengths. 
		 * Write a loop to iterate over the previously created names array and add the length
		 * of each name to the nameLengths array.
		 */
		int [] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.print("nameLengths array: ");
		for(int num : nameLengths) {
			System.out.print(num + " ");    //print out nameLengths array
		}
		System.out.println();

		
		/*6. Write a loop to iterate over the nameLengths array and calculate the sum of 
		 * all the elements in the array. Print the result to the console.
		 */
		int sumOfNameLengths = 0;
		for (int num : nameLengths) {
			sumOfNameLengths += num;
		}
		System.out.println("The sum of elements in nameLengths array is: " + sumOfNameLengths);

		/*7. Write a method that takes a String, word, and an int, n, as arguments and returns 
		 * the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
		 * I expect the method to return “HelloHelloHello”).
		 */
		System.out.println(concateWord("Hello", 3));
		

		/*8. Write a method that takes two Strings, firstName and lastName, and returns 
		 * a full name (the full name should be the first and the last name as a String 
		 * separated by a space).
		 */
		System.out.println("Full name: " + fullName("Jane", "Smith"));

		/*9. Write a method that takes an array of int and returns true if the sum of all the ints 
		 * in the array is greater than 100.
		 */
		System.out.println(sumIsGreater100(numbers));

		/*10. Write a method that takes an array of double and returns the average of all 
		 * the elements in the array.
		 */
		double[] arr = {2.1, 5.4, 7.5, 9.7};
		System.out.println("Average for array of double: " + doubleAverage(arr));

		/*11. Write a method that takes two arrays of double and returns true if the average 
		 * of the elements in the first array is greater than the average of the elements in 
		 * the second array.
		 */
		double [] arr2 = {0.5, 1.7, 0.85, 2.1};
		double [] arr3 = {10.5, 11.3, 7.8, 13.9};
		System.out.println("Arr is greater than arr2: " + compareTwoDoubleArrays(arr, arr2));
		System.out.println("Arr is greater than arr3: " + compareTwoDoubleArrays(arr, arr3));
		

		/*12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
		 * moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater 
		 * than 10.50.
		 */
		System.out.println("Buy Drink? " + willBuyDrink(true, 11.00));
		System.out.println("Buy Drink? " + willBuyDrink(false, 12.50));
		System.out.println("Buy Drink? " + willBuyDrink(true, 10.00));

		/*13. Create a method of your own that solves a problem. In comments, write what 
		 * the method does and why you created it.*/
		findWord(names, "Bob");
		int index = findWord(names, "Bob"); //saving index of found element into a variable
		System.out.println(index);          //accessing the variable with found index
		
		
	}
	public static int lastMinusFirst(int[] array) {     //Problem 1
		return array[array.length -1] - array[0];
	}
	
	public static String concateWord (String str, int num ) { //Problem 7
		String result = "";
		for(int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
	public static String fullName(String firstName, String lastName) {  //Problem 8
		return firstName + " " + lastName;
	}
	
	public static boolean sumIsGreater100 (int[] num) {  //Problem 9
		int sum = 0;
		for(int n : num) {
			sum += n;
		}
		return sum > 100;
	}
	
	public static double doubleAverage(double[] arr) {    //Problem 10
		double sum = 0;
		for(double num : arr) {
			sum +=num;
		}
		double lengthArr = arr.length;
		return sum / lengthArr;
	}
	
	public static boolean compareTwoDoubleArrays(double[] arr1, double[] arr2) { //Problem 11
		double average1 = doubleAverage(arr1);
		double average2 = doubleAverage(arr2);
		return average1 > average2;
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) { //Problem 12
		if(moneyInPocket > 10.50) {
			return isHotOutside;
		}else {
			return false;
		}
	}
	public static int findWord(String[] arr, String userWord) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equalsIgnoreCase(userWord)) {
				System.out.println(userWord + " is found at index " + i);
				return i;
				
			} 
	}
		System.out.println(userWord + " is not found");
		return -1;
	
}
	/* findWord method takes array of strings and a single string as input and searches for
	 * the single string in the array using for loop. if found, it returns index of the found 
	 * element and prints out the position, if not, it returns -1 and prints out message 
	 * to the user that the element was not found. This method is used a lot when we need to find 
	 * an element in the array for future reference or further actions.Since this method returns
	 * index of the element, it allows us to save it in variable if future access required
	 * in the program and we do not need to search it every time we need it.
	 */
}

