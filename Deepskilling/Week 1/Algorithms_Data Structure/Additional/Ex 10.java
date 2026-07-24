class Student {

    String name;
    int id;
    String mark;

    void setName(String n) {
        name = n;
    }

    void setId(int i) {
        id = i;
    }

    void setMark(String m) {
        mark = m;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    String getMark() {
        return mark;
    }
}

class StudentView {

    void print(Student s) {
        System.out.println("Student Name : " + s.getName());
        System.out.println("Student Id : " + s.getId());
        System.out.println("Student Grade : " + s.getMark());
    }
}

class StudentController {

    Student s;
    StudentView v;

    StudentController(Student s, StudentView v) {
        this.s = s;
        this.v = v;
    }

    void changeName(String n) {
        s.setName(n);
    }

    void changeId(int i) {
        s.setId(i);
    }

    void changeMark(String m) {
        s.setMark(m);
    }

    void show() {
        v.print(s);
    }
}

public class Ex10 {

    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Praveena");
        s.setId(101);
        s.setMark("A");

        StudentView v = new StudentView();

        StudentController c = new StudentController(s, v);

        c.show();

        System.out.println();

        c.changeName("Priya");
        c.changeMark("A+");

        c.show();
    }
}