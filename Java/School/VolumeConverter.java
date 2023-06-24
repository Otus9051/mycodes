import java.util.Scanner;

public class VolumeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Volume Converter");
        System.out.println("----------------");

        while (!exit) {
            System.out.println("1. Cubic Meters");
            System.out.println("2. Liters");
            System.out.println("3. Cubic Feet");
            System.out.println("4. Gallons");
            System.out.print("Enter the input unit (1-4): ");
            int inputUnit = scanner.nextInt();

            System.out.print("Enter the volume: ");
            double volume = scanner.nextDouble();

            System.out.println("1. Cubic Meters");
            System.out.println("2. Liters");
            System.out.println("3. Cubic Feet");
            System.out.println("4. Gallons");
            System.out.print("Enter the output unit (1-4): ");
            int outputUnit = scanner.nextInt();

            double convertedVolume = convertVolume(volume, inputUnit, outputUnit);

            System.out.println("The converted volume is: " + convertedVolume);

            System.out.println("Do you want to continue? (Y/N): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("N")) {
                exit = true;
            }
        }

        scanner.close();
    }

    public static double convertVolume(double volume, int inputUnit, int outputUnit) {
        double convertedVolume = 0.0;

        switch (inputUnit) {
            case 1: // Cubic Meters
                switch (outputUnit) {
                    case 1: // Cubic Meters
                        convertedVolume = volume;
                        break;
                    case 2: // Liters
                        convertedVolume = volume * 1000;
                        break;
                    case 3: // Cubic Feet
                        convertedVolume = volume * 35.3147;
                        break;
                    case 4: // Gallons
                        convertedVolume = volume * 264.172;
                        break;
                }
                break;
            case 2: // Liters
                switch (outputUnit) {
                    case 1: // Cubic Meters
                        convertedVolume = volume / 1000;
                        break;
                    case 2: // Liters
                        convertedVolume = volume;
                        break;
                    case 3: // Cubic Feet
                        convertedVolume = volume * 0.0353147;
                        break;
                    case 4: // Gallons
                        convertedVolume = volume * 0.264172;
                        break;
                }
                break;
            case 3: // Cubic Feet
                switch (outputUnit) {
                    case 1: // Cubic Meters
                        convertedVolume = volume * 0.0283168;
                        break;
                    case 2: // Liters
                        convertedVolume = volume * 28.3168;
                        break;
                    case 3: // Cubic Feet
                        convertedVolume = volume;
                        break;
                    case 4: // Gallons
                        convertedVolume = volume * 7.48052;
                        break;
                }
                break;
            case 4: // Gallons
                switch (outputUnit) {
                    case 1: // Cubic Meters
                        convertedVolume = volume * 0.00378541;
                        break;
                    case 2: // Liters
                        convertedVolume = volume * 3.78541;
                        break;
                    case 3: // Cubic Feet
                        convertedVolume = volume * 0.133681;
                        break;
                    case 4: // Gallons
                        convertedVolume = volume;
                        break;
                }
                break;
            default:
                System.out.println("Invalid unit!");
                break;
        }

        return convertedVolume;
    }
}
