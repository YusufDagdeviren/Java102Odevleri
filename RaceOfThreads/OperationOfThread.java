import java.util.ArrayList;

public class OperationOfThread implements Runnable {
    int count;
    private ArrayList<Integer> odd;
    private ArrayList<Integer> even;

    public OperationOfThread() {
        count=-1;
        odd = new ArrayList<>();
        even = new ArrayList<>();
    }

    @Override
    public void run() {
        findOddAndEven();
    }

    public synchronized void findOddAndEven() {
        count++;
        if(count%2==1){
            odd.add(count);
        }else{
            even.add(count);
        }
    }

    public ArrayList<Integer> getOdd() {
        return this.odd;
    }

    public void setOdd(ArrayList<Integer> odd) {
        this.odd = odd;
    }

    public ArrayList<Integer> getEven() {
        return this.even;
    }

    public void setEven(ArrayList<Integer> even) {
        this.even = even;
    }

}
