package com.acordier.patterns;
/**
 * Composite with Visitor : Concrete Visitor.
 * @author acordier 
 * this class is provided by the client to perform computations
 */
public class ArithmeticVisitor extends Visitor<Integer> {

	@Override
	public Integer visit(Number n) {
		return n.getValue();
	}

	@Override
	public Integer visit(Addition a) {
		return a.getOp1().accept(this) + a.getOp2().accept(this);
	}

}
