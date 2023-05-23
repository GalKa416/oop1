public class Slytherin extends Hogwarts {



    private String name;
    private String surname;
    private int silaMagii;
    private int distanceTransgression;
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
        return "Slytherin{" +
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambitious=" + ambitious +
                ", resourcefulness=" + resourcefulness +
                ", authoritativeness=" + authoritativeness +
                '}';
    }
}