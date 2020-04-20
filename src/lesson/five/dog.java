package lesson.five;

public class dog extends animals {

    private int restrictionRun;
    private int restrictionSwim;
    private int restrictionJump;

    public dog(String name, int age, int run, int jump, int swim) {
        super(name, age);
        this.restrictionRun = run;
        this.restrictionJump = jump;
        this.restrictionSwim = swim;
    }

    @Override
    public void run (int runLong) {
        if (restrictionRun > runLong) {
            System.out.println("Dog " + name + " can run");
        } else {
            System.out.println("Dog " + name + " can't run");
        }
    }

    @Override
    public void swim(int swimLong) {
        if (restrictionSwim > swimLong) {
            System.out.println("Dog " + name + " can swim");
        } else {
            System.out.println("Dog " + name + " can't swim");
        }
    }

    @Override
    public void jump(int highJump) {
        if (restrictionJump > highJump) {
            System.out.println("Dog " + name + " can jump");
        } else {
            System.out.println("Dog " + name + " can't jump");
        }
    }
}
