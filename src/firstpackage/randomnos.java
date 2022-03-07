package firstpackage;

import java.util.*;

public class randomnos{
    public static void main(String args[])
    {
        Random r=new Random();
        int arr[]=new int[6];

        for (int i = 0; i < 6 ; i++)
        {
            arr[i]=r.nextInt(100);
            System.out.println(arr[i]);

        }
        int sum = 0;
        for(int num : arr){

            sum+=num;
        }
        System.out.println("addition:->"+sum);

    }


}
