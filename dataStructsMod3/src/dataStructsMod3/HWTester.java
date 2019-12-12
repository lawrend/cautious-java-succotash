package dataStructsMod3;
import java.util.*;

public class HWTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> wordList = new ArrayList<String>();
		wordList.add("cat");
		wordList.add("dog");
		wordList.add("parrot");
		wordList.add(2, "can");
		wordList.add(4, "snake");
		
		for(String word : wordList) {
			System.out.println(word);
		}
		
		BagInterface<String> wordBag = new ArrayBag<String>();
		wordBag.add("choco");
		wordBag.add("vanil");
		wordBag.add("straw");
		wordBag.add("hazelnut");
		wordBag.add("choco");
	
		System.out.println(wordBag.getCurrentSize());
		
        ListInterface<String> animalList = new AList<String>();
		
		System.out.println(animalList.isEmpty());
		animalList.add("alligator");
		animalList.add("bear");
		animalList.add("cat");
		animalList.add("dog");
		animalList.add("lemur");
		animalList.add(3, "elephant");
		animalList.add(1, "koala");
		animalList.add("dog");	
	
		System.out.println(animalList.getLength());

        ListInterface<String> hwList = new AList<String>();
        hwList.add("apple");
        hwList.add("banana");
        hwList.add("cat");
        hwList.add("cat");
        hwList.add("dog");
        
        createWordListContainChar(hwList, 'a');
        
       
	}
        public static ListInterface<String> createWordListContainChar(ListInterface<String> wordList, char key) {
        	ListInterface<String> copyList = new AList<String>();
        	
        	for(int i = 1; i<wordList.getLength; i++) {
        		
        	System.out.println(wordList[i]);
        	}
        	return wordList;
        }
        
}
