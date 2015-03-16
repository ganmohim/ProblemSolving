package quizmarker;

import java.util.*;
import java.io.*;

public class QuizMarker {
    
    char[] quizAnswers = new char[20]; // quiz answers
    ArrayList<Candidate> listOfCandidate = new ArrayList<Candidate>(); // list of candidate

    public void readQuizData() throws IOException {
        int counter = 0;
        Scanner sc = new Scanner(new FileReader("exam.txt"));
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            counter++; // This line was not there before. Added to fix bug#1
            
            if (line.equals("0")) break; // break out of scanner
            
            if (counter == 1) { // Due to bug#1 else block was unreachable
                loadQuizAnswers(line);
            }
            
            else {
                Scanner s  = new Scanner(line);
                Candidate cand = new Candidate();
                
                while (s.hasNext()) {
                    
                    if (s.hasNextInt())
                        cand.setId(s.nextInt());
                    
                    else
                        cand.setAnswers(s.next());
                    
                
                
                } // end of inner while
                
                listOfCandidate.add(cand);
            
            }
              
            
            
        } // end of while
        
        sc.close();
    
    }
    
    public void loadQuizAnswers(String quizAnswerString) {
        quizAnswers = quizAnswerString.toCharArray(); // load char array of quiz answers
    }
    
    public void markQuiz() {
        for (Candidate c : listOfCandidate) {
            addPoints(c);
        }
    }
    
    public void addPoints(Candidate c) {
       
        String candAnswerStr = c.getAnswers();
        
        char[] answerOfCand = new char[candAnswerStr.length()];
        answerOfCand = candAnswerStr.toCharArray();
        
        int j = 0;
        
        for (int i = 0; i < quizAnswers.length; i++) {
        
            if (quizAnswers[i] == answerOfCand[j]) {
            	int points = c.getPoints();
                points += 4;
                c.setPoints(points);
                j++;
            }
            
            else {
                if (answerOfCand[j] == 'X') {
                    // do nothing = 0 point for skipped question
                    j++;
                }
                
                else {
                	int points = c.getPoints();
                    points -= 1; // -1 point for wrong answer
                    c.setPoints(points);
                    j++;
                }
            } // end of outer else
        
        } // end of for
        
    } // end of addPoints()
    
    public void sortQuizResultById() {
        int size = listOfCandidate.size();
        
        Candidate[] arrayOfCand = new Candidate[size];
        arrayOfCand = listOfCandidate.toArray(arrayOfCand);
        
        for (int i = 0; i < arrayOfCand.length; i++) {
            
            for (int j = i+1; j < arrayOfCand.length; j++) {
            
                if (arrayOfCand[i].getId() > arrayOfCand[j].getId()) {
                    Candidate temp = arrayOfCand[j];
                    arrayOfCand[j] = arrayOfCand[i];
                    arrayOfCand[i]  = temp;
                
                } //end of if
                
            
            } //end of inner for
            
        } // end of outer for
        
        // show the result after sorting
        
        for (int i = 0; i < arrayOfCand.length; i++) {
            System.out.println(arrayOfCand[i].getId() + " " + arrayOfCand[i].getPoints());
        }
        
        
    } // end of sortQuizResultById()
    
}