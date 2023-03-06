package quiz;

public class MultipleChoiceQuestion extends Question{

    private int correctAnswer; // will save the position of the answer in string QueAnswers
    private String[] QueAnswers;

    public MultipleChoiceQuestion(String question, String [] answers, int correctAnswer, int score) {
        super(question, correctAnswer, score);
        this.QueAnswers = answers;

    }

    public MultipleChoiceQuestion(String question, String [] answers, int correctAnswer) {
        this(question, answers, correctAnswer, 0);

    }

    public boolean isCorrect(int pos){

        /*
         * Checks if the position of the right answer
         */

        if(correctAnswer == pos)
            return true;
        else
            return false;
    }

    @Override
    public String toString(){
        return String.format("%s \n a) %s \n b) %s \n c) %s \n d) %s \n", showQuestion(), QueAnswers[0], QueAnswers[1], QueAnswers[2], QueAnswers[3]);
    }
    
    
}
