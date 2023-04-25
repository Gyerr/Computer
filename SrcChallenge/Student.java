package SrcChallenge;
public class Student {
    private String name;
    private int[] quizScores;

    public Student(String name, int[] quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }

    public int getQuizScore(int quizNumber) {
        return quizScores[quizNumber - 1];
    }

    public void setQuizScore(int quizNumber, int score) {
        quizScores[quizNumber - 1] = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        for (int score : quizScores) {
            sb.append(score).append(" ");
        }
        return sb.toString();
    }
}
