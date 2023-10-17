import java.util.Scanner;
import java.security.SecureRandom;
public class passwordgen {

        public static void main(String[] args){
            // password length
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the password:");
            int len = sc.nextInt();

            String pass = passgen(len);
            System.out.println("Generated password: " + pass);
        }

        public static String passgen(int leng){
            String charac = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$&%()_-+=<>?*";

            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < leng; i++) {
                int index = random.nextInt(charac.length());
                password.append(charac.charAt(index));
            }

            return password.toString();
        }
}
