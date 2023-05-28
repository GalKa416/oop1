public class Slytherin extends Hogwarts {

    private int cunning;
    private int decisiveness;
    private int ambitious;
    private int resourcefulness;
    private int authoritativeness;

    public Slytherin(String name, String surname, int silaMagii, int distanceTransgression, int cunning, int decisiveness, int ambitious, int resourcefulness, int authoritativeness) {
        super(name, surname, silaMagii, distanceTransgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitious = ambitious;
        this.resourcefulness = resourcefulness;
        this.authoritativeness = authoritativeness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthoritativeness() {
        return authoritativeness;
    }

    public void setAuthoritativeness(int authoritativeness) {
        this.authoritativeness = authoritativeness;
    }

    @Override
    public String toString() {
        return "Студент Slytherin{"
                +getName()+ " " +getSurname()+
                ", silaMagii = "+getSilaMagii()+
                ", distanceTransgression= " +getDistanceTransgression()+
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambitious=" + ambitious +
                ", resourcefulness=" + resourcefulness +
                ", authoritativeness=" + authoritativeness +
                '}';
    }
    public static void bestSlytherin(Slytherin first, Slytherin second) {

        int firstSum = first.getAmbitious() + first.getCunning() + first.getDecisiveness() + first.getAuthoritativeness() + first.getResourcefulness();
        int secondSum = second.getAmbitious() + second.getCunning() + second.getDecisiveness() + second.getAuthoritativeness() + second.getResourcefulness();
        if (firstSum > secondSum) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше, чем " + second.getName() + " " + second.getSurname() + " на факльтете Slytherin");

        } else if (secondSum > firstSum) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше, чем " + first.getName() + " " + first.getSurname() + " на факльтете Slytherin");
        } else {
            System.out.println("Студенты " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " на факльтете Slytherin");
        }
    }
}