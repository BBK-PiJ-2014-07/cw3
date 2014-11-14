import org.junit.*;
import static org.junit.Assert.*;

public class ReturnObjectTest {
	@Test
	public void testHasErrorWithError(){
		ReturnObject ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		assertTrue(ro.hasError());
	}

	@Test
	public void testHasErrorWithObject(){
		ReturnObject ro = new ReturnObjectImpl("object");
		assertFalse(ro.hasError());
	}

	@Test
	public void testGetErrorWithError(){
		ReturnObject ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		assertEquals(ro.getError(), ErrorMessage.INVALID_ARGUMENT);
	}
	
	@Test
	public void testGetErrorWithObject(){
		ReturnObject ro = new ReturnObjectImpl("object");
		assertNull(ro.getError());
	}

	@Test
	public void testGetReturnValueWithObj(){
		ReturnObject ro = new ReturnObjectImpl("object");
		assertEquals(ro.getReturnValue(),"object");
	}

	@Test
	public void testGetReturnValueWithError() {
		ReturnObject ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		assertNull(ro.getReturnValue());
	}
	
}