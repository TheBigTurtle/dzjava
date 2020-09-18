package ex2;

public class Dog {
    private int age;
    private String name;

    public Dog (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void intoHumanAge(){
        System.out.println(name +
                "'s age in human years='" +
                age * 7 + '\'' + "years");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "age='" + age + '\'' +
                "into human age='" + age * 7 +
                "}";
    }
    void printDogInfo(){
        System.out.println(age);
        System.out.println(name);
    }
}
