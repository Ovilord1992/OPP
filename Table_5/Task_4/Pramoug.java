package Table_5.Task_4;

public class Pramoug extends Figura{
    double storonaA, storonaB;

    public Pramoug(double storonaA, double storonaB) {
        this.storonaA = storonaA;
        this.storonaB = storonaB;
    }

    @Override
    public double calc() {
        return storonaA * storonaB;
    }
}
