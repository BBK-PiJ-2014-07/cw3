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
		assertEquals(stack.size(),15);
	}
	@Test
	public void testremoveOnlyValue(){
		List anotherList = new LinkedList();
		ImprovedStack anotherStack = new ImprovedStackImpl(anotherList);
		anotherStack.push(0);
		anotherStack.remove(0);
		assertEquals(anotherStack.size(),0);
	}

	@Test
	public void testWithArray(){
		List array = new ArrayList();
		ImprovedStack arrayStack = new ImprovedStackImpl(array);
		arrayStack.push(0);
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.remove(1);
		assertEquals(arrayStack.size(),2);
	}

	@Test
	public void testReverse(){
		ImprovedStack newStack = stack.reverse();
		assertEquals(newStack.top().getReturnValue(),"X");
	}
}