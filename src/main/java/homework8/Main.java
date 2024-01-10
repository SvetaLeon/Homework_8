package homework8;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();

        System.out.println("Method add");
        fileNavigator.add("scr/main/java/homework/Animal.java", new FileData("Animal.java", (byte) 73,
                "scr/main/java/homework"));
        fileNavigator.add("scr/main/java/homework/Dog.java", new FileData("Dog.java", (byte) 69,
                "scr/main/java/homework"));
        fileNavigator.add("scr/main/java/homework/Cat.java", new FileData("Cat.java", (byte) 51,
                "scr/main/java/homework"));
        fileNavigator.add("scr/main/java/homework/Main.java", new FileData("Main.java", (byte) 45,
                "scr/main/java/homework"));
        fileNavigator.add("scr/main/java/lessons/Androids.java", new FileData("Androids.java", (byte) 97,
                "scr/main/java/lessons"));
        fileNavigator.add("scr/main/java/lessons/IPhones.java", new FileData("IPhones.java", (byte) 83,
                "scr/main/java/lessons"));
        fileNavigator.add("scr/main/java/lessons/MainPhone.java", new FileData("MainPhone.java", (byte) 65,
                "scr/main/java/lessons"));
        fileNavigator.add("scr/main/java/ua/shutko/lessons/Car.java", new FileData("Car.java", (byte) 77,
                "scr/main/java/lessons"));
        System.out.println("List of added files " + fileNavigator.listFiles.values());
        System.out.println();

        System.out.println("Method find");
        fileNavigator.find("scr/main/java/homework");
        fileNavigator.find("scr/main/java/lessons");
        System.out.println();

        System.out.println("Method filterBySize");
        fileNavigator.filterBySize((byte) 71);
        System.out.println();

        System.out.println("Method remove");
        fileNavigator.remove("scr/main/java/lessons");
        System.out.println("List of files remaining " + fileNavigator.listFiles.values());
        System.out.println();

        System.out.println("Method sortBySize");
        fileNavigator.sortBySize();
    }
}
