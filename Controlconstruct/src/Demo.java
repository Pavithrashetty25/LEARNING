import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks=scan.nextInt();
		System.out.println("Welcome to kodnest");
		checkEligibilty(marks);
	}
		public static void checkEligibilty(int  marks) {
			if(marks>=80)
			{
				System.out.println("Welcome to  tech Club");
			}
		}
		
	}


