package Table_1;

public class Human {
    private String FIO;
    private String dBer;
    private String numPhone;
    private String sity;
    private String contry;
    private String adress;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public String getFIO() {
        return FIO;
    }


    public Human(){
        Human.count ++;
    }
    //TODO перегрузка конструктора
    public Human(String sity){
        this.sity = sity;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getdBer() {
        return dBer;
    }

    public void setdBer(String dBer) {
        this.dBer = dBer;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
