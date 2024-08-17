package app;

class Main {
    private final String name;
    private final int age;
    private String profession;

    public Main(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }

    public static void main(String[] args) {
        Main person1 = new Main("John", 30, "Інженер");
        Main person2 = new Main("Mary", 25, "Вчитель");
        Main person3 = new Main("Bob", 35, "Лікар");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Main alice = new Main("Alice", 28, "Архітектор");
        alice.displayInfo();

        alice.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        alice.displayInfo();
    }
}
