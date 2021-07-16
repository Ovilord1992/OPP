package Table_6.Task_1;

import Table_6.Task_2.IMath;
import Table_6.Task_3.ISort;

import java.util.Arrays;

public class Array implements IShow, IMath, ISort {
    int[] ar = new int[5];

    public int[] getAr() {
        return ar;
    }

    public void setAr(int... ar) {
        this.ar = ar;
    }

    @Override
    public void print() {
        System.out.println(arr(ar));
    }

    @Override
    public void print(String info) {
        System.out.println(arr(ar) + " " + info);
    }

    private String arr(int... arr){
        return Arrays.toString(arr);
    }

    @Override
    public int max() {
       Arrays.sort(ar);
        return ar[ar.length - 1];
    }

    @Override
    public int min() {
        return ar[0];
    }

    @Override
    public float avg() {
        float avg = 0;
        for (int i = 0; i < ar.length; i++) {
            avg = avg + ar[i];
        }
        return avg / ar.length;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(ar);
    }

    @Override
    public void sortDesc() {
       int[] a = new int[ar.length];
        for (int i = 0, k = ar.length - 1; i < ar.length; i++, k--) {
            a[i] = ar[k];
        }
        System.out.println(Arrays.toString(a));
    }
}
