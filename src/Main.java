public class Main {
    private static Object studentGryffindor;

    public static void main(String[] args) {
        System.out.println("Hello world!");


        Gryffindor garri = new Gryffindor("Гарри", "Поттер", 45, 29, 54, 36, 54);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 96, 83, 77, 45, 61);
        Gryffindor ron = new Gryffindor("Рон", " Уизли", 19, 23, 48, 75, 24);

        Hufflepuff zechariah = new Hufflepuff("Захария", "Смит", 35, 28, 89, 64, 37);
        Hufflepuff sedriс = new Hufflepuff("Седрик ", "Дигори", 95, 37, 46, 54, 21);
        Hufflepuff justin = new Hufflepuff("Джастин ", "Финч-Флетчли", 75, 39, 67, 52, 39);

        Ravenclaw zhou = new Ravenclaw("Чжоу", "Чанг", 47, 82, 65, 33, 44, 65);
        Ravenclaw pamda = new Ravenclaw("Падма", "Патил", 35, 48, 93, 31, 55, 89);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 24, 63, 77, 54, 38, 62);

        Slytherin draco = new Slytherin("Драко", "Малфой", 32, 31, 33, 34, 35, 25, 27);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 43, 41, 30, 22, 52, 61, 72);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 12, 73, 39, 31, 54, 49, 33);

        System.out.println(garri);
        System.out.println(germiona);
        System.out.println(ron);
        System.out.println(zechariah);
        System.out.println(sedriс);
        System.out.println(justin);
        System.out.println(zhou);
        System.out.println(pamda);
        System.out.println(marcus);
        System.out.println(draco);
        System.out.println(graham);
        System.out.println(gregory);

        Gryffindor.bestGryffindorbes(garri, germiona);
        Hufflepuff.bestHufflepuff( zechariah, sedriс);
        Ravenclaw.bestRavenclaw(zhou, pamda);
        Slytherin.bestSlytherin( draco, graham);
        Hogwarts.bestHogwarts( justin, gregory);
    }

}


