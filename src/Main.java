public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");

        int humanAge = 19;
        if (humanAge >= 18) {System.out.println("Если возраст человека " + humanAge + " он совершеннолетний.");}
        else {System.out.println("Если возраст человека " + humanAge + " не остиг совершеннолетия нужно не много подождать. ");}
        int age = 16;
        if (age >= 18) {System.out.println("Если возраст человека " + age + " он совершеннолетний.");}
        else {System.out.println("Если возраст человека " + age + " не остиг совершеннолетия, нужно не много подождать. ");}

        System.out.println("Задача №2");
        int outsideTemperature = 3;

        if (outsideTemperature > 5)
        {System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки.");}
        else {System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку.");}

        int outsideTemperatureA = 6;

        if (outsideTemperatureA > 5) { System.out.println("На улице " + outsideTemperatureA + " градусов, можно идти без шапки.");}
        else {System.out.println("На улице " + outsideTemperatureA + " градусов, нужно надеть шапку.");}

        System.out.println("Задача №3");

        int speed = 61;
        if(speed > 60) {System.out.println("Если скорость " + speed + " то придется заплатить штраф.");}
        else {System.out.println("Если скорость "+ speed + " то можно ездить спокойно.");}

        int speedCar = 58;
        if(speedCar > 60) {System.out.println("Если скорость " + speedCar + " то придется заплатить штраф.");}
        else {System.out.println("Если скорость "+ speedCar + " то можно ездить спокойно.");}

        System.out.println("Задача №4");
        int humanA = 3;
        if(humanA > 2 && humanA < 6){System.out.println("Если возраст человека равен " + humanA + " то ему нужно ходить в детский сад.");}
        if(humanA > 7 && humanA <17) {System.out.println("Если возраст человека равен " + humanA + " то ему нужно ходить в школу.");}
        if(humanA >= 18 && humanA <=24) {System.out.println("Если возраст человека равен " + humanA + " то его место в универсистете.");}
        if(humanA > 24 ) {System.out.println("Если возраст человека равен " + humanA + " то ему пора ходить на работу ");}

        int humanB = 8;
        if(humanB > 2 && humanB < 6){System.out.println("Если возраст человека равен " + humanB + " то ему нужно ходить в детский сад.");}
        if(humanB > 7 && humanB <17){System.out.println("Если возраст человека равен " + humanB + " то ему нужно ходить в школу.");}
        if(humanB >= 18 && humanB <=24) {System.out.println("Если возраст человека равен " + humanB + " то его место в универсистете.");}
        if(humanB > 24 ){System.out.println("Если возраст человека равен " + humanB + " то ему пора ходить на работу ");}
        int humanC = 20;
        if(humanC > 2 && humanC < 6){System.out.println("Если возраст человека равен " + humanC + " то ему нужно ходить в детский сад.");}
        if(humanC > 7 && humanC <17){System.out.println("Если возраст человека равен " + humanC + " то ему нужно ходить в школу.");}
        if(humanC >= 18 && humanC <=24) {System.out.println("Если возраст человека равен " + humanC + " то его место в универсистете.");}
        if(humanC > 24 ){System.out.println("Если возраст человека равен " + humanC + " то ему пора ходить на работу ");}
        int humanD = 26;
        if(humanD > 2 && humanD < 6){System.out.println("Если возраст человека равен " + humanD + " то ему нужно ходить в детский сад.");}
        if(humanD > 7 && humanD <17){System.out.println("Если возраст человека равен " + humanD + " то ему нужно ходить в школу.");}
        if(humanD >= 18 && humanD <=24) {System.out.println("Если возраст человека равен " + humanD + " то его место в универсистете.");}
        if(humanD > 24 ){System.out.println("Если возраст человека равен " + humanD + " то ему пора ходить на работу ");}

        System.out.println("Задача №5");
        int childA = 3;
        if (childA < 5){System.out.println("Если ребенку " + childA + " года ,то он не может кататься на аттракционе.");}
        if (childA >= 5 && childA <= 14){System.out.println("Если ребенку " + childA + " лет ,то он может кататься только в сопровождении взрослого." +
                    "Если взрослого нет, то кататься нельзя.");}
        if (childA > 14){System.out.println("Если ребенку " + childA + " лет ,то он может кататься без сопровождения взрослого.");}

        int childB = 14;
        if (childB < 5){System.out.println("Если ребенку " + childB + " года ,то он не может кататься на аттракционе.");}
        if (childB >= 5 && childB <= 14){System.out.println("Если ребенку " + childB + " лет ,то он может кататься только в сопровождении взрослого." +
                    "Если взрослого нет, то кататься нельзя.");}
        if (childB > 14){System.out.println("Если ребенку " + childB + " лет ,то он может кататься без сопровождения взрослого.");}

        int childC = 20;
        if (childC < 5){System.out.println("Если ребенку " + childC + " года ,то он не может кататься на аттракционе.");}
        if (childC >= 5 && childC <= 14){System.out.println("Если ребенку " + childC + " лет ,то он может кататься только в сопровождении взрослого." +
                    "Если взрослого нет, то кататься нельзя.");}
        if (childC > 14){System.out.println("Если ребенку " + childC + " лет ,то он может кататься без сопровождения взрослого.");}

        System.out.println("Задача №6");


        int passengersA = 58;
        if( passengersA <= 60 ){System.out.println("Если билет под номером № " + passengersA + " у вас место сидячее." );}
        else if( passengersA > 60 && passengersA <= 102 ){System.out.println("Если билет под номером № " + passengersA + " у вас место стоячее." );}
        else {System.out.println("Мест больше нет");}

        int passengersB = 62;
        if( passengersB <= 60 ){System.out.println("Если билет под номером № " + passengersB + " у вас место сидячее." );}
        else if( passengersB > 60 && passengersB <= 102 ){System.out.println("Если билет под номером № " + passengersB + " у вас место стоячее." );}
        else {System.out.println("Мест больше нет");}

        int passengersC = 103;
        if( passengersC <= 60 ){System.out.println("Если билет под номером № " + passengersC + " у вас место сидячее." );}
        else if( passengersC > 60 && passengersC <= 102 ){System.out.println("Если билет под номером № " + passengersC + " у вас место стоячее." );}
        else {System.out.println("Мест больше нет");}

        System.out.println("Задача №7");

        int one = 3;
        int two =5;
        int three = 4;

        if (three >=two && three >= one){System.out.println("Третье число самое большое.");}
        else if (two >= one && two >= three){System.out.println("Второе число самое большое.");}
        else {System.out.println("Первое число самое большое");}
















    }
}
