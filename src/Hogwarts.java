public class Hogwarts {
    private String name;
    private String surname;
    private int silaMagii;
    private int distanceTransgression;


    public Hogwarts(String name, String surname, int silaMagii, int distanceTransgression) {
        this.name = name;
        this.surname = surname;
        this.silaMagii = silaMagii;
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSilaMagii() {
        return silaMagii;
    }

    public void setSilaMagii(int silaMagii) {
        this.silaMagii = silaMagii;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", silaMagii=" + silaMagii +
                ", distanceTransgression=" + distanceTransgression +
                '}';
    }

    public static void bestHogwarts(Hogwarts first, Hogwarts second) {
        if (first.getSilaMagii() > second.getSilaMagii()) {
            System.out.println("Сила магии у студента  " + first.getName() + " " + first.getSurname() + " больше, чем " + second.getName() + " " + second.getSurname() + " в школе Hogwarts");

        } else if (second.getSilaMagii() > first.getSilaMagii()) {
            System.out.println("Сила магии у студента " + second.getName() + " " + second.getSurname() + " больше, чем " + first.getName() + " " + first.getSurname() + " в школе Hogwarts");
        } else {
            System.out.println("Сила магии у  " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " в школе Hogwarts одинакова");
        }
        if (first.getDistanceTransgression() > second.getDistanceTransgression()) {
            System.out.println("Расстояние трансгрессии у студента  " + first.getName() + " " + first.getSurname() + " больше, чем " + second.getName() + " " + second.getSurname() + " в школе Hogwarts");

        } else if (second.getDistanceTransgression() > first.getDistanceTransgression()) {
            System.out.println("Расстояние трансгрессии у студента " + second.getName() + " " + second.getSurname() + " больше, чем " + first.getName() + " " + first.getSurname() + " в школе Hogwarts");
        } else {
            System.out.println("Расстояние трансгрессии у  " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " в школе Hogwarts одинаково");
        }
    }
    }

