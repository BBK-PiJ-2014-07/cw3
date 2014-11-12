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
		stack.push("X");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("X");
		stack.push("8");
		stack.push("9");
		stack.push("10");
		stack.push("11");
		stack.push("12");
		stack.push("X");
		stack.push("13");
		stack.push("14");
		stack.push("15");
	}
	
	@Test
	public void testRemove(){
		stack.remove("X");
		System.out.println("Top of stack is " + stack.top().getReturnValue());
		assertEquals(stack.size(),15);
	}

	@Test
	public void testReverse(){
		ImprovedStack newStack = stack.reverse();
		assertEquals(newStack.top().getReturnValue(),"X");
	}
}