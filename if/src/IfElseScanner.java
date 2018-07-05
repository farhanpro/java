
import java.util.Scanner;
public class IfElseScanner {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter an integer: ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered number is Even");
		}
		else
		{
			System.out.println("Entered number is ODD");
		}
			
	}

}
