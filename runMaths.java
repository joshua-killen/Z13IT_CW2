
public class runMaths {
	public static boolean runCheck = true;
	
	public static void main(String[] args) {
		
		runLogic logic = new runLogic();
		bubbleSort studentSort = new bubbleSort();
		
		while (runCheck != false) {
			logic.startMenu();
			
			switch(logic.getChoice()) {
			
			//simple equation function
			case 1:
				simpleEquations equation1 = new simpleEquations();
				System.out.println("2x+6 = 8");
				equation1.setEqualsIndex();
				equation1.setVariableIndex();
				equation1.setConstantOp();
				equation1.setAnswer();
				equation1.setConstant();
				equation1.setCoVariable();
				System.out.println("-6");
				equation1.constantHandle();
				System.out.println("2x = 2 \n /2");
				equation1.coVariableHandle();
				System.out.println("x = " + logic.roundThis(equation1.getAnswer()));
				break;
			
			//bubble sort function
			case 2:
				studentSort.setSortString();
				studentSort.arraySetter();
				System.out.println(studentSort.getArray());
				studentSort.myBubbleSort();
				System.out.println(studentSort.getArray());
				break;
			
			//insertion sort function	
			case 3:
				studentSort.setSortString();
				studentSort.arraySetter();
				System.out.println(studentSort.getArray());
				studentSort.myInsertionSort();
				System.out.println(studentSort.getArray());
				break;
				
			//accuracy option function
			case 4:
				logic.setRound();
				break;
				
			//calculator function	
			case 5:
				calculator calc = new calculator();
				calc.setEquation();
				calc.setOperator();
				calc.setNumber1();
				calc.setNumber2();
				calc.runOperation();
				calc.setAnswer(logic.roundThis(calc.getAnswer()));
				System.out.println(calc.getEquation() + calc.getAnswer());
				break;
				
			//quit
			case 6:
				System.out.println("Goodbye");
				runCheck = false;
				break;
			
			default:
				System.out.println("Incorrect input\n");
			}
		

		}

	}
	
}
