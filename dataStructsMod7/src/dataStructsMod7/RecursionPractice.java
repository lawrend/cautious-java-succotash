package dataStructsMod7;
import java.util.*;

public class RecursionPractice {

	public static void main(String[] args) {
		
		int[] test = new int[]{1, 0, 2, 4, 4, 2, 3, 3, 4};
			
		System.out.println(qNotFollowedByU("is this going qt work"));
//		vowelFinder("teaster");
//		System.out.println(methodA(-3));
//		System.out.println(methodB("hello there", 'h'));
//      System.out.println(countEvens(test));
//		System.out.println(countZeros(test));
//		reverseArray(test);
	}
	
		
    public static boolean qNotFollowedByU(String word) {
    	int maxIndex = word.length() - 1;
    	return qNotFollowedByUHelper(maxIndex, word);
    }
    
    public static boolean qNotFollowedByUHelper(String word, int start, int stop) {
    	if(start<=stop) {
    		return qChecker(word.charAt(start));
    	}
    }
    
    
    private static boolean qChecker(char possibleQ) {
    	return possibleQ == 'q';
    	
//    	if(str.charAt(index) == 'q') {
//    		return true;
//    	} else {
//    		return false;
//    	}
    }
    
    private static boolean notQChecker(int index, String str) {
    	if(str.charAt(index) != 'u' ){
    			return true;
    	} else {
    		return false;
    	}
    }
    
    
    
  //////////**********//////////
    
	public static int countEvens(int[] array) {
		   return countEvensHelper(array, 0, array.length);
		}

		private static int countEvensHelper(int[] array, int start, int stop) {
		   int count = 0;
		   if(start==stop) {
		      return count;
		   } else {
		      if(array[start] % 2 == 0) {
		         count = 1 + countEvensHelper(array, start+1, stop);
		      }
		      return count;
		   }
		}
		
public static void reverseArray(int[] array){
    	   swapFromEndsHelper(array, 0, array.length -1);
    }

    public static void swapFromEndsHelper(int[] array, int b, int e){
        if(b<e){//Swap
    	       int tmp = array[b];
    	       array[b] = array[e];
    	       array[e] = tmp;
    	       swapFromEndsHelper(array, ++b, --e);//Recursive
    	       System.out.println("after code");
    	    }   
    	}

	public static void vowelFinder(String string) {
		int strlen = string.length()-1;
		if (strlen >= 0) {
			if(
			(string.charAt(strlen) == 'a') ||
			(string.charAt(strlen) == 'e') ||
			(string.charAt(strlen) == 'i') ||
			(string.charAt(strlen) == 'o') ||
			(string.charAt(strlen) == 'u') 
			)
		{
		  System.out.println(Integer.toString(strlen) + Character.toUpperCase(string.charAt(strlen)));
		  vowelFinder(string.substring(0, strlen)); 
		} else {
			vowelFinder(string.substring(0, strlen)); 
		}
			
		}
	}
	
	public static int methodA(int n) {
		   if(n==0) {
		      return 0;
		   } else if(n>0) {
		      return 1 + methodA(n-1);
		   } else {
		      return 1 + methodA(n+1);
		   }
		}	
	
	public static int methodB(String s, char c) {
		   if(s.length()==0) {
		      return 0;
		   } else {
		      return (s.charAt(0)==c ? 1 : 0) + methodB(s.substring(1), c);
		   }
		}	
	
	public static int countZeros(int[] array) {
		 return countZerosHelper(array, 0, array.length, 0);
		}

		private static int countZerosHelper(int[] array, int start, int stop, int count) {
		 if(start < stop) {
		 if(array[start] == 0) {
		 count++;
		 }
		 countZerosHelper(array, start+1, stop, count);
		 }
		 return count;
		}
}
