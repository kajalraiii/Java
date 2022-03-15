import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyClass {

   Hashing builder=new Hashing();
	@Test
	void test() {
		Map<Character,Integer> result=builder.countVariable("kajal");
		Assert.assertSame(result.get('k'), 1);
		Assert.assertSame(result.get('a'), 2);
		Assert.assertSame(result.get('j'), 1);
		Assert.assertSame(result.get('l'), 1);
	}

	

}
