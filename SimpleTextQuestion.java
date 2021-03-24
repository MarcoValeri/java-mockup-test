public class SimpleTextQuestion extends Question {
    private String correctAnswer;
    private int points;

    public SimpleTextQuestion(String correctAnswer, int points) {
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public int getPoints(String providedAnswer) {

        providedAnswer = providedAnswer.trim();

        if (providedAnswer.equals(correctAnswer)) {
            return points;
        } else {
            return 0;
        }
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String toString() {
        return "Correct answer: " + correctAnswer + " - points: " + points;
    }

}