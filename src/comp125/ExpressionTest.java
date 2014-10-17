package comp125;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {

	@SuppressWarnings("unused")
	@Test
	public void testCreateExpression() {
		Expression twelve = new Expression(12);
		Expression six = new Expression(6);

		Expression ex1 = new Expression(twelve, "+", six); // 12 + 6
	}

	@Test
	public void testEvalExpression() throws Exception {
		Expression twelve = new Expression(12);
		Expression six = new Expression(6);

		assertEquals(12, twelve.evaluate());
		assertEquals(6, six.evaluate());

		Expression ex1 = new Expression(twelve, "+", six); // 12 + 6

		assertEquals(18, ex1.evaluate());
	}
	
	@Test(expected=Exception.class)
	public void testUnknownOperator() throws Exception {
			Expression twelve = new Expression(12);
			Expression six = new Expression(6);
			Expression ex1 = new Expression(twelve, ".", six); // 12 . 6
			
			assertEquals(18, ex1.evaluate());
	}
}