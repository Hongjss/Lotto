import java.util.HashSet;
import java.util.Random;

public class userLotto {
	
	Random rd = new Random();
    private Lotto lotto = null;
    
    public Lotto lottery(){
        HashSet<Integer> set = new HashSet<Integer>(6);
        while(true){
            int num = rd.nextInt(45) + 1;
            set.add(num);
            if (set.size() >= 6){
                break;
            }
        }
        lotto = new Lotto(set);
        return lotto;
    }
}
