package quiz;

public class ThisThatQuestion extends MultipleChoiceQuestion{
    
    public ThisThatQuestion ( String question , String answer1 , String answer2 , int correctAnswer , int score){
        super(question, new String [] {answer1, answer2}, correctAnswer, score);
    }

    public ThisThatQuestion ( String question , String answer1 , String answer2 , int correctAnswer){
        this(question, answer1, answer2,correctAnswer, 0);
    }

    public boolean isCorrect(String answer){
        if(answer.equalsIgnoreCase(correctAnswer()))
            return true;
        else
            return false;
    }

    @Override
    public String toString(){
        return String.format("Right or Wrong: %s \n", showQuestion());
    }
}
