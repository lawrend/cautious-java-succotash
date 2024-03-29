//package advJavaMod11HW;
import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class HomeworkM11Streams {

	public static void main(String[] args) throws Exception {

		List<Customer> customerList = new ArrayList<>();
		fillList(customerList);
		
		
		// Q1: How many customers in CA?
		System.out.print("Q1: Should print 20: ");
		
        long caCustomters = customerList.stream()
        		.filter(
        		    customer -> customer.getState().contains("CA")) 
        		.count();
		System.out.println(caCustomters);
		
		// Q2: Create a list of all priority customers in MA.
		System.out.println("\nQ2: Should print \n[ Sasin, Anna (ID:  AS1G) (Priority Customer),  Case, Justin (ID:  JCT1) (Priority Customer)]: ");
		List<Customer> maPriorityList = customerList.stream()
				.filter(
					customer -> customer.getState().contains("MA") &&
					customer.isPriority() == true )
				.collect(Collectors.toList());
		System.out.println(maPriorityList);	

		// Q3: How much money have all customers spent (combined)?
		System.out.print("\nQ3: Should print 330518.0: ");
		double total = customerList.stream()
				.mapToDouble(customer -> customer.getAmountSpent())
				.sum();
		System.out.println(total);
		
		// Q4: How much money have all priority customers spent (combined)?
		System.out.print("\nQ4: Should print 226177.0: ");
		
        double priorityTotal = customerList.stream()
        		.filter(customer -> customer.isPriority() == true)
				.mapToDouble(Customer::getAmountSpent)
				.sum();
		System.out.println(priorityTotal);
		
		// Q5: Create a map of all WY priority customers (key=id, value=customer)
		System.out.println("\nQ5: Should print\n{ PTC8= Turner, Paige (ID:  PTC8) (Priority Customer),  BS20= Seville, Barbara (ID:  BS20) (Priority Customer),  BCG5= Cade, Barry (ID:  BCG5) (Priority Customer),  LK71= King, Leigh (ID:  LK71) (Priority Customer)}");
		
		Map<String, Customer> wyCustomers = customerList.stream()
				.filter(customer -> customer.getState().contains("WY") &&
						customer.isPriority() == true)
				.collect(Collectors.toMap(customer -> customer.getId(), Function.identity()
						));
		System.out.println(wyCustomers);
		
		// Q6: What is the greatest amount of money spent by a NY priority customer?
		System.out.print("\nQ6: Should print 9207.0: ");
		double nyHighAmount = customerList.stream()
				.filter(customer -> customer.getState().contains("NY") &&
						customer.isPriority() == true) 
				.max(Comparator.comparing(Customer::getAmountSpent))
				.get()
				.getAmountSpent(); 
		System.out.println(nyHighAmount);
		
		//Q7: Find all customers that spent > 9000.
        // Print a comma-separated String of all customer IDs for customers that spent > 9000:
        System.out.println("\nQ7: Should print: \nAD62,AS1G,CV62,HW32,JCT1,KA74,OB63,PTC8,WP90");
        
        String highIDList = customerList.stream()
        		.filter(customer -> customer.getAmountSpent() > 9000)
        		.map(Customer::getId)
        		.collect(Collectors.joining(",")
        		);
        System.out.println(highIDList);
        
        
		//Q8: Find any customer that has spent > 9800. 
		// Print the amount spent by the customer. If there is none, nothing should be printed.
		// Note: you can test your code with a lower amount, too, to see something printed.
		System.out.println("\nQ8: Should print nothing: ");
		customerList.stream()
		.filter(customer -> customer.getAmountSpent() > 9800)
		.map(Customer::getAmountSpent)
		.forEach(System.out::println);
		
		// Q9: Find the sum of the numbers represented in an String array.
		String[] numWords = {"1", "2", "3", "4", "5", "6"};
		int sum = Arrays.stream(numWords)
				.mapToInt(num -> Integer.parseInt(num))
				.sum();
		System.out.println("\nQ9: Sum is 21: " + sum);
		
		// Q10: Create a String of the numbers represented in the array, separated by semicolons.
		Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String concat = Arrays.stream(nums)
				.map(num -> num.toString())
        		.collect(Collectors.joining(";"));
		System.out.println("\nQ10: Should print: \n1;2;3;4;5;6;7;8;9;10 \n" + concat);
		
		// Q11: Create an infinite stream of random integers in the range 1-100.
		// Keep only the numbers that are multiples of 3.
		// Print the first 10 of these numbers.
		System.out.println("\nQ11: Will print 10 numbers that are multiples of 3 between 1-100:");
		Random r = new Random();
		r.ints(1, 101)
		.filter(n -> n%3 == 0)
		.limit(10)
		.forEach(System.out::println);
		
		// Q12: Print the top 9-highest-scoring scrabble word in the list.
		// Note: a method is provided below to convert from char to score.
		// Hint: you might consider writing another method to find the score of a word!
		List<String> scrabbleWords = Files.readAllLines(Paths.get("words.txt"), Charset.forName("Cp1252"));
		
	
		System.out.println("\nQ12 Should print: " + "\n\tpizzazz worth 45 points"+"\n\tpizazz worth 35 points" +"\n\tjazzily worth 35 points" +
				"\n\tquizzed worth 35 points" + "\n\tjacuzzi worth 34 points" + "\n\tquizzer worth 34 points" +
				"\n\tquizzes worth 34 points" + "\n\tjazzy worth 33 points" + "\n\tjazzing worth 33 points" ); 
		scrabbleWords.stream()
		.sorted(Comparator.comparing(e -> scoreWord(e), Comparator.reverseOrder()))
		.limit(9)
		.forEach(wrd -> System.out.println( "\t" + wrd + " worth " + scoreWord(wrd) + " points"));
		
		// EXTRA CREDIT

		//EXTRA CREDIT//
		//Find the 10 highest-scoring 4-letter Scrabble words that do NOT contain the letter "z"
		
        scrabbleWords.stream()
        .filter(str -> str.length() == 4 && 
        str.indexOf("z") == -1)
		.sorted(Comparator.comparing(e -> scoreWord(e), Comparator.reverseOrder()))
		.limit(10)
		.forEach(wrd -> System.out.println( "\t" + wrd + " worth " + scoreWord(wrd) + " points"));
}
    public static int scoreWord(String word) {
			int returnSum = 0;
			for(int i = 0; i < word.length(); i++)
			{
				returnSum += charToScore(word.charAt(i));
			}
			return returnSum;
		};
		
	
	private static int charToScore(char c) {
		switch (c) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'n': case 'r': case 't': case 'l': case 's':
				return 1;
			case 'g': case 'd': 
				return 2;
			case 'b': case 'c': case 'm': case 'p': 
				return 3;	
			case 'f': case 'h': case 'v': case 'w': case 'y':
				return 4;	
			case 'k': 
				return 5;
			case 'j': case 'x': 
				return 8;
			case 'q': case 'z': 
				return 10;		
			default:
				return -1;
		}
	}
	
	private static void fillList(List<Customer> list) {
		try (Scanner fileScan = new Scanner(
				new FileReader(new File("Customers.csv")))) {
		
			while(fileScan.hasNext()) {
				String line = fileScan.nextLine();
				Scanner lineScan = new Scanner(line);
				lineScan.useDelimiter(",");
				String firstName = lineScan.next();
				String lastName = lineScan.next();
				String id = lineScan.next();
				String state = lineScan.next();
				boolean priority = Boolean.parseBoolean(lineScan.next());
				double amount = Double.parseDouble(lineScan.next());
				Customer c = new Customer(firstName, lastName, id, state, priority, amount);
				list.add(c);
			}
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
}
