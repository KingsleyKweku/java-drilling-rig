import java.util.Scanner;

public class DrillingRig {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalOil = 0.0;
        double pressure = 10.0;
        int burstCount = 0;
        final double MAX_PRESSURE = 85.0;

        System.out.println("🛢️ DRILLING RIG SIMULATOR STARTED 🛢️");

        while (true) {
            System.out.print("\nEnter oil yield for this drill (or -1 to stop): ");
            double yield = input.nextDouble();

            if (yield == -1) {
                break;
            }

            // Add oil
            totalOil += yield;

            // Increase pressure based on drilling
            pressure += yield * 0.8;

            // Safety check
            if (pressure > MAX_PRESSURE) {
                burstCount++;
                System.out.println("⚠️ WARNING: Pressure too high! Well burst occurred!");
                pressure = 20; // reset pressure after burst
            }

            System.out.println("📊 Current Oil: " + totalOil);
            System.out.println("💨 Pressure Level: " + pressure);
            System.out.println("💥 Burst Count: " + burstCount);
        }

        System.out.println("\n🏁 DRILLING STOPPED");
        System.out.println("Total Oil Extracted: " + totalOil);
        System.out.println("Total Bursts: " + burstCount);

        input.close();
    }
}