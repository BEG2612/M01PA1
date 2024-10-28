public class ConversionTable {
    public static void main(String[] args) {
        // Define range for feet to meters conversion
        int startFeet = 1;
        int endFeet = 10;
        double conversionFactor = 0.305;

        // Prints header for the feet to meters table
        System.out.println("Feet to Meters Table");
        System.out.println("--------------------------------");
        System.out.printf("%-10s %-10s%n", "Feet", "Meters");
        for (int feet = startFeet; feet <= endFeet; feet++) {
            double meters = feet * conversionFactor;
            System.out.printf("%-10d %-10.3f%n", feet, meters); // Rounded to the nearest thousandth
        }

        // Separator for readability
        System.out.println("\nMeters to Feet Table");
        System.out.println("--------------------------------");
        System.out.printf("%-10s %-10s%n", "Meters", "Feet");
        
        // Define range for meters to feet conversion
        for (int meters = 20; meters <= 65; meters += 5) {
            double feet = meters / conversionFactor;
            System.out.printf("%-10d %-10.3f%n", meters, feet); // Rounded to the nearest thousandth
        }
    }
}
