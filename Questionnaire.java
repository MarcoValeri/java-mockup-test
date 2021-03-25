public class Questionnaire {
    private final int CAPACITY = 10;
    private Question[] Questions = new Question[CAPACITY];
    private int currentIndex = 0;

    public void addQuestion(Question question) {
        if (currentIndex < CAPACITY) {
            Questions[currentIndex] = question;
            currentIndex++;
        } else return;
    }

    public int getCount() {
        return currentIndex;
    }

    public int getPoints(String[] answers) {

        int points = 0;

        for (int i = 0; i < currentIndex; i++) {
            
            if (Questions[i].equals(answers)) {
                points++;
            }

        }

        return points;

    }

}
