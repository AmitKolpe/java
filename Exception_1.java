import java.util.Scanner;

class Exception_1 {
    public static void main(String[] args) {
        int a = 5000;
        int b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        b = sc.nextInt();
        
        try {
            int c = a / b;
            System.out.println("The division: " + c);
        } catch (Throwable e) {
            System.out.println("An exception occurred:");
            System.out.println(e);
        }
    }
}
