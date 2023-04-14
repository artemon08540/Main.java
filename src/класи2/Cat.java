package класи2;

public class Cat {
    private String name;
    private int age;
    private static String owner;
    public Cat(String name, int age){
        this.name=name;
        this.age=age;
        this.owner=owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getName()
    {
        return this.name;

    }
    public String getOwner()
    {
        return this.owner;

    }
    public int getAge()
    {
        return this.age;

    }
}

