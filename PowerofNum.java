import java.util.*;

public class PowerofNum {
    public static void main(String[] args) {
        double x=2.0000;
        int n=10;
        long absN = Math.abs((long)n); // Use long to handle the case where n is Integer.MIN_VALUE
        double result = 1.0;

        while (absN > 0) {
            if ((absN % 2) == 1) {
                result *= x;
            }
            x *= x;
            absN /= 2;
        }

        if (n < 0) {
            result = 1 / result;
        }

        System.out.println(result);
        
    }
}
