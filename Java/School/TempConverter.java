import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("--------------------");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Enter the input unit (1-3): ");
        int inputUnit = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Enter the output unit (1-3): ");
        int outputUnit = scanner.nextInt();

        double convertedTemperature = convertTemperature(temperature, inputUnit, outputUnit);

        System.out.println("The converted temperature is: " + convertedTemperature);

        scanner.close();
    }

    public static double convertTemperature(double temperature, int inputUnit, int outputUnit) {
        double convertedTemperature = 0.0;

        switch (inputUnit) {
            case 1: // Celsius
                switch (outputUnit) {
                    case 1: // Celsius
                        convertedTemperature = temperature;
                        break;
                    case 2: // Fahrenheit
                        convertedTemperature = (temperature * 9 / 5) + 32;
                        break;
                    case 3: // Kelvin
                        convertedTemperature = temperature + 273.15;
                        break;
                }
                break;
            case 2: // Fahrenheit
                switch (outputUnit) {
                    case 1: // Celsius
                        convertedTemperature = (temperature - 32) * 5 / 9;
                        break;
                    case 2: // Fahrenheit
                        convertedTemperature = temperature;
                        break;
                    case 3: // Kelvin
                        convertedTemperature = (temperature + 459.67) * 5 / 9;
                        break;
                }
                break;
            case 3: // Kelvin
                switch (outputUnit) {
                    case 1: // Celsius
                        convertedTemperature = temperature - 273.15;
                        break;
                    case 2: // Fahrenheit
                        convertedTemperature = (temperature * 9 / 5) - 459.67;
                        break;
                    case 3: // Kelvin
                        convertedTemperature = temperature;
                        break;
                }
                break;
            default:
                System.out.println("Invalid unit!");
                break;
        }

        return convertedTemperature;
    }
}
