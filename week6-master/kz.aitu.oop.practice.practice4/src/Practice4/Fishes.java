package Practice4;

import java.util.ArrayList;

public class Fishes {
    ArrayList<Fish> fishes = new ArrayList(20); // 'aquarium'
    private int totalcost = 0;

    public int getSize(){ //max number if fishes it can include
        return 20;
    }

    public int getTotalCost(){
        return this.totalcost;
    }

    public void add(Fish e) {
        totalcost += e.getCost();
        fishes.add(e);   // add fish into array
    }

    public void del(Fish e) {
        totalcost -= e.getCost();
        fishes.remove(e);  //delete from array fish at index id
    }

    public void see(){
        for (Fish e: fishes){
            System.out.println(e);
        }
    }

}
