package helloworld;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {
	private com.wyh.Test test;
	@Before
	public void beforeclass() {
		test = new com.wyh.Test();
	}

	@Test
	public void test() {
		test.print();
	}

}
