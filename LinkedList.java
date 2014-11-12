/** 
* Implementation of List interface as linked list of Object-containing ListNodes. 
*/

public class LinkedList implements List {
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void makeHead(ListNode node){
		head = node;
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
			return new ReturnObjectImpl(moveUpList(index).getObject());
		}
	}

	public ListNode moveUpList(int index){
		ListNode thisNode = head;
		for (int i=0; i<index; i++){
			//start at first element and recursively move up
			thisNode = thisNode.getNext();
		}
		return thisNode;
	}

	public ReturnObject add(Object item) {
		if (head == null){
			makeHead(new ListNode(item));
		} else {
			head.addAtEnd(item);
		}
		return new ReturnObjectImpl(item);

	}

	public ReturnObject add(int index, Object item) {
		if (item != null) {
			if (index < 0 || index > size()) {
					return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
				} else {
					if (head == null && index == 0) {
						makeHead(new ListNode(item));
						return new ReturnObjectImpl(head.getObject());
					} else if (head != null && index > 0) {
						return new ReturnObjectImpl(moveUpList(index-1).addElsewhere(item));
					} else {
						return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
					}
				}
		} else {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
	}

	public ReturnObject remove(int index){
		if (index <= 0 || index >= size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {				
			//pass index into moveUpList but minus 1 because previous node's "next" needs to be reassigned
			return new ReturnObjectImpl(moveUpList(index-1).remove());
		}
	}

	public ListNode getHead(){
		return head;
	}
}

