//package dataStructsProjC;
public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

	private Node head, tail;
	
	
	public LinkedHeadTailList(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}
	public LinkedHeadTailList() {
	}
	
	public void addFront(T newEntry) {
		Node newNode = new Node(newEntry, head);
		head = newNode;
		if(tail == null) {
			tail = head;
		}
	}	
	public void addBack(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if(size() == 0) {
			addFront(newEntry);
		} else if(size() == 1) {
			head.next = newNode;
			tail = newNode;
		} else {
		  tail.next = newNode;
		  tail = newNode;
		}
	}
	
	public T removeFront() {
		if(size() != 0) {
			T retVal = head.data;
			if(size() > 1) {
				head = head.next;
			} else {
				clear();
			}
			return retVal;
		} else {
		  return null;
		}
	}
	
	public T removeBack() {
		if(tail == null) {
			return null;
		} else if(size() == 1) {
			T retVal = head.data;
			clear();
			return retVal;
		} else {
			Node current = head;
			while(current.next.next != null) {
				current = current.next;
		    }
			T retVal = current.next.data;
			current.next = null;
			tail = current;
			return retVal;
	    }
	}
	
	public void clear() {
		head = null;
		tail = null;
	}
	
	public T getEntry(int givenPosition) {
		if(head == null || givenPosition >= size() || givenPosition < 0) {
			return null;
		} else {
			Node current = head;
			int posMatch = 0;
			while(posMatch < givenPosition) {
				current = current.next;
				posMatch++;
			}
		return current.data;
		}
	}
	
	public void display() {
		if(size() == 0) {
			System.out.println("[]");
		} else {
			  Node current = head;
			  System.out.print("[");
			  while(current.next != null) {
				System.out.print(current.data + ", ");
				current = current.next;
		  }
		  System.out.println(current.data + "] \thead=" + head.data + " tail=" + tail.data);
		}
	}
   
		
  public int indexOf(T anEntry) {
	  int retVal = -1; 
	  boolean found = false;	  Node current = head;
	  if(size() == 0) {
		  return retVal;
	  } else {
		  int valIndex = 0;
		  while (!found && (current!= null)) {
		    if (anEntry.equals(current.data)) {
			  found = true;
			  retVal = valIndex;
			} else {				current= current.next;
				valIndex ++;		} 
		  } 	  }
		return retVal;
	}
	
	public int lastIndexOf(T anEntry) {
		int retVal = -1; 
	    Node current = head;
	    if(size() == 0) {
		    return retVal;
	    } else {
		  int valIndex = 0;
		  while (current!= null && valIndex < size()) {
		    if (anEntry.equals(current.data)) {
			    retVal = valIndex;
		    	valIndex++;
		    	current = current.next;
			} else {				current= current.next;
				valIndex ++;		    } 
		} 	  }
		return retVal;
	}
	
	public boolean contains(T anEntry) {
		boolean found = false;		if(size() != 0) { 
		  Node current= head;		  while (!found && (current!= null)) {			if (anEntry.equals(current.data)) {				found = true;			} else {				current= current.next;			}		  } 
		}		return found;	} 	
	public int size() {
		Node currentNode = this.head;
		if(currentNode == null) {
			return 0;
		} else {
			int counter = 0;
			while(currentNode != null) {
				counter ++;
				currentNode = currentNode.next;
			}
			return counter;
		}
	}
	
	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		} else {
			return false;
		}
	}
	


	private class Node {
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
	} 
}
