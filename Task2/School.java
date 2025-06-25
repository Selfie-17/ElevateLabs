import java.util.ArrayList;

class Student{
    int id;
    String name;
    float marks;

}

class School{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        addStudent(students, 1, "Sam", 85.5f);
        addStudent(students, 2, "Anu", 90.0f); 
        addStudent(students,3, "selva", 75.5f);
    }

    static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Marks: " + student.marks);
        }
    }

    static void addStudent(ArrayList<Student> students, int id, String name, float marks) {
        Student newStudent = new Student();
        newStudent.id = id;
        newStudent.name = name;
        newStudent.marks = marks;
        students.add(newStudent);
    }
    static void removeStudent(ArrayList<Student> students, int id) {
        students.removeIf(student -> student.id == id);
    }
    static void updateStudent(ArrayList<Student> students, int id, String name, float marks) {
        for (Student student : students) {
            if (student.id == id) {
                student.name = name;
                student.marks = marks;
                break;
            }
        }
    }
}