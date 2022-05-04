import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) throws Exception {
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int one = Integer.valueOf(calc.nextLine());
        System.out.println("Enter another number:");
        int two = Integer.valueOf(calc.nextLine());
//1
        int addtion = one + two;
        System.out.println(one + " + " + two + " = " + addtion);
// 2
        int subtruction = one - two;
        System.out.println(one + " -" + two + " = " + subtruction);
//3     
        int multiplication = one * two;
        System.out.println(one + " * " + two + " = " + multiplication);
//4
        double division = (double)one / (double)two;
        System.out.println(one + " / " + two + " = " + division); 
//5
       int modulus = one % two;
       System.out.println(one + " % " + two + "=" +modulus);
    }
}
