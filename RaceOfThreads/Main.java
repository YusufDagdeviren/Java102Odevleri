import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    /*
     * 1'den 10000 (10 bin)'e kadar olan sayılardan oluşan bir ArrayList
     * oluşturunuz. Ardından, bu ArrayList'teki 10 bin elemanı 2500 eleman olacak
     * şekilde 4 eşit parçaya ayırınız. Bu 4 ayrı 2500 elemanlık ArrayList'ler
     * içinde tek ve çift sayıları bulan 4 ayrı Thread tasarlayınız.
     * 
     * 
     * 
     * 4 Thread bulduğu çift sayıları ortak bir ArrayList'e ekleyecektir.
     * 
     * 
     * 4 Thread bulduğu tek sayıları ortak bir ArrayList'e ekleyecektir.
     * 
     * 
     * Tek ve çift sayıları tutan ArrayList'ler ilk oluşturulduklarında boş
     * olacaklardır. Ve iki tane ArrayList olacaklardır.
     * 
     * 
     * 4 Thread kendine ait 2500 elemanlık ArrayList'i işlemeye başlayınca tek ve
     * çift sayı ArrayList'lerini dolduracaktır.
     */
    public static void main(String[] args) {
        OperationOfThread ofThread = new OperationOfThread();
        ExecutorService exe = Executors.newFixedThreadPool(25);

        for(int i=0;i<=100;i++){
            exe.execute(ofThread);
        }
        exe.shutdown();
        System.out.println("Tek sayilar: ");
        for(int i:ofThread.getOdd()){
            System.out.println(i);
        }
        System.out.println("Cift sayilar: ");
        for(int i:ofThread.getEven()){
            System.out.println(i);
        }
    }
}
