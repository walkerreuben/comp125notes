package comp125;

/**
 * 
 * @author Reuben Walker
 *
 */
public class Expression {

	private String operator;
	private Expression left;
	private Expression right;
	private int value;

	/**
	 * Constructor for the simplest expression, simply a number
	 * 
	 * @param value
	 *            the numerical value of the expression
	 */
	public Expression(int value) {
		this.value = value;
		left = null;
		right = null;
		operator = null;
	}

	/**
	 * Constructor for a more complicated expression consisting of two other expressions and an operator.
	 * 
	 * @param l
	 *            the left sub-expression
	 * @param op
	 *            the operator, either + - * or /
	 * @param r
	 *            the right sub-expression
	 */
	public Expression(Expression l, String op, Expression r) {
		left = l;
		operator = op;
		right = r;
	}

	public String toString() {
		if (left == null)
			return String.valueOf(value);
		else
			return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
	}

	public int evaluate() throws Exception {
		int result = 0;
		if (left == null) {
			// assume this is just a number
			result = value;
		} else {
			int lval = left.evaluate();
			int rval = right.evaluate();
			result = applyOperator(lval, rval);
		}
		return result;
	}

	/**
	 * Takes an expression and applies the operator to the two sides.
	 * @param lval left side sub-expression
	 * @param rval right side sub-expression
	 * @return the value of the expression after evaluation.
	 * @throws Exception when the operator isn't a valid operator.
	 */
	public int applyOperator(int lval, int rval) throws Exception {
		int result = 0;
		if (operator == "+")
			result = lval + rval;
		else if (operator == "-")
			result = lval - rval;
		else if (operator == "/")
			result = lval / rval;
		else if (operator == "*")
			result = lval * rval;
		else
			throw new Exception("Unknown operator: " + operator);
		return result;
	}
}