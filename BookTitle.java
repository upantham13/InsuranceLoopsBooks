import java.lang.StringBuffer;
/**
 * Finds the first and last letters of strings with and without numbers or symbols.
 *
 * @author Umasathvik Pantham
 * @version 03/20/2021
 */
public class BookTitle
{
    // instance variables
    private String title;

    /**
     * Constructor for objects of class BookTitle
     * 
     * @param bookTitle the title of the book
     */
    public BookTitle(String bookTitle)
    {
        title = bookTitle;
    }

    /**
     * Returns a string consisting of the first character
     * of every word in the title
     * 
     * @return firstLetters() the first letter of each word in the string
     */
    public String firstLetters()
    {
        String s = "";
        for (int index = 0; index < title.length(); index ++)
            {
                if (index == 0)
                {
                    s = s.concat(String.valueOf(title.charAt(index)));
                }
                else if (String.valueOf(title.charAt(index)).equals(" ")) 
                {
                    s = s.concat(String.valueOf(title.charAt(index + 1)));
                }
            }
        return s;
    }
    
    /**
     * Returns a string consisting of the last letter
     * of every word in the title
     * 
     * @return lastLetters() the last letter of each word in the string
     */
    public String lastLetters()
    {
        String s = "";
        for (int index = title.length() - 1; index >= 0; index --)
            {
                if (index == title.length() - 1)
                {
                    if (Character.isAlphabetic(title.charAt(index)))
                    {
                        s = s.concat(String.valueOf(title.charAt(index)));
                    }
                    else if (!Character.isAlphabetic(title.charAt(index)))
                    {
                        s = s.concat(String.valueOf(title.charAt(index - 1)));
                    }
                }
                else if (String.valueOf(title.charAt(index)).equals(" "))
                {
                    if (Character.isAlphabetic(title.charAt(index - 1)))
                    {
                        s = s.concat(String.valueOf(title.charAt(index - 1)));
                    }
                    
                    else if (!Character.isAlphabetic(title.charAt(index - 1)))
                    {
                        s = s.concat(String.valueOf(title.charAt(index - 2)));
                    }
                }
            }
        return new StringBuilder(s).reverse().toString();
    }
}
