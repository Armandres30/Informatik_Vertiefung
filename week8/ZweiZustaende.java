import java.util.Iterator;
import java.util.Random;

public class ZweiZustaende implements Iterable<String>{
    private String zustand1;
    private String zustand2;
    private double wechselWahrscheinlichkeit;

    public ZweiZustaende(String zustand1, String zustand2, double p){
        this.zustand1 = zustand1;
        this.zustand2 = zustand2;
        this.wechselWahrscheinlichkeit = p;
    }

    public Iterator<String> iterator() {

        return new ZufallsIterator();
    }

    private class ZufallsIterator implements Iterator<String> {
        boolean istInZustand1;

        public ZufallsIterator(){
            istInZustand1 = true;
        }

        public  String next(){
            this.istInZustand1 = !this.istInZustand1; 
            if(this.istInZustand1){
                if(wechselWahrscheinlichkeit >= 0.5){
                    this.istInZustand1 = !this.istInZustand1; 
                }
                return zustand1;
            }else{
                if(wechselWahrscheinlichkeit >= 0.5){
                    this.istInZustand1 = !this.istInZustand1; 
                }
                return zustand2;
            }
        }

        public boolean hasNext(){
            return true;
        }

        public void remove(){
            //empty

        }
    }
}
