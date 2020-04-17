import java.util.Scanner;
import java.lang.Math;
public class runLogic {
	private int choice;
	private Scanner inputChoice = new Scanner(System.in);
	private int roundPlace = 3;
	private int x;
	
	//choice setter
	void setChoice() {
		this.choice = inputChoice.nextInt();
	}
	
	//choice getter
	int getChoice() {
		return choice;
	}
	
	
	//start menu method
	void startMenu() {
		System.out.println("Welcome to the Coursework 2 options menu");
		System.out.println("Please select from these options:"
				+ "\n1)2x+6=8 Solution"
				+ "\n2)Bubble Sort"
				+ "\n3)Insertion Sort"
				+ "\n4)Accuracy Adjuster"
				+ "\n5)Calculator"
				+ "\n6)Quit"
				+ "\n>");
		setChoice();
	}
	
	//set round value
	void setRound() {
		System.out.println("What place would you like to round to? >");
		x = inputChoice.nextInt();
		this.roundPlace = 10^x;
	}
	
	//use round
	double roundThis(double x) {
		return Math.round(x*roundPlace)/roundPlace;
	}
}
