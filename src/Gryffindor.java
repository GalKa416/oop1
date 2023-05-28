public class Gryffindor extends Hogwarts {


    private int nobility;
    private int honor;
    private int bravery;
    int sum;


    public Gryffindor(String name, String surname, int silaMagii, int distanceTransgression, int nobility, int honor, int bravery) {
        super(name, surname, silaMagii, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.sum = sum;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return " Студент Gryffindor{"
                +getName()+ " " +getSurname()+
                ", silaMagii = "+getSilaMagii()+
                ", distanceTransgression= " +getDistanceTransgression()+
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }


    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public static void bestGryffindorbes(Gryffindor first, Gryffindor second) {

        int firstSum = first.getBravery() + first.getNobility() + first.getHonor();
        int secondSum = second.getBravery() + second.getNobility() + second.getHonor();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше, чем " + second.getName() + " " + second.getSurname() + " на факльтете Gryffindor");

        } else if (secondSum > firstSum) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше, чем " + first.getName() + " " + first.getSurname() + " на факльтете Gryffindor");
        } else {
            System.out.println("Студенты " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " на факльтете Gryffindor равны");
        }
    }
}



