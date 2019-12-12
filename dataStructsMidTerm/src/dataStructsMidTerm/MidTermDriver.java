package dataStructsMidTerm;
import java.util.*;


public class MidTermDriver {

	public static void main(String[] args) {
		BagInterface<String> badBag = new LinkedBag<String>();
		badBag.add("snoopy");
		badBag.add("woodstock");
		badBag.add("linus");
		badBag.add("aa");
		badBag.add("zz");
		System.out.println("aa: " + badBag.contains("aa"));
		
		System.out.println("zz: " + badBag.contains("zz"));
		badBag.remove();
		System.out.println("aa: " + badBag.contains("aa"));
		System.out.println("zz: " + badBag.contains("zz"));
		// TODO Auto-generated method stub

	    System.out.println(sumUp(1, 4));
		
	    System.out.println(mystery(3));
	    
	    AList <String> testee = new AList<String>();
	    testee.getInfo();
	    
	    LinkedBag <Integer> baggie1 = new LinkedBag<Integer>();
	    LinkedBag <Integer> baggie2 = new LinkedBag<Integer>();
	    baggie1.getInfo();
	    
	    baggie1.add(20);
	    baggie1.add(37);
	    baggie1.add(45);
	    
	    baggie2.add(13);
	    baggie2.add(29);
	    
//	    swapper(baggie1.firstNode, baggie2.firstNode);
	    
	    
	}
	
    public static void swapper(Node nodeA, Node nodeB) {
        nodeB.next = nodeA.next; 
        nodeA.next = nodeB;
	    } 
	public static int mystery(int n) {
	    if(n < 0) {
	       return n;
	    } else {
	       return n * mystery(n-1);
	    } 
	}	
	public static int sumUp(int n1, int n2) {
	    int sum = n1;
	    if(n1 < n2) {
	       sumUp(n1+1, n2);
	    } 
	    return sum;
	    } 

	private class Node<T extends Comparable> {
		private T data; 
		private Node next; 

		private Node(T dataPortion) {
			data = dataPortion;
			next = null;
		}

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		} 

		private T getData() {
			return data;
		} 

		private void setData(T newData) {
			data = newData;
		} 

		private Node getNextNode() {
			return next;
		} 

		private void setNextNode(Node nextNode) {
			next = nextNode;
		} 
	} // end Node	
	
	}	


