import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String first_name, last_name;
        first_name = scan();
        last_name = scan();

        PrintName.printBoth(first_name, last_name);
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        String scaned = scanner.next();
        scanner.close();
        return scaned;
    }
}