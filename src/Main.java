public class Main {

    public static void main(String[] args) {

        int cY = 2022;
        Human maksim = new Human("Максим", "Минск", "бренд-менеджером", 1988);
        print(maksim);
        Human anya = new Human("Аня", "Москва", "методистом образовательных программ", 1993);
        print(anya);
        Human katya = new Human("Катя", "Калининград", "продакт-менеджером", 1992);
        print(katya);
        Human artem = new Human("Артем", "Москва", "директором по развитию бизнеса", 1995);
        print(artem);
        Human vladimir = new Human("Владимир", "Казань", null, cY - 21);
        print(vladimir);
    }

    public static void print(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году." + " Я работаю на должности " + human.jobTitle + ". Будем знакомы!");
    }




    }







