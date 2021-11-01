package net.irules.AdvancedCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdvancedCalculator {
	public static void main(String[] args) {
		new AdvancedCalculator().listen();
	}

	private void listen(){
		AdvancedCalculator advancedCalculator = new AdvancedCalculator();

		boolean run = true;
		String input = "";

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while(run) {
			System.out.println("Please enter the operation, e.g: 1 + 2 ( space separated ). Type \"exit\" to close the program!");

			try {
				input = bufferedReader.readLine();

				if(input.equalsIgnoreCase("exit"))
					break;

				String[] args = input.split(" ");

				if(args.length != 3){
					System.out.println("Invalid syntax.");

					continue;
				}

				double firstNumber, secondNumber;

				try {
					firstNumber = Double.parseDouble(args[0]);
					secondNumber = Double.parseDouble(args[2]);

				} catch (NumberFormatException exception) {
					System.out.println("Please type both numbers as whole numbers, space separated!");

					continue;
				}

				String operation = args[1];

				switch (operation) {
					default:
					case "+":
						System.out.println("Result: " + advancedCalculator.add(firstNumber, secondNumber));
						break;
					case "*":
						System.out.println("Result: " + advancedCalculator.multiply(firstNumber, secondNumber));
						break;
					case "^":
						System.out.println("Result: " + advancedCalculator.power(firstNumber, secondNumber));
						break;
					case "/":
						System.out.println("Result: " + advancedCalculator.divide(firstNumber, secondNumber));
						break;
					case "-":
						System.out.println("Result: " + advancedCalculator.subtract(firstNumber, secondNumber));
						break;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Program exited. Calculator made by IRules!");
	}

	double multiply(double x, double y) {
		return x * y;
	}

	double power(double x, double y) {
		return Math.pow(x, y);
	}

	double divide(double x, double y) {
		return x/y;
	}

	double subtract(double x, double y) {
		return x-y;
	}

	double add(double x, double y){
		return x+y;
	}
}
