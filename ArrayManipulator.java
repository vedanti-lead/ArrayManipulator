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
        for(int i = 0; i<inputNumber.length; i++){
            numbers[i] = Integer.parseInt(inputNumbers[i]);
            }
    } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only");
            return;

}
        while(true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Sort the array");
            System.out.println("2. Reverse the array");
            System.out.println("3. Remove duplicates");
            System.out.println("Exit");
            System.out.println("Your Choice : ");

            int choice;
            try{
                choice = sc.nextInt();
            } catch(InoutMismatchException e) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                sc.next();
                continue;
            }
            switch(choice) {
                case 1: 
                    int[] reversedArray = reverse(numbers);
                    System.out.println("Reversed Arrat: ");
                    displayArray(reversedArray);
                    break;
                case 2:
                    int[] sortedArray = sort(numbers.clone());
                    System.out.println("Sorted array: ");
                    displayArray(sortedArray);
                    break;
                case 3:
                    int[] uniqueArray = duplicate(numbers);
                        System.out.println("Array with duplicates removed: ");
                    displayArray(uniqueArray);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please choose again.);
            }
        }
    }
}
                    
                    
                    
 
