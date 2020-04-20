package lesson.five;

public class cat extends animals {

    private int restrictionRun;
    private int restrictionJump;

    public cat(String name, int age, int run, int jump) {
        super(name, age);
        this.restrictionRun = run;
        this.restrictionJump = jump;

    }

    @Override
    public void run(int runLong) {
        if (restrictionRun > runLong) {
            System.out.println("Cat " + name + " can run");
        } else {
            System.out.println("Cat " + name + " can't run");
        }
    }

    @Override
    public void swim(int s) {
        System.out.println("Cat can't swim");
    }

    @Override
    public void jump(int highJump) {
        if (restrictionJump > highJump) {
            System.out.println("Cat " + name + " can jump");
        } else {
            System.out.println("Cat " + name + " can't jump");
        }
    }
}

