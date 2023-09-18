public class Main {
    public static void main(String[] args){
        Hello hello = new Hello();
        hello.askName();
        hello.show();
        WorkingTimeScale workingTimeScale = new WorkingTimeScale();
        workingTimeScale.add(0);
        workingTimeScale.currentWorkingTime();
    }
}