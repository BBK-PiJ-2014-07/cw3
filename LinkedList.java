/** 
Implementation of List interface as linked list of objects. 
*/

public class LinkedList implements List {
	private ListNode head;
	private int listSize;
	
	public LinkedList() {
		listSize = 0;
		head = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	

	public int size(){
		return count(head);
	}

	public int count(ListNode node){
		if (node != null) {
			return 1 + count(node.getNext());
		} else {
			return 0;
		}
	}
	public ReturnObject get(int index){
		if (index < 0 || index >= size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			ListNode thisNode = head;
			for (int i=0; i<index; i++){
				//start at first element and recursively move up
				thisNode = thisNode.getNext();
			}
			ReturnObject thisObj = new ReturnObjectImpl(thisNode.getObject());
			return thisObj;
		}
	}

	public void makeHead(ListNode node){
		head = node;
	}

	public ReturnObject add(Object item) {
		head.addAtEnd(item);
		listSize++;
		return new ReturnObjectImpl(item);
	}

	public ReturnObject add(int index, Object item) {
		ListNode result = null;
		for (int i=0; i<index; i++) {
			result = head.getNext();
		}
		result.addElsewhere(item);
		listSize++;
		return (ReturnObject) result.getNext();
	}

	public ReturnObject remove(int index){
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		//does stuff
	}
}

