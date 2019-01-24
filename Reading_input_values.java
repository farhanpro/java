import java.util.Scanner;
class Reading
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit of numbers for Addition #: ");
		int read =scanner.nextInt();
		int two = 0;
		if(read>0)
    {
		      for(int i=1;i<=read;i++)
          {
			        System.out.println("Enter number in the position #: "+i);
			        int one =scanner.nextInt();
			        scanner.nextLine();
			        two = one +two;
			        if(i==read)
              {
			 	          scanner.close();
			 	          System.out.println("The Total number of Addition is # : "+two);
			          }
		        }
	      }

	}
}
		
