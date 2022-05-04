import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) throws Exception {
        Scanner comparison = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.valueOf(comparison.nextLine());
        System.out.println("Enter another number");
        int number2 = Integer.valueOf(comparison.nextLine());

        if (number == number2) {
            System.out.println("Numbers are the same");
        } 
        else if (number > number2){
            System.out.println("The first number was larger than the second");
        }else{
            System.out.println("The second number was larger than the first");  
        }

    }
}
