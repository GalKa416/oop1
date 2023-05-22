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
    }

