package lesson.five;

public class bird extends animals {

    private int restrictionRun;
    private int restrictionJump;

    public bird(String name, int age, int run, int jump) {
        super(name, age);
        this.restrictionRun = run;
        this.restrictionJump = jump;
    }

    @Override
    public void run (int runLong) {
        if (restrictionRun > runLong) {
            System.out.println("Bird " + name + " can run");
        } else {
            System.out.println("Bird " + name + " can't run");
        }
    }

    @Override
    public void swim(int s) {
        System.out.println("Bird can't swim");
    }

    @Override
    public void jump(int highJump) {
        if (restrictionJump > highJump) {
            System.out.println("Bird " + name + " can jump");
        } else {
            System.out.println("Bird " + name + " can't jump");
        }
    }
}
