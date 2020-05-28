package Practice4;

import java.util.ArrayList;

public class AccessoryTypes {
    private ArrayList<Accessory> acc = new ArrayList(20); // 'aquarium'

    public int getSize() { //max number if fishes it can include
        return 40;
    }

    public void addNew(int id, String name, int cost, int volume, String color) { // add accesory into array
        Accessory e = new Accessory(id, name, cost, volume, color);
        acc.add(e);
    }

    public void view(){
        for (Accessory a: acc) {
            System.out.println(a.toString());
        }
    }
    public Accessory getAccessory(int id){
        for (Accessory e: acc) {
            if (e.getID() == id) return e;
        }
        return null;
    }

}