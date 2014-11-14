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
		assertEquals(fll.get(1).getReturnValue(), fll.rest().get(0).getReturnValue());

	}
}