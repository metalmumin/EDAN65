package tests;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class ParseTests extends AbstractTestSuite {
	public ParseTests() {
		super("testfiles/parser");// where test input files are
	}

	@Test
	public void func1() {
		testValidSyntax("func1.calc");
	}
	
	@Test
	public void func2() {
		testValidSyntax("func2.calc");
	}
	
	@Test
	public void func3() {
		testValidSyntax("func3.calc");
	}
	
	@Test
	public void arithmetic() {
		testValidSyntax("arithmetic.calc");
	}
	
	@Test
	public void extended() {
		testValidSyntax("extended.calc");
	}

	@Test
	public void error() {
		testSyntaxError("error.calc");
	}
}
