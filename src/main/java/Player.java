public class Player {
    private int id;
    private String name;
    private String strength;

    public Player(int id, String name, String strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStrength() {
        return strength;
    }


}
