import java.util.Scanner;

/**
 * Asks the user to microwave sub, pizza, or soup.
 *
 * @author Jessah
 * @version 1.0 @2024-02-23
 */
public final class Microwave2 {

  /** Private constructor to prevent instantiation of this utility class. */
  private Microwave2() {
    // whitespace
  }

  /**
   * Print message.
   *
   * @param args Command-line arguments (not used in program).
   */
  public static void main(final String[] args) {

    // Declare constants food time, minutes, seconds, and total time.
    final double SOUP_TIME = 105;
    final double SUB_TIME = 60;
    final double PIZZA_TIME = 45;
    double totalTime = 0;
    double totalSeconds = 0;
    double totalMinutes = 0;

    // Get input for item.
    System.out.print("What would you like to microwave? (sub,pizza,soup): ");
    final Scanner type = new Scanner(System.in);
    final String userFoodString = type.nextLine();

    // Get input for amount.
    System.out.print("How many would you like to microwave? (1,2,3): ");
    final Scanner amount = new Scanner(System.in);
    final String foodNumString = amount.nextLine();

    // Checks if user imputed sub, pizza, or soup
    if (userFoodString.equals("sub")
        || userFoodString.equals("pizza")
        || userFoodString.equals("soup")) {
      try {
        // Convert amount to double
        final double foodNum = Double.parseDouble(foodNumString);

        if (foodNum == 1) {
          // For items with 1 amount.
          if (userFoodString.equals("sub")) {
            totalTime = SUB_TIME;

          } else if (userFoodString.equals("pizza")) {
            totalTime = PIZZA_TIME;

          } else {
            totalTime = SOUP_TIME;
          }

        } else if (foodNum == 2) {
          // For items with 2 amount.
          if (userFoodString.equals("sub")) {
            totalTime = SUB_TIME * 1.5;

          } else if (userFoodString.equals("pizza")) {
            totalTime = PIZZA_TIME * 1.5;

          } else {
            totalTime = SOUP_TIME * 1.5;
          }
        } else if (foodNum == 3) {
          // For items with 3 amount.
          if (userFoodString.equals("sub")) {
            totalTime = SUB_TIME * 2;

          } else if (userFoodString.equals("pizza")) {
            totalTime = PIZZA_TIME * 2;

          } else {
            totalTime = SOUP_TIME * 2;
          }
        }

        // Calculate time.
        totalMinutes = (int) (totalTime / 60);
        totalSeconds = totalTime - (totalMinutes * 60);
        // Display time.
        System.out.println(
            "It will take "
                + totalMinutes
                + " minutes and "
                + totalSeconds
                + " seconds to microwave your food");
      } catch (NumberFormatException error) {
        // For any string input.
        System.out.println("Invalid amount " + error.getMessage());
        System.out.println();
      }
    } else {
      // For any invalid item.
      System.out.print(userFoodString + " is an invalid item.");
    }

    // Close scanners.
    type.close();
    amount.close();
  }
}
