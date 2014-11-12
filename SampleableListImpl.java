/** 
* Implementation of Sampleable List: a list which can be sampled
*/
public class SampleableListImpl implements SampleableList {
	private List internalList;

	public SampleableListImpl(List list) {
		internalList = list;
	}

	public boolean isEmpty(){
		return internalList.isEmpty();
	}

	public int size(){
		return internalList.size();
	}

	public ReturnObject get(int index){
		return internalList.get(index);
	}

	public ReturnObject remove(int index){
		return internalList.remove(index);
	} 

	public ReturnObject add(Object item){
		return internalList.add(item);
	}

	public ReturnObject add(int index, Object item){
		return internalList.add(index,item);
	}

	public SampleableList sample(){
		SampleableList sampledList = new SampleableListImpl(new LinkedList());
		for (int i=0; i<internalList.size(); i++) {
			if (i%2!=0) {
				sampledList.add(internalList.get(i).getReturnValue());
			}
		}
		return sampledList;
	}
}