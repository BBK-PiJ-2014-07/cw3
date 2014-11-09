/** 
Implementation of List interface as an array list.
*/

public class ArrayList implements List {
	private static int DEFAULT_ARRAY_SIZE = 10;
	private int arraySize;
	private Object[] array;

	public ArrayList() {
		array = new Object[DEFAULT_ARRAY_SIZE];
		arraySize = 0;
	}

	public ReturnObject add(int index, Object item) {
		//is the index valid?
		if (index < 0 || index >= array.length) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item.equals(null)) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			//check to see if there's enough space
			if (array.length == arraySize+1) {
				makeBiggerArray();
			}
			//reassign array values to current position+1
			for (int i=arraySize; i>index; i--) {
				array[i+1] = array[i];
			}
			array[index] = item;
			arraySize++;
			return new ReturnObjectImpl(array[index]);
		}
	}

	public Object getValue(int index) {
		return array[index];
	}

	public Object[] getArray() {
		return array;
	}

	public ReturnObject add(Object item) {
		if (item.equals(null)) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if (array.length == arraySize+1) {
				makeBiggerArray();
			}
			array[arraySize] = item;
			arraySize++;
			return new ReturnObjectImpl(array[arraySize]);
		}
	}

	public boolean isEmpty() {
		if (arraySize ==0) {
			return true;
		} else { 
			return false;
		}
	}

	public int size() {
		return arraySize;
	}

	public ReturnObject get(int index){
		ReturnObject result = new ReturnObjectImpl(array[index]);
		return result;
	}

	public ReturnObject remove(int index){
		if (array[index].equals(null)){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			} else {
				for (int i=index; i<arraySize; i++) {
					array[i] = array[i+1];
				}
				return new ReturnObjectImpl(array[index]);
			}
	} 


	public void makeBiggerArray() {

		//if array isn't big enough, copy it to a bigger one
		Object[] newArray = new Object[arraySize+10];
		for (int i=0; i<arraySize; i++) {
			newArray[i] = array[i];
		}
		array = newArray;

	}
}