public class Human {
     int yearOfBirth;
    String name;
     String town;
     String jobTitle;


    Human (String name, String town, String jobTitle, int yearOfBirth) {
        this.name = name;
        if (name == null) {
            name = "Информация не указана";
        }
        this.name = name;

        this.town = town;
        if (town == null) {
            town = "Информация не указана";
        }
        this.town = town;


        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            jobTitle = "Информация не указана";
        }
        this.jobTitle = jobTitle;

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +yearOfBirth + " году." + " Я работаю на должности "+ jobTitle +". Будем знакомы!";
    }
}

