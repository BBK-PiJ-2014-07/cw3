import org.junit.*;
import static org.junit.Assert.*;

public class ImprovedStackTest {
	private List l;

	public ImprovedStackTest() {
		l = new LinkedList();
	}
	
	@Before
	public void buildUp(){
		l.add("head");
		l.add("1");
		l.add("2");
		l.add("3");
		ImprovedStack stack = new ImprovedStackImpl(l);
	}
	
	@Test
	public void testRemove(){

	}

	@Test
	public void testReverse(){

	}
}