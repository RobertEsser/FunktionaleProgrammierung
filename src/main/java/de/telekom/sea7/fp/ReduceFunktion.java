package de.telekom.sea7.fp;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

                                    // BiFunction<Integer,Integer,Integer>
public class ReduceFunktion implements BinaryOperator<Integer> {
	
	// als lambda-Ausdruck sieht das so aus: "(op1,op2) -> op1 + op2"
	
	public Integer apply(Integer op1, Integer op2) {
		return op1 + op2;
	}
}
