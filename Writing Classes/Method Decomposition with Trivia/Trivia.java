public class Trivia
{
    //Stores all questions and answers in String format.
    private String q1 = "What country hosted the 2016 Summer Olympics?";
    private String a1 = "Brazil";
    private String q2 ="Which NBA team plays its home games at Madison Square Gardens?";
    private String a2 = "The Knicks";
    private String q3 = "Ankara is the capital of which country?";
    private String a3 = "Turkey";
    private String q4 ="In nautical folklore, which ship is condemned to sail the seas for all eternity?";
    private String a4 = "The Flying Dutchman";
    private String q5 ="Which car manufacturer's name means \"to hear\"?";
    private String a5 = "Audi";
    
    //This stores which question has been asked. When checkResponse is called
    //this makes sure the answer is being compared to the correct question
    private int questionNumber;
    
    /**
     * returns a random question from the question bank.
     * Preconditions: Trivia object must be initialized. 
     * Postconditions: String q is returned.
     * 
     * @return q - String q that has a trivia question.
     */
    public String getQuestion()
    {        
        questionNumber = (int)(Math.random()*5)+1;
        if(questionNumber == 1)
        {
            return q1;
        }
        else if(questionNumber == 2)
        {
            return q2;        
        }
        else if(questionNumber == 3)
        {
            return q3;
        }
        else if(questionNumber == 4)
        {
            return q4;
        }
        else
        {
            return q5;
        }
    }
    
    /**
     * returns a boolean that checks if user response is the same as the answer
     *  to the trivia question.
     * Precondition: checkResponse must be passed a String object.
     * Postcondition: returns a boolean based on user input
     * 
     * @param response - String from user with response to trivia question
     * @return boolean - evaluates if user response matches trivia answer
     */
    public boolean checkResponse(String response)
    {
        if(questionNumber == 1)
        {
            return response.equals(a1);
        }
        else if(questionNumber == 2)
        {
            return response.equals(a2);
        }
        else if(questionNumber == 3)
        {
            return response.equals(a3);
        }
        else if(questionNumber == 4)
        {
            return response.equals(a4);
        }
        else
        {
            return response.equals(a5);
        }
    }
}