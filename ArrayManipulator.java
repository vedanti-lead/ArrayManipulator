import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayManipulator {
    //sort the array
    public static int[] sort(int[] arr)
    {
        Arrays.sort(arr);
        return arr;

    }
    //reverse an array
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    //duplicates
    public static int[] duplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] uni = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uni[index++] = num;
        }
        return uni;
    }
    //display the array
    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input from user
        System.out.println("Enter the numbers separated by spaces")'
        String input = sc.nextLine();
        String[] inputNumbers = input.split("\\s+");
        int[] numbers = new int[inputNumbers.length];

        //string arr to int arr
        try {
        for(int i = 0; i)}
    }

}
 