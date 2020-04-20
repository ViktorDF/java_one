package lesson.five;


public abstract class animals {

    protected String name;
    protected int age;

    protected animals( String name, int age){
        this.age = age;
        this.name = name;
    }

    public abstract void run(int r);

    public abstract void swim(int s);

    public abstract void jump(int j);

}
