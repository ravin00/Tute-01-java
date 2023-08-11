import java.util.Scanner;

public class ex3 {
    public static void main (String[]args){
        Scanner scanner =  new Scanner (System.in);
        boolean continueLoop = true;


        while (continueLoop){
        System.out.print("Enter an integer number : ");
        int number =  scanner.nextInt();

        System.out.print("Enter the range : ");
        int range = scanner.nextInt();

        System.out.println("Multipication table for " + number +" up to " + range + ":");

        for (int i = 0; i <= range; i++){
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }

        System.out.println("Do you want to enter another number : ");
        String response = scanner.next();

        if(!response.equalsIgnoreCase("Yes")){
            continueLoop = false;
        }

System.out.println("Program Finished");
scanner.close();
}

  }
}
