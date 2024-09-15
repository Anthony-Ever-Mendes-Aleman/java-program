public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //setters or mutators

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
}
