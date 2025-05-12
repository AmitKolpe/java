
import java.util.Scanner;



class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2:");
        double num2 = sc.nextDouble();


        System.out.println("Choose operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.Division");
        
        System.out.println("Enter choice 1-4");
        int choice = sc.nextInt();
        double result;
        switch(choice){

            case 1:
             
            result = num1+num2;
            System.out.println("Result:"+result);
            break;
               
            case 2:
              
             result = num1-num2;
             System.out.println("Result:"+result);
             break;


             case 3:
             result = num1*num2;
             System.out.println("Result:"+result);
             break;


             case 4:
             result = num1%num2;
             System.out.println("Result:"+result);
             break;



             default:
             System.out.println("Invalid!! choice");




        }

    }
}