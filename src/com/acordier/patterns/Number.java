package com.acordier.patterns;

/**
 * Composite with Visitor leaf.
 * @author acordier
 * This class is not modified when computation 
 * interpretation evolves.
 *
 */
public class Number extends ArithmeticExpression {
	private int value;

	public Number(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}



	
}
