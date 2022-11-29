import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        String password = scanner.next();
        String confirmPassword = scanner.next();
        Password.passwordConfirmation(login,password,confirmPassword);
    }
}