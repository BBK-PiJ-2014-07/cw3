import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;

public class LinkedListTest {

	@Test
	public void testSize(){
		LinkedList ll = new LinkedList();
		ll.add("head");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		assertEquals(ll.size(),5);

	}

	@Test
	public void testRemove(){
		LinkedList ll = new LinkedList();
		ll.add("head");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		ll.remove(0);
		assertEquals(ll.get(0).getReturnValue(), "two");
	}

	@Test
	public void testGet(){
		LinkedList ll = new LinkedList();
		ll.add("head");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");

		assertEquals(ll.get(2).getReturnValue(),"three");
	}

	public static void main(String[] args){
		LinkedListTest llt = new LinkedListTest();
		llt.run();
	}

	public void run(){
		LinkedList ll = new LinkedList();
		ll.add("head");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		ll.add("six");
		ll.add("seven");
		ll.add("eight");

		//System.out.println(ln1.getObject());
		//ReturnObject ro1 = new ReturnObjectImpl(ln1.getObject());
		System.out.println(ll.remove(1).getReturnValue());
		//System.out.println(ln1);
	}
}