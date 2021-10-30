package net.irules.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaProgram {

	public static void main(String[] args) throws IOException {

		JavaProgram javaProgram = new JavaProgram();

		// Initialize the numbers
		int firstNumber;
		int secondNumber;

		// BufferReader to read console ( even in IDE conditions )
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		//Read all inputs needed
		System.out.print("Enter First Number: ");
		firstNumber = Integer.parseInt(bufferedReader.readLine());

		System.out.print("Enter Second Number: ");
		secondNumber = Integer.parseInt(bufferedReader.readLine());

		System.out.print("Enter Operation ( Multiply, Power, Divide, Subtract, Add | Default: Add): ");
		String operation = bufferedReader.readLine();

		//Based on what you choose you get the result

		// Old Solution with if statements
//		if(operation.equalsIgnoreCase("Multiply")) {
//			System.out.print("Result: " + javaProgram.multiply(firstNumber, secondNumber));
//		}
//
//		if(operation.equalsIgnoreCase("Power")) {
//			System.out.println("Result: " + javaProgram.power(firstNumber, secondNumber));
//		}
//
//		if(operation.equalsIgnoreCase("Divide")) {
//			System.out.println("Result: " + javaProgram.divide(firstNumber, secondNumber));
//		}
//
//		if(operation.equalsIgnoreCase("Subtract")) {
//			System.out.println("Result: " + javaProgram.subtract(firstNumber, secondNumber));
//		}
//
//		if(operation.equalsIgnoreCase("Add")) {
//			System.out.println("Result: " + javaProgram.add(firstNumber, secondNumber));
//		}

		//New solution with the switch statement
		switch (operation){
			case "Multiply":
				System.out.print("Result: " + javaProgram.multiply(firstNumber, secondNumber));
				break;
			case "Power":
				System.out.println("Result: " + javaProgram.power(firstNumber, secondNumber));
				break;
			case "Divide":
				System.out.println("Result: " + javaProgram.divide(firstNumber, secondNumber));
				break;
			case "Subtract":
				System.out.println("Result: " + javaProgram.subtract(firstNumber, secondNumber));
				break;
			case "Add":
			default:
				System.out.println("Result: " + javaProgram.add(firstNumber, secondNumber));
				break;
		}
	}

	//Kinda obvious what these do
	int multiply(int x, int y) {
		return x * y;
	}

	int power(int x, int y) {
		return (int) Math.pow(x, y);
	}

	int divide(int x, int y) {
		return x/y;
	}

	int subtract(int x, int y) {
		return x-y;
	}

	int add(int x, int y){
		return x+y;
	}
}
