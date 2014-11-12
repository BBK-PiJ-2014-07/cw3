import org.junit.*;
import static org.junit.Assert.*;

public class StackImplTest {
	@Test 
	public void testIsEmpty() {
		List l = new LinkedList();
		l.add("head");
		l.add("1");
		l.add("2");
		l.add("3");
		AbstractStack s = new StackImpl(l);
		assertFalse(s.isEmpty());
	}

	@Test
	public void testSize(){
		List l = new LinkedList();
		l.add("head");
		l.add("1");
		l.add("2");
		l.add("3");
		AbstractStack s = new StackImpl(l);
		assertEquals(s.size(), 4);
	}

	@Test
	public void testPushandTop(){
		List l = new LinkedList();
		AbstractStack s = new StackImpl(l);
		s.push("head");
		s.push("1");
		s.push("2");
		assertEquals(l.get(2).getReturnValue(), s.top().getReturnValue());
	}

	@Test 
	public void testPop(){
		List l = new LinkedList();
		AbstractStack s = new StackImpl(l);
		s.push("head");
		s.push("1");
		s.push("2");
		s.pop();
		assertEquals(l.get(1).getReturnValue(), s.top().getReturnValue());
	}

}