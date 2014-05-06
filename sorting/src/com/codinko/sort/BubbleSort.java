package com.codinko.sort;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("How many numbers to sort ?");
		int count = scanner.nextInt();
		int numbers[] = new int[count];
		System.out.println("Enter list of numbers to Sort: ");
		for (int i = 0; i < count; i++) {
			System.out.println("Enter number");
			numbers[i] = scanner.nextInt();
		}
		int temp;
		for (int i = 0; i < (count - 1); i++) {
			for (int j = 0; j < count - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) // '> for ascending order'
				{
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		System.out.println("List before sorting..");
		for (int i = 0; i < count; i++) {
			System.out.println(numbers[i]);
		}
		Arrays.sort(numbers);

		System.out.println("Sorted list");
		for (int i = 0; i < count; i++) {
			System.out.println(numbers[i]);
		}
	}
}
