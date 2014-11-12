/** 
* Implementation of ImprovedStack based on @List
*/

public class ImprovedStackImpl implements ImprovedStack {
	private Stack internalStack;

	public ImprovedStackImpl(List list){
		internalStack = new StackImpl(list);
	}

	public void push(Object item){
		internalStack.push(item);
	}

	public ReturnObject pop(){
		return internalStack.pop();
	}

	public ReturnObject top(){
		return internalStack.top();
	}

	public boolean isEmpty(){
		return internalStack.isEmpty();
	}

	public int size(){
		return internalStack.size();
	}

	public ImprovedStack reverse(){
		int size = internalStack.size();
		ImprovedStack newStack = new ImprovedStackImpl(new LinkedList());
		for (int i=0; i<size; i++) {
			newStack.push(internalStack.pop().getReturnValue());
		}
		//get the head of the internalList contained within internalStack, as it can't be removed
		newStack.push(internalStack.top().getReturnValue());
		return newStack;
	}

	/**
	 * Removes the given object from the stack if it is
	 * there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to
	 * check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */
	public void remove(Object object){
		int intStackSize = internalStack.size();
		ImprovedStack tempStack = new ImprovedStackImpl(new LinkedList());
		//iterate through internalStack transferring each object that DOESN'T equal the argument to a temporary stack
		for (int i=0; i<intStackSize; i++){
			if (internalStack.top().getReturnValue().equals(object)){
				internalStack.pop();
			} else {
				tempStack.push(internalStack.pop().getReturnValue());
			}
		}
		//then check if the head of internalStack contains the argument - if not, transfer that too 
		
		//empty the internalStack
		internalStack = new ImprovedStackImpl(new LinkedList());
		int tempSize = tempStack.size();
		for (int i=0; i<tempSize; i++){
			//put all the objects in tempStack back on internalStack
			internalStack.push(tempStack.pop().getReturnValue());
		}
		//then put the last object on, which is the head of tempStack
		//internalStack.push(tempStack.top().getReturnValue());
	}
}