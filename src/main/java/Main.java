import enums.Browser;
import geometry.Circle;
import geometry.GeometricShape;
import geometry.Rectangle;
import geometry.Square;
import goods.dolls.Doll;
import goods.dolls.DollHead;
import goods.dolls.DollOutfit;
import goods.dolls.EyeColor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;

    public static void main(String[] args) {


        //writeToFile();

        try {
            divide(2, 0);
        } catch (ArithmeticException e) {
            System.out.println("Sorry, not allowed to divide by zero");
        }
        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, no such file");
        }
    }
    public static int divide(int a, int b){
        return a / b;
    }



        //collections();
        // enumDemo();
//        try {
//            int x = Integer.parseInt("10");
//            int a = 10 / 0;
//            System.out.println(a);
//        } catch (ArithmeticException e){
//            System.out.println("Cannot divide by zero");
//            throw e;
//        } catch (NumberFormatException e){
//            System.out.println("Cannot caste string int");
//        }
//
//
//        Circle circle12 = new Circle(12);
//        Circle circle35 = new Circle(35);
//        Square square = new Square(10);
//        Rectangle rectangle = new Rectangle(15, 16);
//
//        addUpAreas(circle12, circle35,square,rectangle);

        //       createDolls();
//        getBooks();
//        whileOperator();
//        getUserScore();
//        sumOfNumbers();

//        String myString = "This is my string";
////        int sumOfTenAndFive = Util.calculateSum(10, 5, 3);
//        System.out.println(sumOfTenAndFive);
////        RubberDuck yellowDuck = new RubberDuck("yellow", "s", 4.99);
////        System.out.println(yellowDuck.getColor());
////        yellowDuck.printInfo();
////        yellowDuck.addToCart(4);
////        Util.sayHello("Vika");


//    public static void addUpAreas(Circle... circles) {
//
//        double sum = 0;
//        for (Circle circle : circles) {
//            sum += circle.getArea();
//        }
//        System.out.println("Area of all is: " + sum);
//    }
//
//    public static void addUpAreas(Square... squares) {
//
//        double sum = 0;
//        for (Square square : squares) {
//            sum += square.getArea();
//        }
//        System.out.println("Area of all is: " + sum);
//    }
//
//    public static void addUpAreas(Rectangle... rectangles) {
//
//        double sum = 0;
//        for (Rectangle rectangle : rectangles) {
//            sum += rectangle.getArea();
//        }
//        System.out.println("Area of all is: " + sum);
//    }


    public static void collections() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Jane");
        names.add("John");
        names.add("Nick");
        names.add(2, "Kate");


        //System.out.println(names.get(3));
        //names.forEach(System.out::println);

        List<String> namesThatStartWithJ = names.stream().
                filter(name -> name.startsWith("J")).sorted().toList();
        namesThatStartWithJ.forEach(System.out::println);

//        for(String name : names){
//            System.out.println(name);
//        }
    }

    public static void writeToFile() {
        FileWriter file;
        try {
            file = new FileWriter("D:\\belhard\\my_new_file.txt", true);
            file.write("newest file data\n");
            file.write("newest file data\n");
            file.close();
        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. Dull error message: " + e.getMessage());
        }
    }

    public static void readFromFile() throws FileNotFoundException {
        File file = new File("D:\\belhard\\my_new_file.txt");
        Scanner fileScanner = new Scanner(file);
        ArrayList<String> dataFromFile = new ArrayList<>();
        while (fileScanner.hasNext()) {
            dataFromFile.add(fileScanner.nextLine());
        }
        dataFromFile.forEach(System.out::println);
    }

    public static void enumDemo() {
        Browser browser = Browser.chrome;
        switch (browser) {
            case chrome -> System.out.println("You've chosen Chrome");
            case firefox -> System.out.println("You've chosen firefox");
            case ie -> System.out.println("You've chosen ie");
            case edge -> System.out.println("You've chosen edge");
            case safari -> System.out.println("You've chosen safari");
        }

    }

    public static void addUpAreas(GeometricShape... shapes) {

        double sum = 0;
        for (GeometricShape shape : shapes) {
            sum += shape.getArea();
        }
        System.out.println("Area of all geometric shapes is: " + sum);
    }

    public static void createDolls() {
        DollHead headForLucy = new DollHead("blond", EyeColor.GRAY, false);
        DollOutfit outfitForLucy = new DollOutfit("dress", "red");
        Doll lucy = new Doll(headForLucy, outfitForLucy, "white", "Lucy", false, 15);

        System.out.println(lucy.getHead().getHairColor());

        Doll debby = new Doll("black", EyeColor.BLUE, true, "suit", "blue", "black", "Debby", true, 50);
    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int userInput = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= userInput; i++) {
            sum += i;
        }

        System.out.printf("Sum of numbers from 0 to %d is %d", userInput, sum);
    }

    public static void getUserScore() {
        System.out.print("Please enter your score: ");
        int userScore = new Scanner(System.in).nextInt();

        if (userScore >= 70) {
            System.out.println("You get an A");
        } else if (userScore >= 50) {
            System.out.println("You get an B");
        } else if (userScore >= 30) {
            System.out.println("You get an C");
        } else {
            System.out.println("You get an D");
        }

        System.out.println("End the program");
    }

    public static void getBooks() {
        String[] books = new String[4];
        books[0] = "Harry Potter";
        books[1] = "Crime and Punishment";
        books[2] = "Silmarillion";
        books[3] = "Dune";

        for (int i = 0; i < books.length; i++) {
            System.out.printf("Book %d: %s\n", i + 1, books[i]);
        }

        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void whileOperator() {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        while (userInput.isEmpty()) {
            System.out.println("Please enter something");
            userInput = scanner.next();
        }
        System.out.println("Thanks, bye!");
    }
}


//     System.out.print("Please enter your language: \n1 - English\n2 - Русский\n3 - Italiano\n4 - Francais\n");
//        int selectedLanguage = new Scanner(System.in).nextInt();
//        String hello;
//
//        hello = switch (selectedLanguage) {
//            case 1 -> {
//                System.out.println("Hello!");
//                System.out.println("Hi!");
//            }
//            case 2 -> hello = "Привет!";
//            case 3 -> "Salut!";
//            default -> "Sorry, wrong selection";
//        }switch (selectedLanguage) {
//        case 1:
//            System.out.println("Hello!");
//            break;
//        case 2 :
//            System.out.println("Привет!");
//            break;
//        case 3 :
//            System.out.println("Ciao!");
//            break;
//        case 4 :
//            System.out.println("Salut!");
//            break;
//Тернарный оператор
//        System.out.print("Please enter your score: ");
//        int userScore = new Scanner(System.in).nextInt();
//
//        String result = userScore >= 70 ? "Congrats!" : "LOOSER!";
//
//        System.out.println(result);
//  Массив
//
//        String[] books = new String[10];
//        books[0] = "Harry Potter";
//        books[1] = "Crime and Punishment";
//        books[2] = "Silmarillion";
//        books[3] = "Dune";
//
//        System.out.println(books[3]);
//        books[3] = "Java for Dummies";
//
//        System.out.println(books[3]);
//
//        String[] movies = new String[] {"1+1", "Avatar", "Titanic", "Full Metal Jacket"};
//
//        String[][] students = new String[][]{
//                { "John", "Doe" },
//                { "Jane", "Snow"  },
//                { "Peter", "Smith" }
//        };
//        System.out.printf("Name: %s, Surname: %s", students[0][0], students[1][1]);
//
//
//            int age; //объявление (декларация) переменной
//            age = 36; // инициализация переменной или первое присваивание значения переменной
//            int houseNr = 10; // объявление переменной + инициализация переменной
//            // camelCase for variable name
//            String name = "Vika";
//            String surname = "Vika";
//
//            System.out.println(name.equals(surname));
//            String homeAddress = "Lenina Str.,18";
//
//            String infoAboutMe = String.format("My Address is: %s,\n My name is %s,\n My age is %d\n",
//                    homeAddress, name, age);
//            System.out.println(infoAboutMe);
//            System.out.printf("My Address is: %s, My name is %s, My age is %d\n",
//                    homeAddress, name, age);
//            // конкатенация строк == склеивание строк
//
//            // String buffer:
//            StringBuffer buffer = new StringBuffer("My name is: ");
//            buffer.append("Vika");
//            System.out.println(buffer);
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please, enter your name: ");
//            String userName = scanner.nextLine(); // shift F6 refactor name
//            System.out.println(userName);
//boolean aEqualsb = a < b || b < c;
//a = a + 16; // a += 15;
//a = a % 3;   // a %= 3;