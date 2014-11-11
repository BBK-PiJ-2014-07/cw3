
public class ReturnObjectImpl implements ReturnObject {
	Object returnObj;
	ErrorMessage errorMsg;
	
//two constructors - one with args and one without. Use the one with args for error messages as strings.

	public ReturnObjectImpl(Object obj) {
		returnObj = obj;
		errorMsg = null; 
	}
	
	public ReturnObjectImpl(ErrorMessage error) {
		errorMsg = error;
		returnObj = null;
	}
	public boolean hasError() {
		if (errorMsg != null){
			return true;
		} else {
			return false;
		}
	}

	public ErrorMessage getError() {
		if (hasError()) {
			return errorMsg;
		} else {
			return null;
		}
	}

	public Object getReturnValue() {
		if (!hasError()) {
			return returnObj;
		} else {
			return null;
		}
	}
}
