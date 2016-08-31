package module3.task3;


import java.util.Date;

public class Main {
    private static final int courseNumber = 5;

    public static void main(String[] args) {
        Course[] cs = new Course[courseNumber];
        Date d = new Date();

        String name = "Test course";
        for(int i=0; i<courseNumber; i++ ) {
            cs[i] = new Course(d, name+" "+i);
        }

        System.out.println(cs[3].getName());

        Student st1 = new Student("First Name1","Last Name1",1);
        Student st2 = new Student("Last Name", cs);
        CollegeStudent st3 = new CollegeStudent("First Name2","Last Name2",2);
        CollegeStudent st4 = new CollegeStudent("Last Name2", cs);
        CollegeStudent st5 = new CollegeStudent("College Name", 5, 1);
        SpecialStudent st6 = new SpecialStudent("First Name3","Last Name3",3);
        SpecialStudent st7 = new SpecialStudent("Last Name3", cs);
        SpecialStudent st8 = new SpecialStudent(31415926);
    }
}

