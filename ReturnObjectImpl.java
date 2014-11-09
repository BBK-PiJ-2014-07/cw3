
public class ReturnObjectImpl implements ReturnObject {
	Object returnObj;
	
//two constructors - one with args and one without. Use the one with args for error messages as strings.

	public ReturnObjectImpl(Object obj) {
		returnObj = obj;
	}
	
	public boolean hasError() {
		if (returnObj.equals(null)){
			return true;
		} else {
			return false;
		}
	}

	public ErrorMessage getError() {
		if (hasError()) {
			return null;
		} else {
			System.out.println("NO_ERROR");
			return null;
		}
	}

	/** 
	ErrorMessage???? 
	*/

	public Object getReturnValue() {
		if (!hasError()) {
			return returnObj;
		} else {
			return null;
		}
	}
}
