package quizmarker;

import java.io.IOException;

public class TestQuixMarker {
	public static void main(String[] args) throws IOException {
		QuizMarker qm = new QuizMarker();
		qm.readQuizData();
		qm.markQuiz();
		qm.sortQuizResultById();
	}
}
