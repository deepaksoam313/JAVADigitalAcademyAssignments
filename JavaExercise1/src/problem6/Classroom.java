package problem6;

import java.util.HashSet;
import java.util.Set;

class Classroom {
    private Set<Student> students;

    public Classroom(Set<Student> students) {
        this.students = new HashSet<>(students);
    }

    public double calculateAverageClassGrade() {

        int total = 0;
        int studentCount = 0;

        if (students.isEmpty()) {
            return 0.0;
        }
        for (Student student : students) {
            total += student.calculateAverageGrade();
            studentCount++;
        }

        return (double) total / studentCount;
    }
}
