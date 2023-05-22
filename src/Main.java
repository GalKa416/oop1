public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gryffindor[] studentGryffindor = {
                new Gryffindor("Гарри", "Поттер", 45, 29, 54, 36, 54),
        new Gryffindor("Гермиона", "Грейнджер", 24, 33, 27, 15, 61),
        new Gryffindor("Рон", " Уизли", 19, 23, 48, 75, 24)         };


        PrintServic printServic = new PrintServic();
        printServic.print(studentGryffindor);
    }
}