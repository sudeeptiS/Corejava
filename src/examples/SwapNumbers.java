package examples;

public class SwapNumbers {

    public static void main(String[] args) {
        //from   www. j  a va  2  s  .  co m
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" +num2);

        //swap the value
      swap(num1, num2);

        System.out.println("Program completed");

        read();
    }


    private static void read(){

        System.out.println("reading variable ");
    }

    private static void swap(int test1, int test2) {

        int temp = test1;
        test1 = test2;
        test2 = temp;

        System.out.println("After Swapping");

        System.out.println("Value of test1 is :" + test1);
        System.out.println("Value of test2 is :" +test2);

    }
}
