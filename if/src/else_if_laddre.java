import java.util.Scanner;
public class else_if_laddre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter your marks ");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		
		if(a<35)
		{
			System.out.println("Sorry you Failed");
		}
		else if(a>=50 && a<60)
		{
			System.out.println("Student is passed with 'C' Grade");
		}
		else if(a>=60 && a<70)
		{
			System.out.println("Student is passed with 'B' Grade");
		}
		else if(a>=70 && a<90)
		{
			System.out.println("Student is passed with 'A' Grade");
		}
		else if(a>=80 && a<=100)
		{
			System.out.println("Student is passed with Distinction");
		}
		else 
		{
			System.out.println("Invalid input");
		}

	}

}
