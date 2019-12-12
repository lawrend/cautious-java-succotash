
import java.util.*;	

public class Mod3HW {

	public static void main(String[] args) {
		
	    /*
		Random generator = new Random(); 
		float f = generator.nextFloat();
		System.out.println(num);
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);

		System.out.println(numbers.size());
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
		   int number = iterator.next();
		   if(number%2==0) {
		      iterator.remove();
		   }
		}
		System.out.println(numbers.size());
		int[] a = {2,1,3,2,4, 6, 3, 4, 4, };
		
		int[] b = {4,5,6};
		int c = 6;
		double val = calculateAverage(a, c);
		System.out.println(val);
		
		ArrayList<Integer> intList= new ArrayList<Integer>();
		intList.add(4);
		intList.add(7);
		intList.add(9);
		intList.add(1,3);
		
		System.out.println(intList);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("apple");
		strList.add("banana");
		
		System.out.println(strList);
		
		int[]numberOfVacay = {2, 3, 4, 5, 6};
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		numberOfVacay[x] += y;
		System.out.println(numberOfVacay[x]);
	    int[] scores = new int[100];
	    int[] kooky = {2,3,5,7,11};
	    System.out.println(Arrays.toString(kooky));
	    int[] nums = new int[6];
	    for (int i = 0; i <= 5; i++) {
		    System.out.println(nums[i]);
	    }
	    char[] letters = {'b', 'y', 'e'};
	    for (int i=0; i<letters.length; i++) {
	    	System.out.print(letters[i] + "-");
	    }
	    
	    */
	}
	public static int[] generateRandomArray(int size, int lower, int upper, boolean inclusive) {
		Random randomMaker = new Random();
		int[] returnVal = new int[1];
		int randoNum = randomMaker.nextInt(upper);
		returnVal[0] = randoNum;
		System.out.println(returnVal);
		return returnVal;
	}	
	
	public static int method(ArrayList<Integer> list) {
		int value = 0;
		for(Integer i : list) {
			value ++;
		}
		System.out.println(value);
		return value;
	}
	public static void switchThem(int[] first, int[] second) {
			int[] temp = first;
			first = second;
			second = temp;
			System.out.println(first[0]);
		}
	
	public static double calculateAverage(int[] nums, int numElements) {
		   int total = 0;
		   for(int i=0; i<numElements; i++) {
		      total += nums[i];
		   }
		   double average = total / numElements;
		   return average;
		}	
}
