package Practice4;

public class Fish extends AquariumMember{
    private int weight; // weight

    public Fish(int weight, String color ) {
        this.weight = weight;
    }

    public Fish( int id , String name , int cost , int weight , String color ) {
        super(cost, name , color , id);
        this.weight = weight;

    }

    public int getWeight() { // get weight of fish
        return this.weight;
    }

    public int getID(){ // get id
        return this.id;
    }

    @Override
    public String toString() {
        return "Fish{ " + super.toString() +
                "weight=" + weight +
                " }";
    }
}
