import java.util.Iterator;
import java.util.Random;

public class TestZweiZustaende {
    public static void main(String[] args){

        ZweiZustaende automat = new ZweiZustaende("A", "B", 0.3);
        Iterator iterator = automat.iterator();

        for (int i=0; i < 20; i++){
            System.out.print(iterator.next());
        }
        System.out.println();

        //Random Objekt erstellt
        Random r = new Random();
        double randomValue = r.nextDouble();

        ZweiZustaende automat2 = new ZweiZustaende("1", "2", randomValue);
        Iterator iterator2 = automat2.iterator();

        System.out.println(randomValue);

        for (int i=0; i < 20; i++){
            System.out.print(iterator2.next());
        }

        System.out.println();
        
    }    
}
