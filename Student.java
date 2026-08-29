class StudentData {
    String name;

    StudentData(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student record created: " + name);
    }
}

public class Student {

    static String collegeName;
    static int academicYear;

    
    static {
        collegeName = "SRM";
        academicYear = 2026;
        System.out.println("College info loaded");
    }

    public static void main(String[] args) {

        String[] names = {
            "Ravi",
            "Meera",
            "Karthik",
            "Divya",
            "Anitha"
        };

        for (int i = 0; i < names.length; i++) {
            StudentData s = new StudentData(names[i]);
            s.display();
        }
    }
}
