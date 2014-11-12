import org.junit.*;
import static org.junit.Assert.*;

public class SampleableListTest {

	@Test
	public void testSampleOf10(){
		List l = new LinkedList();
		SampleableList sl = new SampleableListImpl(l);
		for (int i=0; i<11; i++){
			sl.add(i);
		}
		SampleableList sampledList = sl.sample();
		assertEquals(sl.get(9).getReturnValue(), sampledList.get(4).getReturnValue());
	}

	@Test
	public void testSampleEmpty(){
		List l = new LinkedList();
		SampleableList sl = new SampleableListImpl(l);
		SampleableList sampledList = sl.sample();
		assertEquals(sl.get(0).getReturnValue(), sampledList.get(0).getReturnValue());
	}

	@Test
	public void testSampleOne() {
		List l = new LinkedList();
		SampleableList sl = new SampleableListImpl(l);
		sl.add(1);
		SampleableList sampledList = sl.sample();
		assertNull(sampledList.get(0).getReturnValue());
	}
}