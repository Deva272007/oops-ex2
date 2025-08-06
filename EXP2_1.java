import java.util.Scanner;



public class EXP2_1 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements needed in the array");

        int n = sc.nextInt();

        int[] numbers = new int[n];

        int[] multiples = new int[n]; 

        int count = 0;



        System.out.println("Enter the numbers");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();

        }



        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 3 == 0 && numbers[i] % 9 == 0) {

                multiples[count] = numbers[i];

                count++;

            }

        }



        System.out.print("The numbers that are multiples of both 3 and 9 are: ");

        for (int i = 0; i < count; i++) {

            System.out.print(multiples[i] + " ");

        }

    }

}