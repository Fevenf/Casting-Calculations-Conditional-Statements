import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) throws Exception {
        Scanner test = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");
        int number = Integer.valueOf(test.nextLine());
        if (number >= 90) {
            System.out.println("Your grade is A ;)");
        } 
        else if (number >= 80){
            System.out.println("Your grade is B :)");
        }
        else if (number >= 70){
            System.out.println("Your grade is C :|");
        }
        else if (number >= 60){
            System.out.println("Your grade is D :/");
        }else{
            System.out.println("Your grade is  F :(");  
        }


}
}