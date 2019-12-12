import java.util.*;

public class HomeworkM3Driver {

	public static void main(String[] args) {
/*
		System.out.println("*****TESTING RANDOM NUMBER ARRAY GENERATOR***");
		System.out.println("Note: run some of these tests multiple times since they involve random numbers.");
		int[] array = generateRandomArray(10, 1, 100, true);
		System.out.println("Size 10: " + array.length + "\t" +	"Contents should be between 1 and 100, inclusive.\n\t" + Arrays.toString(array));
		
		array = generateRandomArray(5, 1, 10, false);
		System.out.println("Size 5: " + array.length + "\t" + "Contents should be between 1 and 10, with the upper bound exclusive, meaning between 1 and 9 inclusive.\n\t" + Arrays.toString(array));
		
		array = generateRandomArray(15, 1, 5, true);
		System.out.println("Size 15: " + array.length + "\t" + "Contents should be between 1 and 5, inclusive.\n\t" + Arrays.toString(array));
		
		array = generateRandomArray(15, 1, 5, false);
		System.out.println("Size 15: " + array.length + "\t" + "Contents should be between 1 and 5, with the upper bound exclusive, meaning between 1 and 4, inclusive.\n\t" + Arrays.toString(array));

		
		array = generateRandomArray(15, 1, 2, false);
		System.out.println("Size 15: " + array.length + "\t" +	"Contents should be only the number 1.\n\t" + Arrays.toString(array));
		
		array = generateRandomArray(15, 1, 1, true);
		System.out.println("Size 15: " + array.length + "\t" + 	"Contents should be only the number 1.\n\t" + Arrays.toString(array));

		array = generateRandomArray(10, 4, 3, true);
		System.out.println("Should print null (without crashing): " + array);

		array = generateRandomArray(10, 4, 4, false);
		System.out.println("Should print null (without crashing): " + array);
		
		array = generateRandomArray(10, 4, 2, false);
		System.out.println("Should print null (without crashing): " + array);
		
		array = generateRandomArray(-1, 4, 14, true);
		System.out.println("Should print null (without crashing): " + array);
		
	
		
		System.out.println("\n\n*****TESTING ARRAY COPY AND EXPAND***");
		String[] words1 = {"a", "b", "c"}; 
		words1 = copyToEndAndExpand(words1);
		System.out.println("Array holds \t[null, null, null, a, b, c]");
		System.out.println("\t\t" + Arrays.toString(words1));

		String[] words2 = new String[1];
		words2[0] = "hi";
		words2 = copyToEndAndExpand(words2);
		System.out.println("Array holds \t[null, hi]");
		System.out.println("\t\t" + Arrays.toString(words2));	
		
		String[] words3 = {"apple", "cat", "dog", "banana"};
		String[] moreWords = copyToEndAndExpand(words3);
		System.out.println("Original array holds \t[apple, cat, dog, banana]");
		System.out.println("\t\t\t" + Arrays.toString(words3));
		System.out.println("New array holds \t[null, null, null, null, apple, cat, dog, banana]");
		System.out.println("\t\t\t" + Arrays.toString(moreWords));
		
*/
		System.out.println("\n\n*****TESTING THE METHOD TO CREATE A LIST OF WORDS THAT DON'T START WITH A CHARACTER OR DIGIT***");
		ArrayList<String> wordList = new ArrayList<>(List.of("hello!", "?what", "email@com", "#javarules", "3blindmice", "&more"));
		ArrayList<String> wordsNotStartingWithCharDigit = createListNonCharacterDigitWords(wordList);
		System.out.println("List holds \t[?what, #javarules, &more]" + "\n\t\t" + createListNonCharacterDigitWords(wordList));

		wordList = new ArrayList<>(List.of("no!", "answers?", "found#here", "4sure"));
		wordsNotStartingWithCharDigit = createListNonCharacterDigitWords(wordList);
		System.out.println("List holds \t[]" + "\n\t\t" + wordsNotStartingWithCharDigit);
		
		wordList = new ArrayList<>(List.of("$money", "^carrot", "(parens", ")parensclose", "\ttab"));
		wordsNotStartingWithCharDigit = createListNonCharacterDigitWords(wordList);
		System.out.println("List holds \t[$money, ^carrot, (parens, )parensclose, 	tab]" + "\n\t\t" + wordsNotStartingWithCharDigit);
		
		ArrayList<String> userArray = new ArrayList<String>();
	    System.out.println("How many words are in your list?");
		Scanner scan = new Scanner(System.in);
		int listSize = Integer.parseInt(scan.nextLine());
		for(int num = 0; num<listSize; num++) {
			System.out.println("What is word number " + (num + 1) + "?");
			String listWord = scan.nextLine();
			userArray.add(listWord);
		}
		Collections.sort(userArray);
		System.out.println("Here is your sorted list: " + userArray + "\n");
		System.out.println("Here are the list elements that do not begin with a letter nor a number: " + createListNonCharacterDigitWords(userArray));
		scan.close();
		
		
	

	}
/*	
	public static int[] generateRandomArray(int size, int lower, int upper, boolean inclusive) {
		// YOUR CODE HERE
		return null; // remove this line- it is here only to prevent compiler errors
	}

	public static String[] copyToEndAndExpand(String[] array) {
		// YOUR CODE HERE
		return null; // remove this line- it is here only to prevent compiler errors
	}
*/
	public static ArrayList<String> createListNonCharacterDigitWords(ArrayList<String> words) {
		ArrayList<String> quirkyWords = new ArrayList<String>();
		for(int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			char firstLetter = word.charAt(0);
			boolean isNotLetterOrDigit = !Character.isLetterOrDigit(firstLetter);
			if(isNotLetterOrDigit == true) {
				quirkyWords.add(word);
			}
		}
		return quirkyWords; 
	}

	
}
