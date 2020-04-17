import java.util.Scanner;
import java.lang.String;

public class calculator {
	private double number1;
	private String temp1 = "";
	private double number2;
	private String temp2 = "";
	private char operator;
	private int operatorIndex;
	private String equation = "";
	private double answer;
	private Scanner inputEquation = new Scanner(System.in);
	
	//equation setter
	void setEquation() {
		System.out.println("What Simple equation would you like to solve? Operators(+,-,*,/,!) E.g. x+y= : ");
		this.equation = (inputEquation.next()).substring(0);
		}
	
	//equation getter
	String getEquation() {
		return equation;
	}
	
	//answer setter
		void setAnswer(double x) {
			this.answer = x;
		}
		
		//answer getter
		double getAnswer() {
			return answer;
		}
	
	//operator setter
	void setOperator() {
		for (int i = 0; i < equation.length();i++) {
			if (equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*' || equation.charAt(i) == '/' || equation.charAt(i) == '!') {
				this.operator = equation.charAt(i);
				this.operatorIndex = i;
			}
		}
	}
	
	//number "x" setter
	void setNumber1() {
		for (int i = 0; i < operatorIndex; i++) {
			this.temp1 = this.temp1 + equation.charAt(i);
		}
		try {	
			this.number1 = Double.parseDouble(temp1);
		}catch (Exception e) {
			System.out.println("Input was not correct");
		}
	}
	
	//number "y" setter
	void setNumber2() {
		for (int i = operatorIndex+1; i < equation.length()-1; i++) {
			this.temp2 = this.temp2 + equation.charAt(i);
			System.out.println(temp2);
		}
		try {	
			this.number2 = Double.parseDouble(temp2);
		}catch (Exception e) {
			System.out.println("Input was not correct");
		}
	}
	
	//factorial function
	double runFactorial(double x) {
		if (x ==0) {
			return 1;
		}else {
			return (x*runFactorial(x-1));
		}
	}
	
	//perform operation
	void runOperation() {
		switch(operator) {
			case '+':
				this.answer = number1 + number2;
				break;
			case '-':
				this.answer = number1 - number2;
				break;
			case '*':
				this.answer = number1 * number2;
				break;
			case '/':
				this.answer = number1 / number2;
				break;
			case '^':
				for (int i=0; i < number2;i++) {
					if (i == 0) {
						this.answer = number1*number1;
					}else {
						this.answer = answer*number1;
					}
				}
			case '!':
				this.answer = this.runFactorial(number1);
		}
	}
}

