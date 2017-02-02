package main;

import java.io.IOException;

public class Main {

    public static int[] array = {1,2,3,4,5,6,8,9,10};
    public static double[] outputArray = {1,2,3,4,5,6,8,9,10};

    public static void main(String[] args) throws IOException {
        AlghoritmFindLostElement myObject = new AlghoritmFindLostElement();
        int k = myObject.findLostElement(outputArray);
        System.out.println(k);
    }
}
