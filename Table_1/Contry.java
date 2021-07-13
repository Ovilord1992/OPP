package Table_1;

public class Contry {
    private String contryName;
    private String continentName;
    private int contryPepleRezidents;
    private int telephoneCode;
    private String capitalName;

    public String getContryName() {
        return contryName;
    }

    public Contry(){
    }
    //TODO перегрузка конструктора
    public Contry(String contryName){
        this.contryName = contryName;
    }

    public void setContryName(String contryName) {
        this.contryName = contryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getContryPepleRezidents() {
        return contryPepleRezidents;
    }

    public void setContryPepleRezidents(int contryPepleRezidents) {
        this.contryPepleRezidents = contryPepleRezidents;
    }

    public int getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(int telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String[] getNameCities() {
        return nameCities;
    }

    public void setNameCities(String... nameCities) {
        this.nameCities = nameCities;
    }

    private String[] nameCities;

}
