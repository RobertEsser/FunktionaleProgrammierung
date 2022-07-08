package de.telekom.sea7.fp;

import java.util.function.BiFunction;

class Add implements BiFunction<Integer,Integer,Integer> {

//	static int add_methode(int left, int right) {
//		return left + right;
//	}

	@Override
	public Integer apply(Integer t, Integer u) {		
		return t + u;
	}
}
