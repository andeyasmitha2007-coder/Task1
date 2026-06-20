import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double temperature, result;

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");

        System.out.print("Enter your choice (1-6): ");
        choice = sc.nextInt();

        System.out.print("Enter the temperature value: ");
        temperature = sc.nextDouble();

        switch (choice) {

            case 1:
                if (temperature < -273.15) {
                    System.out.println("Error: Celsius cannot be below -273.15 °C.");
                    break;
                }

                result = (temperature * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f °F%n", result);
                break;

            case 2:
                if (temperature < -273.15) {
                    System.out.println("Error: Celsius cannot be below -273.15 °C.");
                    break;
                }

                result = temperature + 273.15;
                System.out.printf("Temperature in Kelvin: %.2f K%n", result);
                break;

            case 3:
                if (temperature < -459.67) {
                    System.out.println("Error: Fahrenheit cannot be below -459.67 °F.");
                    break;
                }

                result = (temperature - 32) * 5 / 9;
                System.out.printf("Temperature in Celsius: %.2f °C%n", result);
                break;

            case 4:
                if (temperature < -459.67) {
                    System.out.println("Error: Fahrenheit cannot be below -459.67 °F.");
                    break;
                }

                result = (temperature - 32) * 5 / 9 + 273.15;
                System.out.printf("Temperature in Kelvin: %.2f K%n", result);
                break;

            case 5:
                if (temperature < 0) {
                    System.out.println("Error: Kelvin cannot be below 0 K.");
                    break;
                }

                result = temperature - 273.15;
                System.out.printf("Temperature in Celsius: %.2f °C%n", result);
                break;

            case 6:
                if (temperature < 0) {
                    System.out.println("Error: Kelvin cannot be below 0 K.");
                    break;
                }

                result = (temperature - 273.15) * 9 / 5 + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f °F%n", result);
                break;

            default:
                System.out.println("Invalid choice! Please select a number between 1 and 6.");
        }

        sc.close();
    }
}