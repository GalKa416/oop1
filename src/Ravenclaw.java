public class Ravenclaw extends Hogwarts {
<<<<<<< HEAD

    public void Ravenclaw (String name, String surname, int silaMagii, int distanceTransgression) {
        super(name, surname, silaMagii, distanceTransgression);
=======
    private String name;
    private String surname;
    private int silaMagii;
    private int distanceTransgression;
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, String surname, int silaMagii, int distanceTransgression, int mind, int wisdom, int wit, int creation) {
        super(name, surname, silaMagii, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
>>>>>>> 0bb88fc (созданы классы, прописан код наследование)
    }
}