package Domain;

import java.io.Serializable;
import java.util.List;

public class Session implements Serializable {

    static final long serialVersionUID = -7588980448693010399L;
    protected State state;
    protected String question;
    protected List<String> subjectChoices;
    protected List<String> questionsInARond;
    protected String answer = "";
    protected Boolean verdict;
    protected int scoreRond = 0;
    protected int scoreTotal = 0;
    protected String whatSubject = "";

    public Session(List subjectChoices) {

        this.subjectChoices = subjectChoices;
        verdict = null;
        state = State.WAITING;

    }

    public State getState() {
        return state;
    }

    public Boolean getVerdict() {
        return verdict;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getwhatSubject() {
        return whatSubject;
    }

    public List getsubjectChoices() {
        return subjectChoices;
    }

    public List getQuestionsInARond() {
        return questionsInARond;
    }
    
    public int getScoreTotal(){
        return scoreTotal;
    }
    
    public int getScoreRond(){
        return scoreRond;
    }

    public void setquestionsInARond(List questionsInARond) {
        this.questionsInARond = questionsInARond;
    }

    public void setSubjectChoices(List subjectChoices) {
        this.subjectChoices = subjectChoices;
    }

    public void setWhatSubject(String subject) {
        whatSubject = subject;
    }

    public void setState(State s) {
        state = s;
    }

    public void setVerdict(Boolean b) {
        verdict = b;
    }

    public void setQuestion(String s) {
        question = s;
    }

    public void setAnswer(String s) {
        answer = s;
    }

    public void addScoreRond() {
        scoreRond++;
    }

    public void addScoreTotal() {
        scoreTotal++;
    }

    public void resetScoreRond() {
        scoreRond = 0;
    }
}
