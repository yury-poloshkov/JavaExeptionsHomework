package task02;
/*
Если необходимо, исправьте данный код (задание 2

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

*/

public class Task02 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) intArray[i] = (int) (Math.random() * 100);

        //try {
        int d = intArray[0];
        if (d != 0) {
            double catchedRes1 = (double)intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
        //} catch (ArithmeticException e) {
            System.out.println("Catching exception: / by zero");
        }
    }
}
