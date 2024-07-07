package com.basicprograms.arrayQuestions;

import java.util.Arrays;

public class AscendingDescendingHalfs 
{
    public static void main(String[] args) 
    {
        // Initialize an array with integer values
        int n[] = {12, 56, 34, 23, 76, 32, 75, 90, 345};
        
        // Create an instance of IntSort class to access sorting methods
        IntSort is = new IntSort();
        
        // Print the original array
        System.out.println("Original array:");
        for (int t : n) 
        {
            System.out.print(t + " ");
        }
        System.out.println("\n");

        // Sort and print the first half of the array in ascending order
        System.out.println("First half sorted in ascending order:");
        for (int t : is.ascending(n, n.length / 2)) 
        {
            System.out.print(t + " ");
        }
        
        // Sort and print the second half of the array in descending order
        System.out.println("\nSecond half sorted in descending order:");
        for (int t : is.descending(n, n.length / 2, n.length)) 
        {
            System.out.print(t + " ");
        }
    }
}

class IntSort {

    // Method to sort the entire array in ascending order
    int[] ascending(int n[]) {
        int res[] = new int[n.length];
        res = Arrays.copyOf(n, n.length);
        Arrays.sort(res); // Sort the copied array in ascending order
        return res;
    }

    // Method overloading: Sort the array up to the specified end index in ascending order
    int[] ascending(int n[], int end) 
    {
        int res[] = new int[end];
        res = Arrays.copyOf(n, end);
        Arrays.sort(res); // Sort the copied portion of the array in ascending order
        return res;
    }

    // Method overloading: Sort a subarray from start index to end index in ascending order
    int[] ascending(int n[], int start, int end)
    {
        int res[] = new int[end - start];
        res = Arrays.copyOfRange(n, start, end);
        Arrays.sort(res); // Sort the copied subarray in ascending order
        return res;
    }

    // Method to sort the entire array in descending order
    int[] descending(int n[]) 
    {
        int res[] = new int[n.length];
        int copy[] = Arrays.copyOf(n, n.length);
        Arrays.sort(copy); // Sort the copied array in ascending order
        for (int i = 0, k = res.length - 1; i < res.length; i++, k--)
        {
            res[i] = copy[k]; // Reverse the sorted array to get descending order
        }
        return res;
    }

    // Method overloading: Sort the array up to the specified end index in descending order
    int[] descending(int n[], int end) 
    {
        int res[] = new int[end];
        int copy[] = Arrays.copyOf(n, end);
        Arrays.sort(copy); // Sort the copied portion of the array in ascending order
        for (int i = 0, k = res.length - 1; i < res.length; i++, k--) 
        {
            res[i] = copy[k]; // Reverse the sorted array to get descending order
        }
        return res;
    }
    // Method overloading: Sort a subarray from start index to end index in descending order
    int[] descending(int n[], int start, int end) 
    {
        int res[] = new int[end - start];
        int copy[] = Arrays.copyOfRange(n, start, end);
        Arrays.sort(copy); // Sort the copied subarray in ascending order
        for (int i = 0, k = res.length - 1; i < res.length; i++, k--)
        {
            res[i] = copy[k]; // Reverse the sorted array to get descending order
        }
        return res;
    }
}

