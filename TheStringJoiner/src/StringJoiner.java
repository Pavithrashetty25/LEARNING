import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your First name");
			String str1=scan.next();
			System.out.println("Enter the Second name"); 
			String str2=scan.next();
			System.out.println(joinStrings(str1,str2));
	}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}
}
