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
	/**
	 * Returns a copy of this stack with the items reversed, the top
	 * elements on the original stack is at the bottom of the new
	 * stack and viceversa.
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */
	public ImprovedStack reverse(){
		List newList = new LinkedList();
		for (int i=0; i<internalStack.size(); i++) {
			newList.add(internalStack.pop());
		}
		return new ImprovedStackImpl(newList);
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