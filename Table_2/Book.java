package Table_2;

public class Book {
    private String bookName;
    private String FIOAutor;
    private int yearPublishing;
    private String isdatelstvoName;
    private String genre;

    //TODO спользуйте механизм пере- грузки методов???

    public Book(){
    }

    public Book(String bookName, String FIOAutor, int yearPublishing, String isdatelstvoName, String genre, String numOfPages) {
        this.bookName = bookName;
        this.FIOAutor = FIOAutor;
        this.yearPublishing = yearPublishing;
        this.isdatelstvoName = isdatelstvoName;
        this.genre = genre;
        this.numOfPages = numOfPages;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getFIOAutor() {
        return FIOAutor;
    }

    public void setFIOAutor(String FIOAutor) {
        this.FIOAutor = FIOAutor;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String getIsdatelstvoName() {
        return isdatelstvoName;
    }

    public void setIsdatelstvoName(String isdatelstvoName) {
        this.isdatelstvoName = isdatelstvoName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(String numOfPages) {
        this.numOfPages = numOfPages;
    }

    private String numOfPages;


}
