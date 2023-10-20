package com.app.dependency.dependency;

import com.app.dependency.dependency.task.School;
import com.app.dependency.dependency.task.SchoolClass;
import com.app.dependency.dependency.task.Student;
import com.app.dependency.dependency.task.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest @Slf4j
public class SchoolTests {

    @Autowired
    private School school;
    private Teacher teacher;
    private Student student;
    private SchoolClass schoolClass;

    @Test
    public void schoolTests() {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student(school), new Student(school)));
        List<Teacher> teachers = new ArrayList<>(Arrays.asList(new Teacher(school), new Teacher(school)));
        List<SchoolClass> schoolClasses = new ArrayList<>(Arrays.asList(new SchoolClass(teachers.get(0)), new SchoolClass(teachers.get(1))));
        students.forEach(school.getStudents()::add);
        teachers.forEach(school.getTeachers()::add);
        for (int i = 0; i < teachers.size(); i++) {

        }

//        teachers.stream().map(SchoolClass::new).forEach(schoolClasses::add);
        teachers.forEach(teacher -> teacher.getSchoolClasses().add(new SchoolClass(teacher)));
        teachers.get(0).getSchoolClasses().get(0).getStudents().add(students.get(0));
        teachers.get(1).getSchoolClasses().get(1).getStudents().add(students.get(1));

        log.info(school.toString());
    }
}
