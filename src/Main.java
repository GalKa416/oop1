public class Main {
    private static Object studentGryffindor;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hogwarts [] hogwarts ={

                new Hogwarts("Гарри", "Поттер", 45, 29),
                new Hogwarts("Гермиона", "Грейнджер", 96, 83),
                new Hogwarts("Рон", " Уизли", 19, 23),
                new Hogwarts("Захария", "Смит", 35, 28),
                new Hogwarts("Седрик ", "Дигори", 95, 37),
                new Hogwarts("Джастин ", "Финч-Флетчли", 75, 39),
                new Hogwarts("Чжоу", "Чанг", 47, 82),
                new Hogwarts("Падма", "Патил", 35, 48),
                new Hogwarts("Маркус", "Белби", 24, 63),
                new Hogwarts("Драко", "Малфой", 32, 31),
                new Hogwarts("Грэхэм", "Монтегю", 43, 41),
                new Hogwarts("Грегори", "Гойл", 12, 733)
        };


        Gryffindor[] studentGryffindor = {
                new Gryffindor("Гарри", "Поттер", 45, 29, 54, 36, 54),
                new Gryffindor("Гермиона", "Грейнджер", 96, 83, 77, 45, 61),
                new Gryffindor("Рон", " Уизли", 19, 23, 48, 75, 24)
        };

        Hufflepuff[] studentHufflepuffs = {
                new Hufflepuff("Захария", "Смит", 35, 28, 89, 64, 37),
                new Hufflepuff("Седрик ", "Дигори", 95, 37, 46, 54, 21),
                new Hufflepuff("Джастин ", "Финч-Флетчли", 75, 39, 67, 52, 39)
        };
        Ravenclaw[] studentRavenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 47, 82, 65, 33, 44, 65),
                new Ravenclaw("Падма", "Патил", 35, 48, 93, 31, 55, 89),
                new Ravenclaw("Маркус", "Белби", 24, 63, 77, 54, 38, 62),
        };
        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", "Малфой", 32, 31, 33, 34, 35, 25, 27),
                new Slytherin("Грэхэм", "Монтегю", 43, 41, 30, 22, 52, 61, 72),
                new Slytherin("Грегори", "Гойл", 12, 73, 39, 31, 54, 49, 33)
        };



        PrintServic printServic = new PrintServic();
        printServic.print(studentGryffindor);
        printServic.print(studentHufflepuffs);
        printServic.print(studentRavenclaws);
        printServic.print(studentSlytherin);
        Best(studentGryffindor);
        Best(studentHufflepuffs);
        Best(studentRavenclaws);
        Best(studentSlytherin);
        best(hogwarts);

    }


    public static void Best(Gryffindor[] studentGryffindor) {


            int sum1 = studentGryffindor[0].getBravery() + studentGryffindor[0].getNobility() + studentGryffindor[0].getHonor();
            int sum2 = studentGryffindor[1].getBravery() + studentGryffindor[1].getNobility() + studentGryffindor[1].getHonor();
            if (sum1 > sum2) {

                System.out.println("Студент Gryffindor " + studentGryffindor[0].getName() + " " + studentGryffindor[0].getSurname() + " Лучший на факультете, его способности " + sum1 + "  это выше, чем у " + studentGryffindor[1].getName() + " " + studentGryffindor[1].getSurname() + " который имеет " + sum2 + " балла.");
            } else {

                    System.out.println("Студент Gryffindor " + studentGryffindor[1].getName() + " " + studentGryffindor[1].getSurname() + " Лучший на факультете, его способности " + sum2 + " это выше, чем у " + studentGryffindor[0].getName() + " " + studentGryffindor[0].getSurname() + " который имеет " + sum1 + " балла.");

                }
            }
    public static void Best(Hufflepuff[] studentHufflepuffs) {


        int sum1 = studentHufflepuffs[0].getHonesty() + studentHufflepuffs[0].getLoyalty() + studentHufflepuffs[0].getIndustriousness();
        int sum2 = studentHufflepuffs[1].getHonesty() + studentHufflepuffs[1].getLoyalty() + studentHufflepuffs[1].getIndustriousness();
        if (sum1 > sum2) {

            System.out.println("Студент Hufflepuff " + studentHufflepuffs[0].getName() + " " + studentHufflepuffs[0].getSurname() + " Лучший на факультете, его способности " + sum1 + "  это выше, чем у " + studentHufflepuffs[1].getName() + " " + studentHufflepuffs[1].getSurname() + " который имеет " + sum2 + " балла.");
        } else {

            System.out.println("Студент Hufflepuff " + studentHufflepuffs[1].getName() + " " + studentHufflepuffs[1].getSurname() + " Лучший на факультете, его способности " + sum2 + " это выше, чем у " + studentHufflepuffs[0].getName() + " " + studentHufflepuffs[0].getSurname() + " который имеет " + sum1 + " балла.");

        }
    }

    public static void Best(Ravenclaw[] studentRavenclaws) {


        int sum1 = studentRavenclaws[0].getWit() + studentRavenclaws[0].getMind() + studentRavenclaws[0].getWisdom()+studentRavenclaws[0].getCreation();
        int sum2 = studentRavenclaws[1].getWit() + studentRavenclaws[1].getMind() + studentRavenclaws[1].getWisdom() +studentRavenclaws[1].getCreation();;
        if (sum1 > sum2) {

            System.out.println("Студент Ravenclaw " + studentRavenclaws[0].getName() + " " + studentRavenclaws[0].getSurname() + " Лучший на факультете, его способности " + sum1 + "  это выше, чем у " + studentRavenclaws[1].getName() + " " + studentRavenclaws[1].getSurname() + " который имеет " + sum2 + " балла.");
        } else {

            System.out.println("Студент Ravenclaw " + studentRavenclaws[1].getName() + " " + studentRavenclaws[1].getSurname() + " Лучший на факультете, его способности " + sum2 + " это выше, чем у " + studentRavenclaws[0].getName() + " " + studentRavenclaws[0].getSurname() + " который имеет " + sum1 + " балла.");

        }
    }
    public static void Best(Slytherin[] studentSlytherin) {


        int sum1 = studentSlytherin[0].getResourcefulness() + studentSlytherin[0].getAuthoritativeness() + studentSlytherin[0].getAmbitious()+studentSlytherin[0].getDecisiveness() + studentSlytherin[0].getCunning();
        int sum2 = studentSlytherin[1].getResourcefulness() + studentSlytherin[1].getAuthoritativeness() + studentSlytherin[1].getAmbitious() +studentSlytherin[1].getDecisiveness()+ studentSlytherin[1].getCunning();
        if (sum1 > sum2) {

            System.out.println("Студент Slytherin " + studentSlytherin[0].getName() + " " + studentSlytherin[0].getSurname() + " Лучший на факультете, его способности " + sum1 + "  это выше, чем у " + studentSlytherin[1].getName() + " " + studentSlytherin[1].getSurname() + " который имеет " + sum2 + " балла.");
        } else {

            System.out.println("Студент Slytherin " + studentSlytherin[1].getName() + " " + studentSlytherin[1].getSurname() + " Лучший на факультете, его способности " + sum2 + " это выше, чем у " + studentSlytherin[0].getName() + " " + studentSlytherin[0].getSurname() + " который имеет " + sum2 + " балла.");

        }
    }
    public static void best(Hogwarts [] hogwarts) {

        int sum1 = hogwarts[3].getDistanceTransgression() + hogwarts[3].getSilaMagii() ;
        int sum2 = hogwarts[5].getDistanceTransgression() + hogwarts[5].getSilaMagii() ;
        if (sum1 > sum2) {

            System.out.println("Студент  " + hogwarts[3].getName() + " " + hogwarts[3].getSurname() + " лучший в школе Hogwarts, его способности " + sum1 + "  это выше, чем у " + hogwarts[5].getName() + " " + hogwarts[5].getSurname() + " который имеет " + sum2 + " балла.");
        } else {

            System.out.println("Студент  " + hogwarts[5].getName() + " " + hogwarts[5].getSurname() + " лучший в школе Hogwarts, его способности " + sum2 + " это выше, чем у " + hogwarts[3].getName() + " " + hogwarts[3].getSurname() + " который имеет " + sum1 + " балла.");

        }
    }
        }


