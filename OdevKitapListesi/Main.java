package OdevKitapListesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
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
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Fahrenheit", 99, "Ray", 1956));
        bookList.add(new Book("Suc ve Ceza", 612, "Dostoyevski", 1925));
        bookList.add(new Book("Savaş ve Baris", 800, "Tolstoy", 1915));
        bookList.add(new Book("Denizler altinda yirmi bin fersah", 55, "Jules Verne", 1925));
        bookList.add(new Book("Tutunamayanlar", 550, "Oğuz Atay", 1950));
        bookList.add(new Book("Kuyucakli Yusuf", 145, "Sabahattin Ali", 1965));
        bookList.add(new Book("Metro 2023", 650, "Dmitry Glukhovsky", 2006));
        bookList.add(new Book("Momo", 69, "Ende", 1980));
        bookList.add(new Book("Hobbit", 565, "J.R.R Tolkien", 1940));
        bookList.add(new Book("Pamuk prenses", 45, "Bilinmiyor", 0));
        Map<String,String> bookMap = new HashMap<>();
        bookList.stream().forEach(book->bookMap.put(book.getBookName(), book.getAuthorName()));
        for(String s:bookMap.keySet()){
            System.out.println("Book Name: "+s+"\nAuthorName: "+bookMap.get(s));
        }
        System.out.println("*********************************************");
        List<Book> listBook = bookList.stream().filter(book->book.getPageNumber()>100).toList();
        listBook.stream().forEach(b->System.out.println("Kitap Adi : "+b.getBookName()+" | " +
        "Sayfa Sayisi : "+b.getPageNumber()+" | "+
        "Yazar : "+b.getAuthorName()+" | "+
        "Yayin Tarihi : "+b.getReleaseDate()));

    }
    
    



}
