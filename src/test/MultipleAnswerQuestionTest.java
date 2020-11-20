package test;
import main.MultipleAnswerQuestion;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class MultipleAnswerQuestionTest {
    ArrayList<String> correctAnswers = new ArrayList<>() {
        {
            add("A");
            add("b");
            add("4");
        };
    };

    MultipleAnswerQuestion question = new MultipleAnswerQuestion("","MULTIPLEANSWERQUESTION", correctAnswers );

    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    @Test
    public void correctAnswers(){
        ArrayList<String> userAnswers = new ArrayList<>() {
            {
                add("A");
                add("B");
                add("4");
            };
        };

        question.setUserAnswers(userAnswers);
        boolean result = question.CheckAnswers();
        assertTrue(question.CheckAnswers());
    }

}
