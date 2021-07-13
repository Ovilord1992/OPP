package Table_2;

public class Car {
    private String carName;
    private String concerneName;
    private int year;
    private int DVSOb;

    public Car(){
    }

    public Car(String carName, String concerneName, int year, int DVSOb) {
        this.carName = carName;
        this.concerneName = concerneName;
        this.year = year;
        this.DVSOb = DVSOb;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getConcerneName() {
        return concerneName;
    }

    public void setConcerneName(String concerneName) {
        this.concerneName = concerneName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDVSOb() {
        return DVSOb;
    }

    public void setDVSOb(int DVSOb) {
        this.DVSOb = DVSOb;
    }
}
