package tests;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class ParseTests extends AbstractTestSuite {
	public ParseTests() {
		super("testfiles/parser");// where test input files are
	}

	@Test
	public void func1() {
		testValidSyntax("func1.lang");
	}
	
	@Test
	public void func2() {
		testValidSyntax("func2.lang");
	}
	
	@Test
	public void func3() {
		testValidSyntax("func3.lang");
	}
	
	@Test
	public void arithmetic() {
		testValidSyntax("arithmetic.lang");
	}
	
	@Test
	public void extended() {
		testValidSyntax("extended.lang");
	}

	@Test
	public void error() {
		testSyntaxError("error.lang");
	}
}
