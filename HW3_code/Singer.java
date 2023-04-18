/**
 * Details of a singer for an international singing contest.
 * 
 * @author Gustavo Ruiz 
 * @version 2020.10.07
 */
public class Singer
{
    // The name of the singer and nationality.
    private String name, nationality;
    // The number of votes he/she has.
    private int votes;

    /**
     * Constructor for objects of class Singer.
     * @param name The singer's name.
     * @param nationality The singers's nationality.
     */
    public Singer(String name, String nationality)
    {
        this.name = name;
        this.nationality = nationality;
        votes = 0;
    }

    /**
     * Return the singers's name.
     * @return the name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Return the nationality.
     * @return the nationality.
     */
    public String getNationality()
    {
        return nationality;
    }
    
    /**
     * Return the number of votes.
     * @return the number of votes.
     */
    public int getVotes()
    {
        return votes;
    }
    
    /**
     * Increase the votes by the given amount.
     * @amount Number of votes. Must be greater than zero.
     */
    public void increaseVotes(int amount)
    {
        if(amount > 0) {
            votes += amount;
        }
    }
    
    /**
     * Return details of the singer, their nationality and
     * the number of votes.
     * @return details of the singer.
     */
    public String getDetails()
    {
        StringBuilder details = new StringBuilder();
        details.append(name);
        details.append(" is ");
        details.append(nationality);
        details.append(" and has ");
        details.append(votes);
        if(votes == 1) {
            details.append(" vote.");
        }
        else {
            details.append(" votes.");
        }
        return details.toString();
    }
}
