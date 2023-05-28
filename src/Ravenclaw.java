public class Ravenclaw extends Hogwarts {


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
        return "Студент Ravenclaw{"
                +getName()+ " " +getSurname()+
                ", silaMagii = "+getSilaMagii()+
                ", distanceTransgression= " +getDistanceTransgression()+
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }
    public static void bestRavenclaw(Ravenclaw first, Ravenclaw second) {

        int firstSum = first.getCreation() + first.getMind() + first.getWisdom() + first.getWit();
        int secondSum = second.getCreation() + second.getMind() + second.getWisdom() + second.getWit();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше, чем " + second.getName() + " " + second.getSurname() + " на факльтете Ravenclaw");

        } else if (secondSum > firstSum) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше, чем " + first.getName() + " " + first.getSurname() + " на факльтете Ravenclaw");
        } else {
            System.out.println("Студенты " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " на факльтете Ravenclaw");
        }
    }
}