package Table_3;

public class Area {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static double treangle(int storA, int storB, int ygol) {
        count++;
        return 0.5 * storA * storB * Math.sin(ygol);
    }

    public static double treangle(int osnov, int visota) {
        count++;
        return 0.5 * osnov * visota;
    }

    public static double rectangle(int storomaA, int storonaB) {
        count++;
        return storomaA * storonaB;
    }

    public static double squere(int storomaA, int storonaB){
        count++;
        return storomaA * storonaB;
    }

    public static double romb(int vis, int storonaA){
        count++;
        return vis * storonaA;
    }
}
