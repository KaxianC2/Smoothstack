import java.lang.Math; 
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args){
        int ran = (int)(Math.random()*99+1);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1-100");
		System.out.println(ran);
		int count =0;
		do{
			int x = input.nextInt();
			if(x>=ran-10 && x<=ran+10)
			{
				System.out.println("The correct number is: "+ ran);
				break;
			}
			else if(count<4)
			{
				System.out.println("Incorrect number. Please Try again.");
				count++;
			}
			else
			{
				System.out.println("Sorry, You've reached 5 tries. The Answer is: "+ ran);
				break;
			}
		}while(true);
    }
}
