package quiz;

public class OpenQuestion extends Question {
    
    public OpenQuestion(String question, String answer, int score){
        super(question, answer, score);
    }

    public OpenQuestion ( String question , String answer ){
        this(question, answer, 0);
    }

    @Override
    public String toString(){
        return String.format("The correct ansewer is: %s, and you scored %d", correctAnswer(), getScore());
    }
    
}
