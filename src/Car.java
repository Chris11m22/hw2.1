public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
   public int year;
    public String country;

    Car (String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        if (brand == null ) {
            brand = "default";
        }
        this.brand = brand;

        this.model = model;
        if (model == null) {
            model = "default";
        }
        this.model = model;
        this.year = year;
        if ( year < 0) {
            year = 2000;
        }
        this.year = year;
        this.country = country;
        if (country == null) {
            country = "default";
        }
        this.country = country;
        this.color = color;
        if (color == null) {
            color = "белого";
        }
        this.color = color;
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

    }

    @Override
    public String toString() {
        return brand + ", " + model + year + " год выпуска, " + "сборка в "+ country + ", " + color + " цвета" + ", объем двигателя — " +engineVolume + "л";
    }
}
