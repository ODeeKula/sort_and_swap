package co.projectcodex.sortandswap;

import java.util.ArrayList;

public class SwapMe {

    public static String[] swapFirstWithLast(String[] values) {
        String first = values[0];
        String last =  values[3];

        values[0] = last;
        values[3] = first;

        return values;
    }

    public static String[] swapFirstWithSecond(String[] values) {
        String first = values[0];
        String second = values[1];
        values[0] = second;
        values[1] = first;
        return values;
    }

    public static int[] swapNeighbours(int[] numbers) {

        boolean swap = true;

       while(swap){
            swap = false;
           for (int i = 0; i <numbers.length ; i++) {

               if(i+1 < numbers.length) {
                   int current = numbers[i];
                   int next = numbers[i + 1];
                   if (current > next) {
                       numbers[i] = next;
                       numbers[i+1] = current;
                       swap= true;
                       System.out.println(current);
                       System.out.println(next);
                       System.out.println("-----------");
                   }
               }
           }
       }
        return numbers;
    }
}
