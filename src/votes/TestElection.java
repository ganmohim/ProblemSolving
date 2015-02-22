package votes;

import java.io.*;

public class TestElection {
	public static void main(String[] args) throws IOException {
		Election electionObj = new Election();
		electionObj.readVote();
		electionObj.numberOfVotes();
		electionObj.voteChecker();
		electionObj.voteDistribution();
		electionObj.electionWinner();
	}

}
