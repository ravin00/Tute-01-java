import java.util.Scanner;

public class ex1 {
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a positive number : ");
        int n = scanner.nextInt();

        if (n < 0){
            System.out.println("Please enter a positive number");
        }else {
            long factorial = 1;
            for (int i =1;i<=n;i++){
                factorial *=i;
            }
            System.out.println(n + "! = " + factorial);
        }
        scanner.close();
    }
}
