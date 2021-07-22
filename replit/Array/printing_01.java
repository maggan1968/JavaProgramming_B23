package Array;

import java.util.Scanner;

import static java.lang.System.*;

public class printing_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

            for (int j = 0; j <= arr.length-1; j++)
                System.out.println(arr[j]);
        }
    }

/*
The code provided in your main method will take in five Strings
and save them into an array called arr. Print out the first three letter of
each element on separate lines. You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
 */