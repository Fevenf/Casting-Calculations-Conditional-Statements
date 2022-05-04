public class Casting {
    public static void main(String[] args) throws Exception {
        //1

        double one = 112.35;
        System.out.println("Double: " + one);
        int dataInt =(int)one;
        System.out.println("Int: "+ dataInt);

    // //2
    String data = "49";
    int data2 = 49;
    System.out.println("The string value is: " + data2);
    int num = Integer.parseInt(data);
    System.out.println("The integer value is: " + num);


   
    }
}
