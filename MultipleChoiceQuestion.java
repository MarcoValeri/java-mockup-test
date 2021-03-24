public class MultipleChoiceQuestion {
    private String[] options;
    private int correctAnswerIndex, points;

    public MultipleChoiceQuestion(String[] options, int correctAnswerIndex, int points) {
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.points = points;
    }

    public int getPoints(String providedAnswer) {

        providedAnswer = providedAnswer.trim();

        if (providedAnswer.equals(options[correctAnswerIndex])) {
            return points;
        } else {
            return 0;
        }

    }

    public String getCorrectAnswer() {
        return options[correctAnswerIndex];
    }

    public String toString() {
        String output = "Multiple Choice question, options: " + java.util.Arrays.toString(options);
        output += ", correct answer index: " + correctAnswerIndex + ", points: " + points;
        return output;
    }

}
