package problem6;

import java.util.ArrayList;
import java.util.List;

class School {
    private List<Classroom> classrooms;

    public School(List<Classroom> classrooms) {
        this.classrooms = new ArrayList<>(classrooms);
    }

    public double calculateAverageSchoolGrade() {

        int total = 0;
        int classroomCount = 0;

        if (classrooms.isEmpty()) {
            return 0.0;
        }

        for (Classroom classroom : classrooms) {
            total += classroom.calculateAverageClassGrade();
            classroomCount++;
        }

        return (double) total / classroomCount;
    }
}
