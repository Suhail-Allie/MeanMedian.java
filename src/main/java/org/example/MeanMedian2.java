package org.example;
import java.util.Arrays;
import java.util.Scanner;

    public class MeanMedian2 {
        public static void main(String[] args) {
            final int MAX_COUNT = 20;
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[MAX_COUNT];
            int count = 0;

            // Prompt the user to enter values
            System.out.println("Enter up to " + MAX_COUNT + " integers (type 'done' when finished):");

            while (count < MAX_COUNT) {
                System.out.print("Enter integer #" + (count + 1) + ": ");
                if (input.hasNextInt()) {
                    numbers[count] = input.nextInt();
                    count++;
                } else {
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("done")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer or type 'done' to finish.");
                    }
                }
            }

            // Handle case with no input
            if (count == 0) {
                System.out.println("No values were entered.");
                return;
            }

            // Display the entered values
            System.out.println("\nEntered values:");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            // Calculate and display the mean
            double mean = calculateMean(numbers, count);
            System.out.println("Mean: " + mean);

            // Calculate and display the median
            double median = calculateMedian(numbers, count);
            System.out.println("Median: " + median);

            input.close();
        }

        // Method to calculate the mean of an array of integers
        private static double calculateMean(int[] numbers, int count) {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += numbers[i];
            }
            return (double) sum / count;
        }

        // Method to calculate the median of an array of integers
        private static double calculateMedian(int[] numbers, int count) {
            int[] sortedNumbers = Arrays.copyOf(numbers, count);
            Arrays.sort(sortedNumbers);
            int middleIndex = count / 2;

            if (count % 2 == 0) {
                // Even number of elements: median is average of two middle values
                return (sortedNumbers[middleIndex - 1] + sortedNumbers[middleIndex]) / 2.0;
            } else {
                // Odd number of elements: median is middle value
                return sortedNumbers[middleIndex];
            }
        }
    }


