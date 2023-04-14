package класи3;

public class Woman {
    private  String name;
    private  int age;
    private String hasband;

    public Woman(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setHasband(String name){
        this.hasband=name;
    }
    public String getName()
    {
        return this.name;

    }
    public String getHasband()
    {
        return this.hasband;

    }
    public int getAge()
    {
        return this.age;

    }
}
