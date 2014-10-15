package comp125;

public class Expression {
	
	String operator;
	Expression left;
	Expression right;
	int value;
	
	public Expression(int value) {
		this.value = value;
		left = null;
		right = null;
		operator = null;
	}
	
	public Expression(Expression l, String op, Expression r) {
		left = l;
		operator = op;
		right = r;
	}
	
	public int evaluate() throws Exception {
		int result = 0;
		if (left == null) {
			//assume this is just a number
			result = value;
		} else {
			int lval = left.evaluate();
			int rval = right.evaluate();
			result = applyOperator(lval, rval);
		}
		return result;
	}
	
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
	
	public String toString() {
		if (left == null)
			return String.valueOf(value);
		else
			return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
	}
}