import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        System.out.print("Enter a shift value: ");
        int shift = sc.nextInt();
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c >= 'A' && c <= 'Z')
                encrypted.append((char)((c - 'A' + shift) % 26 + 'A'));
            else if (c >= 'a' && c <= 'z')
                encrypted.append((char)((c - 'a' + shift) % 26 + 'a'));
            else
                encrypted.append(c);
        }
        System.out.println("Encrypted message: " + encrypted);
        sc.close();
    }
}
