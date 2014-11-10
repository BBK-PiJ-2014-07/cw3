public class FunctionalArrayList extends ArrayList implements FunctionalList {
	private static int DEFAULT_ARRAY_SIZE = 10;
	private int arraySize;
	private Object[] array;

	public FunctionalArrayList(){
		super();
	}

	public ReturnObject head() {
		if(array[0] == null){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(array[0]);
		}
	}

	public FunctionalList rest() {
		FunctionalArrayList newArray = new FunctionalArrayList();
		for (int i=1; i<array.length; i++) {
			if(array[i] != null){
				newArray.add(array[i]);
			} 
		}
			return newArray;

	}

}