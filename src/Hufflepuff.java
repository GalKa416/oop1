public class Hufflepuff extends Hogwarts {


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
        return "Студент Hufflepuff{"
                +getName()+ " " +getSurname()+
                ", silaMagii = "+getSilaMagii()+
                ", distanceTransgression= " +getDistanceTransgression()+
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
    public static void bestHufflepuff(Hufflepuff first, Hufflepuff second) {

        int firstSum = first.getHonesty() + first.getLoyalty() + first.getIndustriousness();
        int secondSum = second.getHonesty() + second.getLoyalty() + second.getIndustriousness();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше, чем " + second.getName() + " " + second.getSurname() + " на факльтете Hufflepuff");

        } else if (secondSum > firstSum) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше, чем " + first.getName() + " " + first.getSurname() + " на факльтете Hufflepuff");
        } else {
            System.out.println("Студенты " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " на факльтете Hufflepuff");
        }
    }
}



