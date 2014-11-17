import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays; 


public class ArrayListTest {
	
	@Test 
	public void testAddSingleValue() {
		ArrayList list = new ArrayList();
		list.add("One");
		assertEquals(list.get(0).getReturnValue(),"One");
	}

	@Test
	public void testIsEmptyWhenEmpty() {
		ArrayList list = new ArrayList();
		list.add("One");
		list.remove(0);
		assertTrue(list.isEmpty());
	}

	@Test
	public void testIsEmptyWhenNotEmpty() {
		ArrayList list = new ArrayList();
		list.add("One");
		assertFalse(list.isEmpty());
	}


	@Test
	public void testGetOutOfBounds() {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		assertTrue(list.get(4).hasError());
		}

	@Test
	public void testAddOutOfBounds() {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		assertTrue(list.add(6,"E").hasError());
	}

	@Test
	public void testAddMoreThan10(){
		ArrayList list = new ArrayList();
		for (int i=0; i<15; i++){
			list.add(i);
		}
		assertEquals(list.get(14).getReturnValue(), 14);

	}
	@Test
	public void testRemove() {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.remove(1);
		assertEquals(list.get(1).getReturnValue(),"C");
	}

	@Test
	public void testRemoveOnlyValue() {
		ArrayList list = new ArrayList();
		list.add("0");
		list.remove(0);
		assertEquals(list.size(),0);
	}
}