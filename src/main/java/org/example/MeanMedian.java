package org.example;
import java.util.Arrays;
import java.util.Scanner;

    public class MeanMedian {
        public static void main(String[] args) {
            final int NUM_COUNT = 9;
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[NUM_COUNT];

            // Prompt the user to enter nine integers
            System.out.println("Enter " + NUM_COUNT + " integers:");

            for (int i = 0; i < NUM_COUNT; i++) {
                System.out.print("Enter integer #" + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            // Display the entered values
            System.out.println("\nEntered values:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Calculate and display the mean
            double mean = calculateMean(numbers);
            System.out.println("Mean: " + mean);

            // Calculate and display the median
            double median = calculateMedian(numbers);
            System.out.println("Median: " + median);

            input.close();
        }

        // Method to calculate the mean of an array of integers
        private static double calculateMean(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }

        // Method to calculate the median of an array of integers
        private static double calculateMedian(int[] numbers) {
            Arrays.sort(numbers);
            int middleIndex = numbers.length / 2;
            if (numbers.length % 2 == 0) {
                return (numbers[middleIndex - 1] + numbers[middleIndex]) / 2.0;
            } else {
                return numbers[middleIndex];
            }
        }
    }


