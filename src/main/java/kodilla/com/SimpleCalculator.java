import java.util.*;
import java.lang.*;
import java.io.*;

class SimpleCalculator {
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return a - b;
    }
}

class Application {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.addAToB(3, 5);

        System.out.println(result);
    }

}