public class Hufflepuff extends Hogwarts {

<<<<<<< HEAD
    public Hufflepuff (String name, String surname, int silaMagii, int distanceTransgression) {
        super(name, surname, silaMagii, distanceTransgression);
=======

    private String name;
    private String surname;
    private int silaMagii;
    private int distanceTransgression;
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int silaMagii, int distanceTransgression, int industriousness, int loyalty, int honesty) {
        super(name, surname, silaMagii, distanceTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
>>>>>>> 0bb88fc (созданы классы, прописан код наследование)
    }
}
