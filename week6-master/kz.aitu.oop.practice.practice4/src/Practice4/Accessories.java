package Practice4;

import java.util.ArrayList;

public class Accessories {
    ArrayList<Accessory> ac = new ArrayList(40); // 'aquarium'
    private int totalcost = 0;
    public int getSize(){ //max number if fishes it can include
        return 40;
    }

    public void add(Accessory e) {
        totalcost += e.getCost();
        ac.add(e);   // add fish into array
    }

    public void del(Accessory e) {
        totalcost -= e.getCost();
        ac.remove(e);  //delete from array fish at index id
    }

    public void see(){
        for (Accessory e : ac) {
            System.out.println(e);
        }
    }

    public int getTotalCost() {
        return this.totalcost;
    }


}
