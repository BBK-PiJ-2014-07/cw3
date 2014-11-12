import org.junit.*;
import static org.junit.Assert.*;

public class FunctionalLinkedListTest {
	@Test
	public void testHead(){
		FunctionalLinkedList fll = new FunctionalLinkedList();
		fll.add("head");
		fll.add("two");
		fll.add("three");
		assertEquals(fll.head().getReturnValue(), "head");
	}

	@Test
	public void testRest(){
		FunctionalLinkedList fll = new FunctionalLinkedList();
		fll.add("head");
		fll.add("two");
		fll.add("three");
		fll.add("four");
		System.out.println(fll.get(3).getReturnValue());
		System.out.println(fll.rest().get(2).getReturnValue());

		assertEquals(fll.get(3).getReturnValue(), fll.rest().get(2).getReturnValue());

	}

	public static void main(String[] args){
		FunctionalLinkedListTest fllt = new FunctionalLinkedListTest();
		fllt.run();
	}

	public void run(){
		FunctionalLinkedList fll = new FunctionalLinkedList();
		fll.add("head");
		fll.add("two");
		fll.add("three");
	}
}