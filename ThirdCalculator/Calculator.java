import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    private static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";
    private final List<Character> acceptedOperators = Arrays.asList('+', '-', '*', '/', '%');

    private final BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.loop();
        } catch (Throwable err) {
            System.out.println("Good job, you caught an error! Now go fix it you lazy f**k: " + err.getMessage());
            err.printStackTrace();
        }

    }

    private void loop() throws IOException {
        while(true) {
            String message = reader.readLine();
            double firstNumber = 0, secondNumber = 0;
            String operator = "";
            if("stop".equals(message)){
                System.out.println("Alright, have a good day!");
                break;
            }
            char[] chars = message.toCharArray();
            try {
                StringBuilder buffer = new StringBuilder(chars[0] + "");
                Integer.parseInt(chars[0] + "");
                int j = 0;
                for(int i=1;i<chars.length;i++){
                    if(acceptedOperators.contains(chars[i])) {
                        operator = chars[i] + "";
                        j = i;
                        break;
                    } else {
                        buffer.append(chars[i]);
                    }
                }
                firstNumber = Double.parseDouble(buffer.toString());
                buffer = new StringBuilder();
                for(int i=j+1;i<chars.length;i++){
                    buffer.append(chars[i]);
                }
                secondNumber = Double.parseDouble(buffer.toString());
                System.out.println(solveEquation(firstNumber, secondNumber, operator) + "\n");
            } catch (Throwable err){
                System.out.println(RED + "Please check your input equation and try again:\n" + message + "\n" + RESET);
            }
        }
    }

    private double solveEquation(double firstNumer, double secondNumer, String operator) {
        switch (operator) {
            case "-" -> {
                return firstNumer - secondNumer;
            }
            case "*" -> {
                return firstNumer * secondNumer;
            }
            case "/" -> {
                return firstNumer / secondNumer;
            }
            case "%" -> {
                return firstNumer % secondNumer;
            }
            case "+" -> {
                return firstNumer + secondNumer;
            }
            default -> {

            }
        }
        return 0;
    }
}
