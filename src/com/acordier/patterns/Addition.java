package com.acordier.patterns;

/**
 * Composite with Visitor Node.
 * @author acordier
 * This class is not modified when computation 
 * interpretation evolves.
 */
public class Addition extends Binary {

	public Addition(ArithmeticExpression op1, ArithmeticExpression op2) {
		super(op1, op2);
	}


	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}
	
	

}
