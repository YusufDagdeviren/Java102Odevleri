package OdevKitapListesi;

public class Book {
    /*
     * Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi
     * değişkenlerinden oluşmaktadır.
     * 
     * Book sınıfından 10 tane nesne üretip bunu bir ArrayList yapısında saklayınız.
     * stream yapısını ve lambda ifadelerini kullanarak kitap isminin karşısında
     * yazar ismi olacak şekilde yeni bir Map<String, String> oluşturacak şekilde
     * yazınız.
     * 
     * 
     * 
     * Bu 10 elemanlık Book listesinden sayfa sayısı 100'den fazla olan kitapları
     * filtreleyen ve yeni bir liste olarak verecek geliştirmeyi yapınız. (Stream ve
     * Lambda ifadeleri kullanabilirsiniz.)
     */
    private String bookName;
    private int pageNumber;
    private String authorName;
    private int releaseDate;
    public Book(String bookName, int pageNumber, String authorName, int releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }
    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    

}
