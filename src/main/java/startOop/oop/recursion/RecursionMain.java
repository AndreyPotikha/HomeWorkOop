package startOop.oop.recursion;

import java.util.LinkedList;
import java.util.List;

public class RecursionMain {

    public static void main(String[] args) {

//        f(5);
//        a(3);
//        fromK(6);
//        toK(6);
//        System.out.println(simpelNumber(5));
        System.out.println(recursion(3, 2));

        List<String> kk = new LinkedList<>();
    }

    public static boolean recursion(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int factorialK(int k) {
        int result;
        if (k == 1) {
            return 1;
        }
        result = factorialK(k - 1) * k;
        return result;
    }

    static void toK(int k) {
        if (k > 2) {
           toK(k - 1);
        }
        System.out.println(k);
    }

    static void fromK(int k) {
        System.out.println(k);
        if (k > 2) {
            fromK(k - 1);
        }
    }

    static void f(int k) {
//        System.out.println(k);
        if (k > 2) {
            f(k - 1);
        }
        System.out.println(k);
    }

    static int a(int k) {
        if (k <= 1) {
            return 1;
        }
        return k + a(k - 1);
    }
}
