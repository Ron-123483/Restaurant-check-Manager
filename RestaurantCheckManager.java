import java.util.Scanner;

public class RestaurantCheckManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalSales = 0;
        double totalPooledTips = 0;
        int numberOfChecks = 0;

        System.out.println("Welcome to the check manager, please follow the instructions below!");
        // first introduction to the check manager
        while (true) {
            System.out.print("Enter total check amount: ");
            double checkAmount = scanner.nextDouble();

            System.out.print("Enter tip amount: ");
            double tipAmount = scanner.nextDouble();

            System.out.print("Enter total amount: ");
            double totalAmount = scanner.nextDouble();

            // Processing the check
            totalSales += checkAmount;
            totalPooledTips += tipAmount;
            numberOfChecks++;

            System.out.println("Total Sales so far: " + totalSales);
            System.out.println("Current pooled tips so far: " + totalPooledTips);
            System.out.println("Number of Checks:   " + numberOfChecks);

            System.out.print("Do you want to stop(y/n)? ");
            char stopInput = scanner.next().charAt(0);

            if (stopInput == 'y' || stopInput == 'Y') {
                break;
            }
        }

        // Display tip allocation breakdown
        System.out.println("Tip allocation for $" + totalPooledTips + " in tips.");

        // My algorithm for dividing the pooled tip amount
        // Individual Performance Recognition (40%)
        double individualPerformanceShare = 0.4 * totalPooledTips / (numberOfChecks * 5); // Assuming 5 staff members in total

        // Role-Specific Consideration (30%)
        double kitchenShare = 0.3 * totalPooledTips;     //kitchen share
        double chefShare = 0.5 * kitchenShare;           // chef share
        double sousChefShare = 0.3 * kitchenShare;       // sousChefShare

        // Experience and Seniority Recognition (20%)
        double seniorStaffShare = 0.2 * totalPooledTips / 2; // Assuming 2 senior staff members

        // Equal Base Share (10%)
        double equalBaseShare = 0.1 * totalPooledTips / 5; // Assuming 5 staff members in total

        // Print the distribution of money to each staff
        System.out.println("Servers           : $" + individualPerformanceShare);
        System.out.println("    Server 1      : $" + individualPerformanceShare);
        System.out.println("    Server 2      : $" + individualPerformanceShare);
        System.out.println("    Server 3      : $" + individualPerformanceShare);
        System.out.println("Kitchen           : $" + kitchenShare);
        System.out.println("    Chef          : $" + chefShare);
        System.out.println("    Sous-Chef     : $" + sousChefShare);
        System.out.println("Host/Hostess      : $" + individualPerformanceShare);
        System.out.println("Senior Staff      : $" + seniorStaffShare);
    }
}
