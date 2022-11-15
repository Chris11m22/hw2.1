public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", "бренд-менеджером", 1988);
        System.out.println(maksim);
        Human anya = new Human("Аня", "Москва", "методистом образовательных программ", 1993);
        System.out.println(anya);
        Human katya = new Human("Катя", "Калининград", "продакт-менеджером", 1992);
        System.out.println(katya);
        Human artem = new Human("Артем", "Москва", "директором по развитию бизнеса", 1995);
        System.out.println(artem);

        System.out.println("================================================================");


        Car ladaGranta = new Car("Lada Granta", " ",2015, "России", "желтого", 1.7);
        System.out.println(ladaGranta);
        Car audi = new Car("Audi", "A8 50 L TDI quattro ", 2020, "Германии", "черного", 3.0);
        System.out.println(audi);
        Car bmw = new Car("BMW", " Z8 ", 2021, "Германии", "черного", 3.0);
        System.out.println(bmw);
        Car kia = new Car("Kia Sportage", "4-го поколения ", 2018, "Южной Корее", "красного", 2.4);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai Avante", "", 2016, "Южной Корее", "оранжевый", 1.6);
        System.out.println(hyundai);

        System.out.println("================================================================");


    }
}


