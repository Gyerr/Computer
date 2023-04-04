package SrcChallenge;

import java.util.ArrayList;
import java.util.List;

public class Gradebook {
    private List<Student> students;

    public Gradebook() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printGradeBook() {
        System.out.println("Name\tQuiz 1\tQuiz 2\tQuiz 3\tQuiz 4\tQuiz 5");
        for (Student student : students) {
            System.out.printf("%s%7s%7s%9s%9s%9s\n", student.getName(), student.getQuizScore(1), student.getQuizScore(2), student.getQuizScore(3), student.getQuizScore(4), student.getQuizScore(5));
        }
        System.out.println();
    }

    public void replaceName(String oldName, String newName) {
        for (Student student : students) {
            if (student.getName().equals(oldName)) {
                student.setName(newName);
                break;
            }
        }
    }

    public void replaceQuizScore(String name, int quizNumber, int newScore) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setQuizScore(quizNumber, newScore);
                break;
            }
        }
    }

    public void replaceStudent(String oldName, Student newStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(oldName)) {
                students.set(i, newStudent);
                break;
            }
        }
    }

    public void insertStudent(String oldName, Student newStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(oldName)) {
                students.add(i, newStudent);
                break;
            }
        }
    }

    public void deleteStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                break;
            }
        }
    }
}

