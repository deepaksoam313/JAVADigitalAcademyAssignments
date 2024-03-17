package problem6;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        // Create students with grades
        Student student1 = new Student("Alice", Map.of("Math", 90, "English", 85, "History", 78));
        Student student2 = new Student("Bob", Map.of("Math", 88, "English", 92, "History", 79));

        System.out.println("Average Student1 Grade: " + student1.calculateAverageGrade());
        // Create a classroom with students
        Classroom classroom1 = new Classroom(Set.of(student1, student2));


        // Create a school with classrooms
        School school = new School(List.of(classroom1));

        // Calculate and print average school grade
        double averageSchoolGrade = school.calculateAverageSchoolGrade();
        System.out.println("Average School Grade: " + averageSchoolGrade);
    }
}
