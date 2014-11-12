import org.junit.*;
import static org.junit.Assert.*;

public class ImprovedStackTest {
	private List l;
	private ImprovedStack stack;
	public ImprovedStackTest() {
		l = new LinkedList();
		stack = new ImprovedStackImpl(l);
	}
	
	@Before
	public void buildUp(){
		stack.push("head");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("8");
		stack.push("9");

	}
	
	@Test
	public void testRemove(){
		//stack.remove("2");
		//assertTrue(stack.size()==5);
	}

	@Test
	public void testReverse(){
		System.out.println(stack.size());
		ImprovedStack newStack = stack.reverse();
		assertEquals(newStack.top().getReturnValue(),"head");
	}
}