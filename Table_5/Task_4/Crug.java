package Table_5.Task_4;

public class Crug extends Figura{
    double pi = 3.14;
    int r;

    public Crug(int r) {
        this.r = r;
    }


    @Override
    public double calc() {
        return pi * r * r;
    }
}
