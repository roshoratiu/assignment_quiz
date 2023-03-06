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
        String info = "";
        String [] alpabet = {"a)", "b)", "c)", "d)", "e)", "f)", "g)", "h)", "i)", "j)", "k)", "l)", "m)", "n)", "o)", "p)", "q)", "r)", "s)", "t)", "u)", "v)", "w)", "x)", "y)", "z)"};
        for(int i = 0; i < QueAnswers.length; i++)
        info = info + alpabet[i] + " " + QueAnswers[i] + "\n";

        return showQuestion() + info;
    }
    
    
}
