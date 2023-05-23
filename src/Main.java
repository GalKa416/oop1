public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gryffindor[] studentGryffindor = {
                new Gryffindor("Гарри", "Поттер", 45, 29, 54, 36, 54),
                new Gryffindor("Гермиона", "Грейнджер", 24, 33, 27, 15, 61),
                new Gryffindor("Рон", " Уизли", 19, 23, 48, 75, 24)
        };

        Hufflepuff[]studentHufflepuffs ={
                new Hufflepuff("Захария", "Смит", 35, 28, 89, 64, 37),
                new Hufflepuff("Седрик ", "Дигори", 95, 37, 46, 54, 21),
                new Hufflepuff("Джастин ", "Финч-Флетчли", 75, 39, 67, 52, 39)
        };
        Ravenclaw[]studentRavenclaws ={
                new Ravenclaw("Чжоу", "Чанг", 47, 82, 65 , 33, 44, 65),
                new Ravenclaw("Падма", "Патил", 35, 48, 93 , 31, 55, 89),
                new Ravenclaw("Маркус", "Белби", 24, 63, 77 , 54, 38, 62),
        };
        Slytherin []studentSlytherin = {
                new Slytherin("Драко", "Малфой", 32, 31, 33, 34, 35, 25, 27),
                new Slytherin("Грэхэм", "Монтегю", 43, 41, 30, 22, 52, 61, 72),
                new Slytherin("Грегори", "Гойл", 12, 73, 39, 31, 54, 49, 33)
        };
        PrintServic printServic = new PrintServic();
        printServic.print(studentGryffindor);
        printServic.print(studentHufflepuffs);
        printServic.print(studentRavenclaws);
        printServic.print(studentSlytherin);
    }



}