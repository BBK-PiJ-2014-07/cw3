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
		ImprovedStack newStack = new ImprovedStackImpl(new LinkedList());
		for (int i=0; i<internalStack.size(); i++) {
			System.out.println("Pop is " + internalStack.top().getReturnValue());
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

	}
}