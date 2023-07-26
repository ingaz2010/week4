// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		String numbers = "";
		for(int i= 0; i < 10; i++) {
			if(i==9) {
				sb.append(i);	
			} else {
				sb.append(i);
				sb.append("-");
			}
		}
		
			System.out.println(sb.toString());
	

		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
			List<String> furniture = new ArrayList<String>();
			furniture.add("table");
			furniture.add("chair");
			furniture.add("sofa");
			furniture.add("bed");
			furniture.add("closet");
			

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
			System.out.println(ShortestString(furniture));

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
			System.out.println("Original list: ");
			for (String word : furniture) {
				System.out.println(word);
			}
			firstAndLastSwitched(furniture);
			System.out.println("List after first and last strings replaced");
			for(String word : furniture){
				System.out.println(word);
			}
			

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
			System.out.println(concat(furniture));
			

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
			List <String> l = search(furniture, "a");
			for(String word: l) {
				System.out.println(word);}
			

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
			List <Integer> num = new ArrayList();
			num.add(1);
			num.add(2);
			num.add(3);
			num.add(4);
			num.add(5);
			num.add(7);
			List resultNum = multipleLists(num);
			System.out.println(resultNum.toString());

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
			System.out.println(countLetters(furniture).toString());


		
		// 9. Create a set of strings and add 5 values
			Set<String> names = new HashSet<String>();
			names.add("Amy");
			names.add("Emily");
			names.add("Sally");
			names.add("Anna");
			names.add("Maria");
			names.add("Amy");
			

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
			System.out.println(startsWithLetter(names, 'A').toString());


		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
			System.out.println(returnList(names).toString());
			
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
			Set<Integer> setOfNumbers = new HashSet<Integer>();
			setOfNumbers.add(1);
			setOfNumbers.add(2);
			setOfNumbers.add(3);
			setOfNumbers.add(4);
			setOfNumbers.add(5);
			setOfNumbers.add(6);
			setOfNumbers.add(7);
			System.out.println(getEvenNumbers(setOfNumbers).toString());
			

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
			Map<String, String> dictionary = new HashMap<String, String>();
			dictionary.put("acoustic", "pertaining to the sense or organs of hearing, to sound, or to the science of sound");
			dictionary.put("actinin", "a contractile protein of muscle.");
			dictionary.put("acquire", "to come into possession or ownership of; get as one's own:");

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
			System.out.println(searchKey(dictionary, "aacquire").toString());
			String value = searchKey(dictionary, "acquire");
			System.out.println(value);

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
			System.out.println(countWords(furniture).toString());
		

	}
	
	
	// Method 15:
	public static Map<Character, Integer> countWords(List<String> list){
		Map<Character, Integer> startsWith = new HashMap<Character, Integer>();
		//int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(startsWith.get(list.get(i).charAt(0))==null) {
			startsWith.put(list.get(i).charAt(0), 1);
			} else {
			int count = list.get(i).charAt(0);
			startsWith.put(list.get(i).charAt(0), startsWith.get(++count));
		}
		}
		return startsWith;
	}
	
	
	
	// Method 14:
	public static String searchKey (Map<String, String> dict, String str){
		for(String key : dict.keySet()) {
			if(key.equalsIgnoreCase(str)) {
				return dict.get(key);
			}
		}
		return "";
	}
	

	
	// Method 12:
	public static Set<Integer> getEvenNumbers(Set<Integer> numbers){
		Set<Integer> evenNumbers = new HashSet<Integer>();
		for(Integer number : numbers) {
			if(number%2 ==0) {
				evenNumbers.add(number);
			}
		}
		return evenNumbers;
	}

	
	// Method 11:
	public static List<String> returnList(Set<String> list){
		List<String> result = new ArrayList<String>();
		for(String word : list) {
			result.add(word);
		}
		return result;
	}
	


	// Method 10:
	public static Set<String> startsWithLetter(Set<String> list, char c){
		Set<String> result = new HashSet<String>();
		for(String word : list) {
			if (word.charAt(0)==c) {
				result.add(word);
			}
		}
		return result;
	}
	

	
	// Method 8:
	public static List<Integer> countLetters (List<String> list){
		List<Integer> number = new ArrayList<Integer>();
		for(String word : list) {
			number.add(word.length());	
		}
		return number;
	}
	

	
	// Method 7:
	public static List<List<Integer>> multipleLists(List<Integer> list){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		result.add(new ArrayList<Integer>());
		result.add(new ArrayList<Integer>());
		result.add(new ArrayList<Integer>());
		for(Integer i : list) {
			if(i%2 == 0) {
				result.get(0).add(i);
			}
			if(i% 3 == 0) {
				result.get(1).add(i);
			}
			if(i%5 == 0) {
				result.get(2).add(i);
			}
			else if(i%2!=0 && i%3 !=0){
				result.get(3).add(i);
			}
		}
		return result;
	}
	

	
	// Method 6:
	public static List<String> search(List<String> list, String s){
		List<String> result = new ArrayList<String>();
		for(String word : list) {
			if(word.contains(s)) {
				result.add(word);
			}
		}
		return result;
		
	}
	

	
	// Method 5:
	public static String concat(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if(i != list.size()-1) {
			sb.append(',');
			sb.append(' ');
		}}
		return sb.toString();	}
	
	
	
	// Method 4:
	public static List <String> firstAndLastSwitched(List <String> list){
		String first = list.get(0);
		//String last = list.get(list.size()-1);
		//list.remove(0);
		//list.add(0, last);
		//list.add(first);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, first);
		return list;
	}
	
	
	
	// Method 3:
	public static String ShortestString(List s) {
		String ShortestStr = s.get(0).toString();
		for(int i = 1; i < s.size(); i++) {
			String currentString = s.get(i).toString();
			
			if(ShortestStr.length()> currentString.length()) {
				ShortestStr = currentString;
			}
		}
		return ShortestStr.toString();
	}
	
	

}