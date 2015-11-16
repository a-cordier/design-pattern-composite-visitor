package com.acordier.patterns;

public abstract class ArithmeticExpression {
	
	public abstract <T> T accept(Visitor<T> v);
}
