package класи3;

public class Man {
    private String name;
    private int age;
    private String wife;

    public Man(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setWife(String name){
        this.wife=name;
    }
    public String getName()
    {
        return this.name;

    }
    public String getWife()
    {
        return this.wife;

    }
    public int getAge()
    {
        return this.age;

    }
}
