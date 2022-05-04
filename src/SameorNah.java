import java.util.Scanner;
public class SameorNah {
    public static void main(String[] args) throws Exception {
        Scanner same = new Scanner(System.in);
        System.out.println("Enter a word");
        String number = same.nextLine();
        System.out.println("Enter another word");
        String number2 = same.nextLine();
       
        if (number.equals(number2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    
}
}
