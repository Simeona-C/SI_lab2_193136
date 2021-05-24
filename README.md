# SI_lab2_193136
# Втора лабораториска вежба по Софтверско инженерство

## Симеона Чичева, бр. на индекс 193136

###  Control Flow Graph

![Control Flow Graph](CFG1.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 8, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=7, па цикломатската комплексност изнесува 8.

### Тест случаи според критериумот  Every statement 

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class T1EveryStatement {
	private final SILab2 si=new SILab2();
	
	@Test
	void test() {
		List<Time> t = new ArrayList<Time>();
		List<Integer> res = si.function(t);
		System.out.println("Testing by Every Statement Criteria");
		assertEquals(0, res.size());
		
		t.add(new Time(1,1,1));
		t.add(new Time(24,0,0));
		res = si.function(t);
		assertEquals(3661, res.get(0));
		assertEquals(86400, res.get(1));
		
		t.clear();
		t.add(new Time(-2,2,4));
		assertThrows(RuntimeException.class, () -> si.function(t), "No exception when hours are smaller than the minimum");
		
		t.clear();
		t.add(new Time(25,2,4));
		assertThrows(RuntimeException.class, () -> si.function(t), "No exception when hours are grater than the maximum");

		t.clear();
		t.add(new Time(2,79,4));
		assertThrows(RuntimeException.class, () -> si.function(t), "No exception when minutes are not valid");

		t.clear();
		t.add(new Time(2,2,400));
		assertThrows(RuntimeException.class, () -> si.function(t), "No exception when seconds are not valid");

		t.clear();
		t.add(new Time(24,2,4));
		assertThrows(RuntimeException.class, () -> si.function(t), "No exception when time is greater than the maximum");

	}
	
	

}

### Тест случаи според критериумот Every path

.... 

### Објаснување на напишаните unit tests

...
...
