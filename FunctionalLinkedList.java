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
		//do
		return new FunctionalLinkedList();
	} 
}
