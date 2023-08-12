import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a temperature value in F");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double tempincelsius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println("Temperature in celsius is"+ " "+tempincelsius);
		
		
	}

}
