package votes;

public class Candidate {
    private String name;
    private int candidateId;
    private int voteCounter;
    
    public Candidate(String name, int candidateId) {
        this.name = name;
        this.voteCounter = 0;
        this.candidateId = candidateId;
    }
    
    public int getCandidateId() {
        return candidateId;
    }
    
    public String getName() {
        return name;
    }
    
    public int getVoteCount() {
        return voteCounter;
    }
    
    public void incrementVote() {
        voteCounter++;
    }
    
    


}
