package main;


public class AlghoritmFindLostElement {

    public int findLostElement(double[] array)
    {
        int i;
        for (i=1; i<array.length; i++)
        {
            double k = array[i-1]/i;
            if (k!=1)
                break;
        }
        return i;
    }
}
