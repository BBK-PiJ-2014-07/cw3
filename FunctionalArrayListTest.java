import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays; 


public class FunctionalArrayListTest {
	
	@Test 
	public void testHead() {
		FunctionalList list = new FunctionalArrayList();
		list.add("One");
		assertEquals(list.head().getReturnValue(), "One");
	}
	@Test
	public void testRest() {
		FunctionalList list = new FunctionalArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		FunctionalList restList = list.rest();
		assertEquals(restList.get(0).getReturnValue(),list.get(1).getReturnValue());
	}
}