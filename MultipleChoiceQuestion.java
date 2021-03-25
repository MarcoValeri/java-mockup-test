public class MultipleChoiceQuestion extends Question {
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
        String output = "MultipleChoiceQuestion:\n";
        for (int i = 0; i < options.length; i++) {
            output += "- " + options[i] + "\n";
        }
        output += "Points: " + points;
        return output;
    }

}