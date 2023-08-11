import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a series of numbers : ");

        int sum = 0;
        int count = 0;
        
        while (true){
        int number = scanner.nextInt();

            if (number < 0){
                break;
            }
            sum += number;
            count++;
        }

        if (count > 0){
            double average = (double) sum / count;
            System.out.println("Average : " + average);
        }else{
            System.out.println("No valid numbers");
        }
        scanner.close();
    }
}
