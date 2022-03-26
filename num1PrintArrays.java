import java.util.Arrays;
import java.util.Scanner;

public class num1PrintArrays {

    public static void main(String[] args) {
        // IMPORT JAVA SCANNER - for user input //
        Scanner sc = new Scanner(System.in);

        // INPUT PROMPTS //
        int size_array;
        System.out.println("This is Mr. Array!\nDeclare size of the array! (integer): ");
        size_array = sc.nextInt();
        // **if size of array is less than 0** //
        while (size_array < 0) {
            System.out.println("Size of Array should only be more than 0: ");
            size_array = sc.nextInt();
        }

        // INSERT VALUES - inserting numbers into the array //
        int items_num[] = new int[size_array];
        System.out.println("Input values of the array contents (seperate with space) ");

        for (int x = 0; x < items_num.length; x++) {
            System.out.printf("Enter value/s to be inserted into the array [%d] : ", x);
            items_num[x] = sc.nextInt();
        }

        // DISPLAYS RESULT //
        System.out.println("Your Custom Array: " + Arrays.toString(items_num));
        sc.close();
    }
};