package com.acordier.patterns;
/**
 * Composite with Visitor abstract Visitor.
 * @author acordier
 * A concrete implementation of this class
 * is provided by the client to perform computations
 */
public abstract class Visitor<T> {
	public abstract T visit(Number n);
	public abstract T visit(Addition a);

}
