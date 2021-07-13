package Table_1;

public class SIty {
    private String sityName;
    private String shtat;
    private String contryName;
    private int pepleCityResidens;
    private int index;

    public String getSityName() {
        return sityName;
    }

    public SIty(){
    }
    //TODO перегрузка конструктора
    public SIty(int index){
        this.index = index;
    }

    public void setSityName(String sityName) {
        this.sityName = sityName;
    }

    public String getShtat() {
        return shtat;
    }

    public void setShtat(String shtat) {
        this.shtat = shtat;
    }

    public String getContryName() {
        return contryName;
    }

    public void setContryName(String contryName) {
        this.contryName = contryName;
    }

    public int getPepleCityResidens() {
        return pepleCityResidens;
    }

    public void setPepleCityResidens(int pepleCityResidens) {
        this.pepleCityResidens = pepleCityResidens;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(int telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    private int telephoneCode;
}
