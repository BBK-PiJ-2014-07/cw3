/** 
* An implementation of FunctionalList that extends LinkedList. 
*/

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	public FunctionalLinkedList(){
		super();
	}

	public ReturnObject head(){
		//do 
		if (getHead() == null) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(getHead().getObject());	
		}
	}

	public FunctionalList rest(){
		FunctionalLinkedList newList = new FunctionalLinkedList();
		if (getHead() != null){
			//Copy all the nodes that follow the head into a new list
			ListNode thisNode = getHead();
			for (int i=0; i<this.size()-1; i++){
				newList.add(thisNode.getNext().getObject());
				thisNode = thisNode.getNext();
			}
		}
		return newList;
	} 
}

