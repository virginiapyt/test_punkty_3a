package pl.tomczyk.kopiatestu3a;

public class Question {
    private int textQuestionId;
    private int[] answer = new int[3];
    private boolean[] answerTrue = new boolean[3];

    public Question(int textQuestionId, int[] answer, boolean[] answerTrue) {
        this.textQuestionId = textQuestionId;
        this.answer = answer;
        this.answerTrue = answerTrue;
    }

    public int getTextQuestionId() {
        return textQuestionId;
    }

    public int getAnswer(int i) {
        return answer[i];
    }

    public boolean getAnswerTrue(int i) {
        return answerTrue[i];
    }
}
