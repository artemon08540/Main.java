package класи3;

public class Main {
    public static void main(String[] args)  {
    Man man = new Man("Anton", 19);
    Woman woman = new Woman("Marina", 20);
    woman.setHasband(man.getName());
    man.setWife(woman.getName());
        System.out.println(man.getName());
        System.out.println(man.getAge());
        System.out.println(man.getWife());
        System.out.println(woman.getName());
        System.out.println(woman.getAge());
        System.out.println(woman.getHasband());

    }
}
