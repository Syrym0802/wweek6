package Practice4;

import java.util.ArrayList;

public class FishTypes {
    private ArrayList<Fish> fishes = new ArrayList(20); // 'aquarium'

    public int getSize() { //max number if fishes it can include
        return 20;
    }

    public void addNew(int id, String name, int cost, int weight, String color) {
        Fish e = new Fish(id, name, cost, weight, color);
        fishes.add(e);   // add fish into array
    }

    public Fish getFish(int id){
        for (Fish e: fishes) {
            if (e.getID() == id) return e;
        }
        return null;
    }

    public void view(){
        for (Fish e: fishes) {
            System.out.println(e.toString());
        }
    }
}