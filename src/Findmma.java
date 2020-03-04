import java.util.Scanner;

public class Findmma {
	public static void main(String[] args) {

		int sum = 0; 
		int inputNum;
		int counter;
		float average;
		double Max = 0; 
		double Min = 101;      

		Scanner NumScanner = new Scanner(System.in);
		Scanner charScanner = new Scanner(System.in); 
		System.out.println("Enter the total number of exams you want a average");
		counter = NumScanner.nextInt();
		System.out.println("Please enter " + counter + " numbers:");

		for(int i = 1; i<=counter ;i++){          
		    inputNum = NumScanner.nextInt();
		    sum = sum + inputNum;
		    System.out.println();

		    if(inputNum > Max){
		        Max = inputNum;
		    }
		    if(inputNum < Min){
		        Min = inputNum;
		    }
		    if(inputNum > -1 && inputNum < 101){
		        sum = sum + inputNum;
		    }
		    else{
		        System.out.println("You entered a number that wasn't in the range of 0 to 100");
		        average = sum / counter;
		    }
		    }
		}
		

}
