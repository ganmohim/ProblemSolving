package quizmarker;


public class Candidate {
    private int id;
    private String answers;
    private int points;
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setAnswers(String answers) {
    	this.answers = answers;
    }
    
    public void setPoints(int points) {
    	this.points = points;
    }
    
    public int getId() {
    	return id;
    }
    
    public String getAnswers() {
    	return answers;
    }
    
    public int getPoints() {
    	return points;
    }
    
}
