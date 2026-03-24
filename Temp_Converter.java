import java.util.*;
public class Temp_Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Static value
        double fahrenheit = 96.7;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("[Static input] " + fahrenheit + "°F = " + celsius + "°C");
        // Dynamic 
        System.out.println("Enter temperature in Fahrenheit: ");
        double d_fahrenheit = sc.nextDouble();
        double d_celsius = (d_fahrenheit - 32) * 5 / 9;
       
        System.out.println("[Dynamic input] " + d_fahrenheit + "°F = " + d_celsius + "°C");

    }
}