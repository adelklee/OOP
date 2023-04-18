
/**
 * 여기에 CarPark 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class CarPark
{
    private int capacity;
    private int occupancy;
    private String location;
    public CarPark(int capacity, String location){
        this.capacity = capacity;
        this.occupancy = 0;
        this.location = location;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getOccupancy(){
        return occupancy;
    }
    
    public String getLocation(){
        return location;
    }
    
    public void park(){
        if(occupancy < capacity){
            occupancy++;
        }
        else{
            System.out.println("The car park is full.");
        }
    }
    
    public void leave(){
        if(occupancy > 0){
            occupancy--;
        }
        else{
            System.out.println("The car park is empty.");
        }
    }
    
    public void changeCapacity(int amount){
        if (capacity + amount < occupancy) {
            System.out.println("Cannot reduce capacity below occupancy.");
        } else if (capacity + amount < 0) {
            capacity = 0;
            System.out.println("The car park is now closed.");
        } else {
            capacity += amount;
        }
    }
    
    public void printDetails(){
        int difference = capacity - occupancy;
        System.out.println(location + " car park has " + difference + (difference == 1 ? " space." : " spaces."));
    }
}
