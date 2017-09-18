package com.oops.generics;

public class Tuple<T,U> {
	
	private T first;
	private U second;

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}

	public Tuple(T first, U second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Tuple [first=" + first + ", second=" + second + "]";
	}
	
	

}
