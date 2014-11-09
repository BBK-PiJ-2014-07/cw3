public class FunctionalArrayList extends ArrayList implements FunctionalList {

	public FunctionalArrayList(){
		super();
	}

	public ReturnObject head() {
		if(getArray()[0].equals(null)){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(getArray()[0]);
		}
	}

	public FunctionalList rest() {
		FunctionalArrayList newArray = new FunctionalArrayList();
		for (int i=1; i<getArray().length; i++) {
			if(getArray()[i].equals(null)){
			} else {	
				newArray.add(getArray()[i]);
			} 
		}
			return newArray;

	}
}