/** 
Implementation of List interface as linked list of objects. 
*/

public class LinkedList implements List {
	private Object head;
	private int size;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	public boolean isEmpty() {
		if (index=0) {
			return true;
		} else {
			return false;
		}
	}
	

	public int size(){
		int result = 0;
		if (this.getNext().equals(null)){
			return result;
		} else {
			result++;
			this.getNext().size();
		}
	}
	/**
	requires a Node with getNext method - is there a better way to do this? 
	*/

	public ReturnObject get(int index){
		if (index < 0 || list >= size) {
			return new Object(null);
		} else {
			ReturnObject thisObj = head;
			for (int i=0; i<index; i++){
				//start at first element and recursively move up
				thisNode = this.getNext();
			}
			return thisObj;
		}
	}

	//add() in both its implementations
}

