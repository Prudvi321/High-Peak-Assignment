import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int minimumDiff(int array[], int N, int M)
    {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i=0; i<= N-M;i++)
            minDiff = Math.min(minDiff, array[i + M - 1] - array[i]);
        return minDiff;
    }

    static int MinimumELements(int result,int array[], int N, int M)
    {
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++)
        {
            minDiff = Math.min(minDiff, array[i + M - 1] - array[i]);
            if (result==minDiff)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {

        int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        String goodies[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
        int N = array.length;
        System.out.println("Enter the number of employees");
        Scanner s = new Scanner(System.in);
        int M=s.nextInt();
        int minDiff=minimumDiff(array, N, M);
        System.out.println("Number of the employees:"+M);
        int startindex=MinimumELements(minDiff,array,N,M);
        System.out.println("Here the goodies that are selected for distribution are:");
        for(int i=startindex;i<startindex+M;i++)
            System.out.println(goodies[i]);
        System.out.println("\n");
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+minDiff);
    }
}