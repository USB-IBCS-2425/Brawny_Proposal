class Enclosure{
    String name;
    String penguins;
    int numPenguins;
    int weight;
    boolean open;
    public getAllPenguins() {
        return AllPenguins
    }

    public int getNumPenguins() {
        return NumPenguins;
    }

    public int getWeight() {
        return weight
    }
    public boolean isOpen() {
        return open;
    }
    public static void main(String args) {

        Penguin penguin1 = new Penguin("Pablo", 5, 12, true);
        Penguin penguin2 = new Penguin("Juan", 3, 10, false);
        Penguin penguin3 = new Penguin("Sigma", 2, 11, false);
        
        penguinEnclosure.addPenguin("Pablo");
        penguinEnclosure.addPenguin("Juan");
        penguinEnclosure.addPenguin("Sigma");
        
        System.out.println(penguinEnclosure.getAllPenguins());
        System.out.println("Number of penguins is " + penguinEnclosure.getNumPenguins());
    }
}