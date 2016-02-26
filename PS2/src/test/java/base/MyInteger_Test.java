package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	MyInteger e;
	MyInteger o;
	MyInteger op;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		e = new MyInteger(8);
		o = new MyInteger(9);
		op = new MyInteger(13);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("e.get_iValue() should be 8", e.get_iValue(), 8);

		assertEquals("e.isEven() should be true", e.isEven(), true);
		assertEquals("o.isEven() should be false", o.isEven(), false);

		assertEquals("o.isOdd() should be true", o.isOdd(), true);
		assertEquals("e.isOdd() should be false", e.isOdd(), false);

		assertEquals("op.isPrime() should be true", op.isPrime(), true);
		assertEquals("e.isPrime() should be false", e.isPrime(), false);
		assertEquals("o.isPrime() should be false", o.isPrime(), false);

		assertEquals("MyInteger.isEven(e) should be true", MyInteger.isEven(e), true);
		assertEquals("MyInteger.isEven(o) should be false", MyInteger.isEven(o), false);

		assertEquals("MyInteger.isOdd(o) should be true", MyInteger.isOdd(o), true);
		assertEquals("MyInteger.isOdd(e) should be false", MyInteger.isOdd(e), false);

		assertEquals("MyInteger.isPrime(op) should be true", MyInteger.isPrime(op), true);
		assertEquals("MyInteger.isPrime(e) should be false", MyInteger.isPrime(e), false);
		assertEquals("MyInteger.isPrime(o) should be false", MyInteger.isPrime(o), false);


		assertEquals("e.equals(e) should be true", e.equals(e), true);
		assertEquals("o.equals(o) should be false", e.equals(o), false);
	}

}
