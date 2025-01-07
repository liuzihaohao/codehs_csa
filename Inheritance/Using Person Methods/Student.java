public class Student extends Person {
    
    private int grade;

    public Student(String name, int grade)
    {
        super(name);
        this.grade = grade;
    }

    @Override
    public void printName(){
        System.out.print("Student ");
        super.printName();
    }

}