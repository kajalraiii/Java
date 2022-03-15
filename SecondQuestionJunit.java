import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyClass2 {

	@Test
	void test() {
		First junit=new First();
		assertEquals(4,junit.numbers(new int[] {1,2,1,2,4}));
	}

}
