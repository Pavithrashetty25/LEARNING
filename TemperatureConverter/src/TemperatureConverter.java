import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of Temperture in Fahrenheit");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double c=temperatureConverterApp.convertFahrenheitToCelsius();
		System.out.println(c);
		
	}

}
