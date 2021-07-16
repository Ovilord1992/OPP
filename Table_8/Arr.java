package Table_8;

import java.util.Arrays;


public abstract class Arr {
    private int[] mass;

    public void setMass(int... mass) {
        this.mass = mass;
    }

    public void randomSet(int massLenth) {
        int[] a = new int[massLenth];
        this.mass = a;
        for (int i = 0; i < massLenth; i++) {
            mass[i] = (int) (Math.random() * (100 - 1)) + 100;
        }
    }

    public void print() {
        System.out.println(java.util.Arrays.toString(java.util.Arrays.stream(mass).toArray()));
    }

    public int max() {
        return java.util.Arrays.stream(mass).max().getAsInt();
    }

    public int min() {
        return java.util.Arrays.stream(mass).min().getAsInt();
    }

    public double avg() {
        return java.util.Arrays.stream(mass).average().getAsDouble();
    }

    public void sort() {
        java.util.Arrays.stream(mass).sorted();
    }

    public void reverseSort() {
        sort();
        int[] a = new int[mass.length];
        for (int i = 0, k = a.length - 1; i < a.length; i++, k--) {
            a[i] = mass[k];
        }
        mass = a;
    }

    public int binarySearch(int item) {
        int position;
        int last = 0;
        position = (mass[0] + mass.length) / 2;

        while ((mass[position] != item) && (mass[0] <= mass.length)) {
            if (mass[position] > item) {
                last = position - 1;
            } else {
                mass[0] = position + 1;
            }
            position = (mass[0] + last) / 2;
        }
        return position;
    }

    public int[] repl(int item, int itrmRepl) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == item) {
                mass[i] = itrmRepl;
            }
        }
        return mass;
    }

}

