A multiple-choice examination consists of 20 questions. Each question has five choices, 
labeled A, B, C, D, and E. The first line of data contains the correct answers to the 
20 questions in the first 20 consecutive character positions. Here’s an example:
BECDCBAADEBACBAEDDBE

Each subsequent line contains the answers for a candidate. Data on a line consists of a 
candidate number (an integer), followed by one or more spaces, followed by the 20 answers 
given by the candidate in the next 20 consecutive character positions. An X is used if 
a candidate did not answer a particular question. You may assume all data is valid and 
stored in a file called exam.dat. A sample line is as follows:
  4325   BECDCBAXDEBACCAEDXBE

There are at most 100 candidates. A line containing a “candidate number” 0 indicates only
the end of the data. Points for a question are awarded as follows: correct answer: 4 points; 
wrong answer: -1 point; no answer: 0 points.

Write a program to process the data and print a report consisting of candidate number and 
the total points obtained by the candidate, in ascending order by candidate number. 
(This question is in Chapter 1 as well, but this time you’ll solve it using objects).