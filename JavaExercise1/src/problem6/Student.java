package problem6;

import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private Map<String, Integer> coursesGrades;

    public Student(String name, Map<String, Integer> coursesGrades) {
        this.name = name;
        this.coursesGrades = new HashMap<>(coursesGrades);
    }

    public double calculateAverageGrade() {
        int total = 0;

        if (coursesGrades.isEmpty()) {
            return 0.0;
        }
        for (int grade : coursesGrades.values()) {
            total += grade;
        }

        return (double) total / coursesGrades.size();
    }
}
