package quiz;

public class OpenQuestion extends Question {
    
    public OpenQuestion(String question, String answer, int score){
        super(question, answer, score);
    }

    public OpenQuestion ( String question , String answer ){
        this(question, answer, 0);
    }

    public boolean isCorrect ( String answer ){
        if(answer.equalsIgnoreCase(Canswer))
         return true;
         else return false;
     }

    @Override
    public String toString(){
        return String.format("%s \n", showQuestion());
    }
    
}
