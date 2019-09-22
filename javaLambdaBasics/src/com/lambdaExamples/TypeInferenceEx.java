package com.lambdaExamples;

public class TypeInferenceEx {

	public static void main(String[] args) {
			StringLengthCalculator strLenCal = (s) -> s.length();
			System.out.println(strLenCal.getStringLength("Akshay"));
			printLength((s) -> s.length());
			

	}

	static void printLength(StringLengthCalculator c) {
		System.out.println(c.getStringLength("Akshay Amare"));
	}
}
