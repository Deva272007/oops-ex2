import java.util.*;

public class exp2 {

    public static void main(String[] args) {
        char[] small = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                        'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] capital = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                          'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password length: ");
        int length = sc.nextInt();

        if (length < 3) {
            System.out.println("Password length must be at least 3 to include all character types.");
            return;
        }

        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        // Ensure at least one of each type
        password.append(capital[rand.nextInt(capital.length)]);
        password.append(small[rand.nextInt(small.length)]);
        password.append(numbers[rand.nextInt(numbers.length)]);

        // Fill the rest of the password
        for (int i = 3; i < length; i++) {
            int choice = rand.nextInt(3); // 0: small, 1: capital, 2: number
            if (choice == 0) {
                password.append(small[rand.nextInt(small.length)]);
            } else if (choice == 1) {
                password.append(capital[rand.nextInt(capital.length)]);
            } else {
                password.append(numbers[rand.nextInt(numbers.length)]);
            }
        }

        // Shuffle the characters to randomize their positions
        List<Character> passwordChars = new ArrayList<>();
        for (char c : password.toString().toCharArray()) {
            passwordChars.add(c);
        }
        Collections.shuffle(passwordChars);

        StringBuilder finalPassword = new StringBuilder();
        for (char c : passwordChars) {
            finalPassword.append(c);
        }

        System.out.println("The Generated Password is: " + finalPassword);
    }
}
