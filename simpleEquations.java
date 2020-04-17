//import java.util.Scanner;

public class simpleEquations {
	private String equation = "2x+6=8";
	//private Scanner inputEquation = new Scanner(System.in);
	private int equalsIndex;
	private int variableIndex;
	private double answer;
	private char constantOp;
	private double constant;
	private double coVariable;
	
	
	
	/*equation setter
	void setEquation() {
		System.out.println("Which Linear equation would you like to solve?: ");
		this.equation = inputEquation.next();
		}*/
	
	//equation getter
	String getEquation() {
		return equation;
	}
	
	//set equalsIndex
	void setEqualsIndex() {
		this.equalsIndex = equation.indexOf("=",0);
	}
	
	//get equalsIndex
	int getEqualsIndex() {
		return equalsIndex;
	}

	//set answer
	void setAnswer() {
		//change to integer
		this.answer = Character.getNumericValue(equation.charAt(equalsIndex + 1));
	}
	
	//get answer
	double getAnswer() {
		return answer;
	}

	//set variableIndex
	void setVariableIndex() {
		this.variableIndex = equation.indexOf("x", 0);
	}
	
	//get variableIndex
	int getVariableIndex() {
		return variableIndex;
	}
	
	//set constantOp (operator)
	void setConstantOp() {
		this.constantOp = equation.charAt(variableIndex + 1);
	}
	
	//get constantOp
	char getConstantOp() {
		return constantOp;
	}
	
	//set constant
	void setConstant() {
		this.constant = Character.getNumericValue(equation.charAt(variableIndex + 2));
	}
	
	//get constant
	double getConstant() {
		return constant;
	}
	
	//set coVariable
	void setCoVariable() {
		this.coVariable = Character.getNumericValue(equation.charAt(0));
	}
	
	//get coVariable
	double getCoVariable() {
		return coVariable;
	}

	//add or subtract constant from answer
	void constantHandle() {
		if (constantOp == '+') {
			this.answer = answer - constant;
		}else if (constantOp == '-') {
			this.answer += constant;
		}
	}

	//handle coefficient
	void coVariableHandle() {
		this.answer = answer/coVariable;
	}
}