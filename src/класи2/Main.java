package класи2;

import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
        Woman woman = new Woman("Vika", 15);
        Cat cat1 = new Cat("Murchik",15);
        Cat cat2 = new Cat("Mura",17);
        cat1.setOwner(woman.getName());
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1.getOwner());
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());
        System.out.println(cat2.getOwner());
    }
}
