package Table_5.Task_4;

public class Trapec extends Figura{
    double srLine, vis;

    public Trapec(double srLine, double vis) {
        this.srLine = srLine;
        this.vis = vis;
    }

    @Override
    public double calc() {
        return srLine * vis;
    }
}
