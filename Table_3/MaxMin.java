package Table_3;

public class MaxMin {
    private static int arg1;
    private static int arg2;

    public static int getArg1() {
        return arg1;
    }

    public static void setArg1(int arg1) {
        MaxMin.arg1 = arg1;
    }

    public static int getArg2() {
        return arg2;
    }

    public static void setArg2(int arg2) {
        MaxMin.arg2 = arg2;
    }

    public static int getArg3() {
        return arg3;
    }

    public static void setArg3(int arg3) {
        MaxMin.arg3 = arg3;
    }

    public static int getArg4() {
        return arg4;
    }

    public static void setArg4(int arg4) {
        MaxMin.arg4 = arg4;
    }

    private static int arg3;
    private static int arg4;

    public static double max(){
        return Math.max(Math.max(arg1, arg2), Math.max(arg3,arg4));
    }

    public static double min(){
        return Math.min(Math.min(arg1, arg2), Math.min(arg3,arg4));
    }

    public static double srednee(){
        return (arg1 + arg2 + arg3 + arg4) / 4;
    }

    public static double factorial(int factor){
        int summ = 1;
        for (int i = 0; i < factor; i++) {
            summ = summ + summ * i;
        }
        return summ;
    }

}
