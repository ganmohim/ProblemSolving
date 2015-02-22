package votes;

import java.util.*;
import java.io.*;

public class Election {

    ArrayList<Candidate> arrayOfCandidate = new ArrayList<Candidate>(); // array of candidates
    ArrayList<Integer> votes = new ArrayList<Integer> (); // fetch all votes
    
    
    public void readVote() throws IOException {
        int idGenerator = 0; // id generator
        FileReader fr = new FileReader("votes.txt");
        Scanner sc = new Scanner(fr);
        
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner s = new Scanner(line);
            
            while (s.hasNext()) {
                if ( !(s.hasNextInt()) ) {
                    arrayOfCandidate.add(new Candidate(line, ++idGenerator));
                    break;
                    
                } // end of if
                
                else {
                    votes.add(s.nextInt());
                    
                } // end of else
                
            } // end of inner while
            
        } // end of outer while
        
    } // end of readVote()
    
    
    public void numberOfVotes() {
        System.out.println("Number of total votes: " + votes.size());
    }
    
    public void voteChecker() {
        int validVotes   = 0;
        int invalidVotes = 0;
        
        Integer[] voteList = new Integer[votes.size()];
        voteList = votes.toArray(voteList);
        
        for (int i = 0; i < voteList.length; i++) {
            if (voteList[i] >= 1 && voteList[i] <= 7) {
                validVotes++;
            
            } // end of if
            
            else {
             invalidVotes++;
            }
        } // end of for
        
        System.out.println("Number of valid votes: " + validVotes);
        System.out.println("Number of invalid votes: " + invalidVotes);
        
        
    } // end of votesChecker();
    
    // Votes obtained by each candidate
    public void voteDistribution() {
    
       for (Integer v : votes) {
       
           for (Candidate c : arrayOfCandidate) {
                
                if (v == c.getCandidateId()) {
                    c.incrementVote();
                    break;
                
                } // end of if      
           
           } // end of inner for
       
       } // end of outer for
       
       
       // printing content
       for (Candidate c : arrayOfCandidate) {
           System.out.println(c.getName() + " vote = " + c.getVoteCount());
       }
    
    } // end of method
    
    public void electionWinner() {
    
        int maxVote = 0;
        Candidate winner = null;
                
        for (Candidate c : arrayOfCandidate) {
            if (c.getVoteCount() > maxVote) {
                maxVote = c.getVoteCount();
                winner  = c;
                
            } // end of if
        
        } // end of for
        
        System.out.println("Winner is: " + winner.getName());
    
    }

    
}
