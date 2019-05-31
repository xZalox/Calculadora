package com.microservice.vouser;

import java.io.Serializable;

public class VOUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3560972546182458142L;
	private int num1;
	private int num2;
	private int sum;
	private int rest;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getSum() {
		return sum;
	}

	public int getRest() {
		return rest;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setRest(int rest) {
		this.rest = rest;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
