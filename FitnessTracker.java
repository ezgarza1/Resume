/******************************************************************************
Programmer: Ezequiel J. Garza
Date: 02/07/2024
Lab 4
Instructor: Dr. Rafael Azuaje
College: NorthWest Vista College
*******************************************************************************/
import java.util.Scanner;

public class FitnessTracker {
    private int steps;
    private double caloriesBurned;

    public FitnessTracker() {
        steps = 0;
        caloriesBurned = 0;
    }

    public void addSteps(int additionalSteps) {
        steps += additionalSteps;
        caloriesBurned += calculateCaloriesBurned(additionalSteps);
    }

    private double calculateCaloriesBurned(int steps) {
        // Assuming a rough estimation of calories burned per step
        // You may replace this with a more accurate formula
        return steps * 0.05; // Adjust this value according to your needs
    }

    public void displayProgress() {
        System.out.println("Steps taken today: " + steps);
        System.out.println("Calories burned today: " + caloriesBurned);
    }

    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        Scanner scanner = new Scanner(System.in);

        boolean continueTracking = true;
        while (continueTracking) {
            System.out.println("Enter the number of steps taken (or 0 to stop tracking): ");
            int steps = scanner.nextInt();
            if (steps == 0) {
                continueTracking = false;
            } else {
                tracker.addSteps(steps);
                tracker.displayProgress();
            }
        }

        System.out.println("Fitness tracking stopped. Here's your final progress:");
        tracker.displayProgress();
        
        scanner.close();
    }
}
