package Practice4;

public class Accessory extends  AquariumMember{
    private int volume; // volume

    public Accessory(int cost, String name, int id , int volume, String color ) {
        super(cost, name , color , id);
        this.volume = volume;
        this.id = id;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() { //get Volume of object
        return volume;
    }

}
