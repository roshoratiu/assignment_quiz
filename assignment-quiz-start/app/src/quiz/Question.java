package quiz;

public abstract class Question {

    protected int score;
    protected int intCorrectanswer;
    protected String Canswer;
    private String Question;

    public Question(String question, String answer, int score){
        this.score = score;
        this.Question = question;
        this.Canswer = answer;
    }

    public Question(String question2, int correctAnswer, int score2) {
        this.Question = question2;
        this.intCorrectanswer = correctAnswer;
        this.score = score2;
    }

    public String toString(){
        return String.format(showQuestion());
    }

    public boolean isCorrect ( String answer ){
       if(answer.equalsIgnoreCase(Canswer))
        return true;
        else return false;
    }

    public String correctAnswer(){
        return Canswer;
    }

    public int getScore (){
        return score;
    }

    public String showQuestion(){
        return Question;
    }

    public void setScore (int val){
        this.score = val;
    }
}
