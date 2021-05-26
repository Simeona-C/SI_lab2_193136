import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class T2EveryBranch {

	private final SILab2 si=new SILab2();
	
	@Test
	void test() {
		System.out.println("Testing by Every Branch");

		List<Time> t = new ArrayList<Time>();
		
		List<Integer> res = si.function(t);
		assertEquals(0, res.size());
		
		t.clear();
		t.add(new Time(-1,0,0));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(-1,0,0)");
		
		t.clear();
		t.add(new Time(25,0,0));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(25,0,0)");

		t.clear();
		t.add(new Time(0,0,0));
		res = si.function(t);
		assertEquals(0, res.get(0));

		t.clear();
		t.add(new Time(24,1,1));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(24,1,1)");

		t.clear();
		t.add(new Time(0,0,60));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(0,0,60)");
		
		t.clear();
		t.add(new Time(24,0,0));
		res = si.function(t);
		assertEquals(86400, res.get(0));

		t.clear();
		t.add(new Time(0,60,0));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(0,60,0)");

		t.clear();
		t.add(new Time(-1,0,0));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(-1,0,0)");


		System.out.println("Testing finished");

	}

}
