import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class T1MultipleCondition {
	private final SILab2 si=new SILab2();
	
	@Test
	void test() {
		List<Time> t = new ArrayList<Time>();
		List<Integer> res = si.function(t);
		System.out.println("Testing by Multiple Conditions");
		
		t.clear();
		t.add(new Time(-5, 1, 1));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(-5, 1, 1)");
		
		t.clear();
		t.add(new Time(30, 1, 1));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(30, 1, 1)");

		t.clear();
		t.add(new Time(10, 1, 1));
		res = si.function(t);
		assertEquals(36061, res.get(0));

		t.clear();
		t.add(new Time(1, -10, 1));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(1, -10, 1)");

		t.clear();
		t.add(new Time(1, 60, 1));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(1, 60, 1)");
		
		t.clear();
		t.add(new Time(1, 1, 1));
		res = si.function(t);
		assertEquals(3661, res.get(0));

		t.clear();
		t.add(new Time(1, 1, -10));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(1, 1, -10)");

		t.clear();
		t.add(new Time(1, 1, 60));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(1, 1, 60)");

		t.clear();
		t.add(new Time(1, 1, 1));
		res = si.function(t);
		assertEquals(3661, res.get(0));

		t.clear();
		t.add(new Time(24, 0, 0));
		res = si.function(t);
		assertEquals(86400, res.get(0));

		t.clear();
		t.add(new Time(24, 0, 1));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(24, 0, 1)");

		t.clear();
		t.add(new Time(24, 1, 0));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(24, 1, 0)");

		t.clear();
		t.add(new Time(24, 1, 1));
		assertThrows(RuntimeException.class, () -> si.function(t), "Time(24, 1, 1)");

		System.out.println("Testing finished");

	}
	
	

}
