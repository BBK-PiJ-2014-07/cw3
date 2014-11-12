import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays; 


public class ArrayListTest {
	/*
	@Test 
	public void testAdd() {
		ArrayList list = new ArrayList();
		list.add("One");
		assertNotNull(list.get(0));
	}
	@Test
	public void testRemove() {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.remove(1);
		assertEquals(list.get(1),null);
	}


*/
	public static void main(String[] args) {
		ArrayListTest test = new ArrayListTest();
		test.run();
	}

	public void run() {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
			list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.remove(1);

		System.out.println(Arrays.toString(list.getArray()));
	}


}