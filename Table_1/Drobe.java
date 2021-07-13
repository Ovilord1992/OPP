package Table_1;

public class Drobe {

    public Drobe(){
    }
    //TODO перегрузка конструктора
    public Drobe(int chis, int znam){
        this.chis = chis;
        this.znam = znam;
    }

    private int chis;

    public int getChis() {
        return chis;
    }

    public void setChis(int chis) {
        this.chis = chis;
    }

    public int getZnam() {
        return znam;
    }

    public void setZnam(int znam) {
        this.znam = znam;
    }

    private int znam;

    public int summ() {
        return chis + znam;
    }

    public int raznost() {
        return chis - znam;
    }

    public int del() {
        return chis / znam;
    }

    public int ymn() {
        return chis * znam;
    }
    //TODO перегрузка метода
    public int ymn(int chis, int znam){
        this.chis = chis;
        this.znam = znam;
        return chis * znam;
    }

}
