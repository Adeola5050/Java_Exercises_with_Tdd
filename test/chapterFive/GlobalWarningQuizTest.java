package chapterFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlobalWarningQuizTest {

    GlobalWarningQuiz globalWarningQuiz;

    @BeforeEach
    void setUp() {

        globalWarningQuiz = new GlobalWarningQuiz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatGlobalWarningQuizExist() {
        assertNotNull(globalWarningQuiz);
    }

    @Test
    void testThatGlobalWarningQuizCanBeCreated() {
        globalWarningQuiz.setUser();
        globalWarningQuiz.setQuiz();
        assertSame("", globalWarningQuiz.getUser());
        assertSame("", globalWarningQuiz.getQuiz());
    }

    @Test
    void testThatQuestionCanBeCreated() {
        globalWarningQuiz.setUser();
        globalWarningQuiz.setQuiz();
        String question = globalWarningQuiz.createQuestion();
        assertSame("", globalWarningQuiz.getUser());
        assertSame("", globalWarningQuiz.getQuiz());
        assertSame("", question);
    }

    @Test
    void testThatQuestionAnsweredByUserCanBeRecorded() {
        globalWarningQuiz.setUser();
        globalWarningQuiz.setQuiz();
        globalWarningQuiz.setNoOfQuiz(5);
        int answer = globalWarningQuiz.calculateNoQuestionAnswered();
//        assertEquals(5,globalWarningQuiz.getUser());
        assertEquals(5,globalWarningQuiz.getNoOfQuiz());
       assertEquals(5,answer);
    }
}