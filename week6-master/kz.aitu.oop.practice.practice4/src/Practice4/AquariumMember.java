package Practice4;

public abstract class AquariumMember {
    private int cost; // price
    private String name; // name
    private String color;
    int id;

    protected AquariumMember() {
        this.cost = 0;
        this.name = "Dimash";
        this.color = "Null";
    }

    protected AquariumMember(int cost, String name , String color , int id) {
        this.cost = cost;
        this.name = name;
        this.color = color;
        this.id = id;
    }

    public int getCost() { // get price
        return cost;
    }

    public void setCost(int cost) { // change price
        this.cost = cost;
    }

    public String getName() { // get name
        return name;
    }

    public void setName(String name) { // change name
        this.name = name;
    }

    public int getID(){ // get id
        return this.id;
    }
    public String getColor() { // get colour of fish
        return this.color;
    }

    @Override
    public String toString() {
        return "AquariumMember{ " +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                " }";
    }
}
