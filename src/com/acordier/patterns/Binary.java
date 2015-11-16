package com.acordier.patterns;
/**
 * Composite with Visitor abstract Node.
 * @author acordier
 * This class is not modified when computation 
 * interpretation evolves.
 */
public abstract class Binary extends ArithmeticExpression {
	
	private ArithmeticExpression op1;
	private ArithmeticExpression op2;
	
	public Binary(ArithmeticExpression op1, ArithmeticExpression op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	public ArithmeticExpression getOp1() {
		return op1;
	}

	public void setOp1(ArithmeticExpression op1) {
		this.op1 = op1;
	}

	public ArithmeticExpression getOp2() {
		return op2;
	}

	public void setOp2(ArithmeticExpression op2) {
		this.op2 = op2;
	}
	
	
	
}
