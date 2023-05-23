public class PrintServic {
    public void print (Gryffindor[] studentGryffindor){
        System.out.println("Количество студентов Gryffindor  " + studentGryffindor.length);
        for (int i = 0; i < studentGryffindor.length; i++) {
            Gryffindor gryffindor = studentGryffindor[i];
            System.out.println("Имя " + gryffindor.getName()
                     +", Фамилия " +gryffindor.getSurname()
                   + ", Сила магии " + gryffindor.getSilaMagii()
                    + ", Трансгрессия "+gryffindor.getDistanceTransgression()
                   + ", Благородство " + gryffindor.getNobility()
                  +  ", Честь " + gryffindor.getHonor()
                  +  ", Храбрость "+gryffindor.getBravery());

        }

    }
    public void print (Hufflepuff[] studentHufflepuff){
        System.out.println("Количество студентов Hufflepuff  " + studentHufflepuff.length);
        for (int i = 0; i < studentHufflepuff.length; i++) {
            Hufflepuff hufflepuff = studentHufflepuff[i];
            System.out.println("Имя " + hufflepuff.getName()
                    +", Фамилия " +hufflepuff.getSurname()
                    + ", Сила магии " + hufflepuff.getSilaMagii()
                    + ", Трансгрессия "+hufflepuff.getDistanceTransgression()
                    + ", Трудолюбие " + hufflepuff.getIndustriousness()
                    +  ", Верность " + hufflepuff.getLoyalty()
                    +  ", честность "+hufflepuff.getHonesty());

        }

    }
    public void print (Ravenclaw [] studentRavenclaw ){
        System.out.println("Количество студентов Ravenclaw   " + studentRavenclaw .length);
        for (int i = 0; i < studentRavenclaw .length; i++) {
            Ravenclaw  ravenclaw = studentRavenclaw [i];
            System.out.println("Имя " + ravenclaw.getName()
                    +", Фамилия " +ravenclaw.getSurname()
                    + ", Сила магии " + ravenclaw.getSilaMagii()
                    + ", Трансгрессия "+ ravenclaw.getDistanceTransgression()
                    + ", Ум " + ravenclaw.getMind()
                    +  ", Мудрость " + ravenclaw.getWisdom()
                    +  ", Остроумие " + ravenclaw.getWit()
                    +  ", Творчество "+ravenclaw.getCreation());

        }

    }
    public void print (Slytherin [] studentSlytherin ){
        System.out.println("Количество студентов Slytherin   " + studentSlytherin .length);
        for (int i = 0; i < studentSlytherin .length; i++) {
            Slytherin  slytherin = studentSlytherin [i];
            System.out.println("Имя " + slytherin.getName()
                    +", Фамилия " + slytherin.getSurname()
                    + ", Сила магии " + slytherin.getSilaMagii()
                    + ", Трансгрессия "+ slytherin.getDistanceTransgression()
                    + ", Хитрость " + slytherin.getCunning()
                    +  ", Решительность " + slytherin.getDecisiveness()
                    +  ", амбициозность  " + slytherin.getAmbitious()
                    +  ", находчивость  " + slytherin.getResourcefulness()
                    +  ", властность "+slytherin.getAuthoritativeness());

        }

    }
    }

