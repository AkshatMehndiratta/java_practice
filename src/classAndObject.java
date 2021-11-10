import java.util.Scanner;

public class classAndObject {

    public static  void addition(double a, double b){
        double sum = a+b;
        System.out.println(sum);
    }

    public static void subtraction(double a, double b){
        double sub = a-b;
        System.out.println(sub);
    }

    public static void multiplication(double a, double b){
        double multi = a*b;
        System.out.println(multi);
    }

    public static void division(double a, double b){
        double divide = a/b;
        System.out.println(divide);
    }

    public static void addition(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void subtraction(int a, int b){
        int sub = a-b;
        System.out.println(sub);
    }

    public static void multiplication(int a, int b){
        int multi = a*b;
        System.out.println(multi);
    }

    public static void division(int a, int b){
        int divide = a/b;
        System.out.println(divide);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What type of numbers should you choose -> integer or decimal?");
        String type = sc.nextLine();
        System.out.println("What kind of operation you want to do -> addition, subtraction, multiplication or division");
        String operation = sc.nextLine();
        if(type.trim().equalsIgnoreCase("integer")) {
            System.out.println("Enter two integers to perform operations");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(operation.trim().equalsIgnoreCase("addition")){
                addition(a,b);
            }
            else if(operation.trim().equalsIgnoreCase("subtraction")){
                subtraction(a,b);
            }
            else if(operation.trim().equalsIgnoreCase("multiplication")){
                multiplication(a,b);
            }
            else if(operation.trim().equalsIgnoreCase("division")){
                division(a,b);
            }
            else{
                System.out.println("please choose right operator");
            }
        }
        else if(type.trim().equalsIgnoreCase("decimal")) {
            System.out.println("Enter two rational numbers to perform operations");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if(operation.trim().equalsIgnoreCase("addition")){
                addition(a,b);
            }
            else if(operation.trim().equalsIgnoreCase("subtraction")){
                subtraction(a,b);
            }
            else if(operation.trim().equalsIgnoreCase("multiplication")){
                multiplication(a,b);
            }
            else if(operation.trim().equalsIgnoreCase("division")){
                division(a,b);
            }
            else{
                System.out.println("please choose right operator");
            }
        }
        else {
            System.out.println("please choose right option");
        }
    }
}
