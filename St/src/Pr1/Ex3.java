package Pr1;

import java.util.Random;
import java.util.Vector;

public class Ex3 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Random rand = new Random();

        v.addElement(new Integer(rand.nextInt(51) + 10));
    }
}
