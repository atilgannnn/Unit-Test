package Day3;

import java.util.Arrays;

public class C03_ArraysEqual {

    // 2 Array Eşit mi?

    //{2,3,4}  {4,3,2}

    public static boolean arrayKiyasla(Object[] a, Object[] b){

        Arrays.sort(a);
        Arrays.sort(b);



        return Arrays.equals(a,b);

    }







}
