package SrcChallenge;

public class printGradebook {
    public static void main (String[] args) {
        Gradebook gradebook = new Gradebook();
        
        Student student1 = new Student("Johan", new int[] {65, 78, 63, 70, 52});
        gradebook.addStudent(student1);
        Student student2 = new Student("Karim", new int[] {94, 98, 87, 100, 100});
        gradebook.addStudent(student2);
        Student student3 = new Student("Lionel", new int[] {100, 92, 88, 99, 96});
        gradebook.addStudent(student3);
        Student student4 = new Student("Kylian", new int[] {67, 78, 88, 90, 83});
        gradebook.addStudent(student4);
        Student student5 = new Student("Erling", new int[] {75, 75, 76, 72, 79});
        gradebook.addStudent(student5);

        System.out.println("Starting Gradebook:");
        System.out.println("=========================================");
        gradebook.printGradeBook();
        System.out.println("");
        System.out.println("<< Replacing Karim with Virgil >>");

        gradebook.replaceName("Karim", "Virgil");

        System.out.println("");
        System.out.println("Starting Gradebook:");
        System.out.println("=========================================");
        gradebook.printGradeBook();
        System.out.println("");
        System.out.println("<< Replacing Johan, Quiz Score 1, with 72 >>");

        gradebook.replaceQuizScore("Johan", 1, 72);

        System.out.println("");
        System.out.println("Starting Gradebook:");
        System.out.println("=========================================");
        gradebook.printGradeBook();
        System.out.println("");
        System.out.println("<< Replacing Lionel, all info, with Mohamed >>");

        Student student6 = new Student("Mohamed", new int[] {99, 92, 93, 96, 90});
        gradebook.replaceStudent("Lionel", student6);

        System.out.println("");
        System.out.println("Starting Gradebook:");
        System.out.println("=========================================");
        gradebook.printGradeBook();
        System.out.println("");
        System.out.println("<< Inserting Neymar before Kylian >>");

        Student student7 = new Student("Neymar", new int[] {82, 76, 88, 87, 84});
        gradebook.insertStudent("Kylian", student7);

        System.out.println("");
        System.out.println("Starting Gradebook:");
        System.out.println("=========================================");
        gradebook.printGradeBook();
        System.out.println("");
        System.out.println("<< Deleting Erling >>");

        gradebook.deleteStudent("Erling");

        System.out.println("");
        System.out.println("Starting Gradebook:");
        System.out.println("=========================================");
        gradebook.printGradeBook();
    }
}
