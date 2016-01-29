import java.util.Scanner;
/* This class supports a fill in the blank question where the answer is specified in the questions
 * text delimited by '_'. This class extracts the answer from the question's text and stores
 * thhe text and answer accordingly
 */

public class FillInQuestion extends Question
{
     
    
    /* Extracts the answer from the specified question text. For example" The inentor of Java was James Gosling
     * text: The inventor of Java was _____
     * answer: " James Gosling"
     * 
     */
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question+= " _______" + parser.next();
        
        super.setText(question);
        this.setAnswer(answer);
    }
}
