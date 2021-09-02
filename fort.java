import java.util.Scanner;

public class fort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 5;
        String name;
        int age;
        System.out.println("Whats Your Name and Age? ");
        name = scan.next();
        age = scan.nextInt();
        System.out.println("Your Name is: " + name + " and you are " + age + " Years old.");

    }
}
