import java.util.Scanner;

public class StringEqual {
String s1;
String s2;

    public static void main(String[] args) {
        System.out.println("Enter a 1st string");
       Scanner n =new Scanner(System.in);
       String s1=n.nextLine();
        System.out.println("Enter the 2nd string");
        String s2=n.nextLine();

        System.out.println(s1.equals(s2));// using equals method.
        System.out.println(s1.equalsIgnoreCase(s2)); // using caseignorecase method.
        System.out.println(s1==s2 ); // using operators equals.
    }
}
