package ex2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1/3
        Dog dog = new Dog(3,"Young Dog");
        Dog dog1 = new Dog(3,"Jake");
        Dog dog2 = new Dog(5,"Doge");
        DogNursery dogs = new DogNursery();
        dogs.addDog(dog);
        dogs.addDog(dog1);
        dogs.addDog(dog2);
        System.out.println(Arrays.toString(dogs.getDogsList()));
        //2/3
        Myach myach = new Myach(2.0, "orange");
        double radius = myach.getRadius();
        System.out.println(radius);
        myach.setRadius(8.0);
        System.out.println(myach.getRadius());
        System.out.println(myach);
        //3/3
        Book book = new Book(2.0, 1500, "JAVA", "programming");
        double weight = book.getWeight();
        int numPages = book.getNumPages();
        String bookTitle = book.getBookTitle();
        System.out.println();
        book.setWeight(8.0);
        book.setNumPages(5000);
        book.setBookTitle("Swift");
        System.out.println(book.getWeight());
        System.out.println(book.getNumPages());
        System.out.println(book);
    }
}
