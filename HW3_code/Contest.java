/**
 * Write a description of class Contest here.
 * 
 * @author (최유정)
 * @version (2023.04.14.)
 */
import java.util.ArrayList;

public class Contest
{
    private ArrayList<Singer> singers;
    /**
     * Constructor for objects of class Contest
     */
    public Contest()
    {
       singers = new ArrayList<Singer>();
    }
    
    public void addSinger(Singer singer){
        singers.add(singer);
    }
    
    public int getSize(){
        return singers.size();
    }
    
    public void list(){
        for(Singer singer : singers){
            System.out.println(singer.getDetails());
        }
    }
    
    public void voteFor(String name){
        boolean found = false;
        for(Singer singer : singers){
            if(singer.getName().equals(name)){
                singer.increaseVotes(1);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No matching singer found.");
        }
    }
    
    public void shortlist(int minimumVotes){
        for(int i = singers.size() - 1; i >= 0; i--){
            Singer singer = singers.get(i);
            if(singer.getVotes() < minimumVotes){
                singers.remove(i);
            }
        }
    }
}
