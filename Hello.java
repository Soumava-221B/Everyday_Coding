import java.util.Scanner;
public class Hello {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = sc.next();
        System.out.print("Input your last name: ");
        String lname = sc.next();
        System.out.println("Hello");
        System.out.print(fname+" "+ lname);
    }
}
