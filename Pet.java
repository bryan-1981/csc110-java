public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;

    public Pet() {  // default constructor
        this.name = "Unknown";
        this.species = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    // parameterized constructor, the one the GUI uses
    public Pet(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        // %.1f forces one decimal so 7 shows as 7.0
        return name + " is a " + age + "-year-old " + species
               + " who weighs " + String.format("%.1f", weight) + " pounds.";
    }
}