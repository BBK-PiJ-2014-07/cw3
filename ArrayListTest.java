import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays; 


public class ArrayListTest {
	
	@Test 
	public void testAdd() {
		ArrayList list = new ArrayList();
		list.add("One");
		assertNotNull(list.get(0));
	}

	@Test
	public void testAddMoreThan5(){
		ArrayList list = new ArrayList();
		for (int i=0; i<8; i++){
			list.add(i);
		}
		System.out.println(Arrays.toString(list.getArray()));

		assertEquals(list.get(7).getReturnValue(), 7);

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



	public static void main(String[] args) {
		ArrayListTest test = new ArrayListTest();
		test.run();
	}

	public void run() {
		ArrayList list = new ArrayList();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("11");
		
		//list.remove(1);

		System.out.println(Arrays.toString(list.getArray()));
	}


}