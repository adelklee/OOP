import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * List files that contain substring in filename
     */
    public void listSelectedFiles(String search){
        for(String filename : files){
            if(filename.contains(search)){
                System.out.println(filename);
            }
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
    
    public void findFiles(String searchString){
        for(String filename : files){
            if(filename.contains(searchString)){
                System.out.println(filename);
            }
        }
    }
    
    /**
     * List all files from the collection (using Iterator)
     */
    public void listAllFileIterator(){
        // create iterator
        //Iterator<String> it = files.iterator();
    }
    
    /**
     * List all file names in the organizer.
     */
    public void listAllFiles(){
        int i = 0;
        while(i < files.size()){
            String filename = files.get(i);
            System.out.println(filename);
            i++;
        }
    }
    
    /**
     * Search for a filename match iin the collection.
     * If a match is found, return index where the match ocurred.
     * Otherwise, return -1.
     * @param search - filename we are searching for
     */
    public int searchMatch(String search){
        int i = 0;
        boolean found = false;
        while(i < files.size() && !found){
            String filename = files.get(i);
            // if there is a match
            if(filename.equals(search)){
                // search is successful
                found = true;
            }
            else{
                // updating index var
                i++;
            }
        }
        // if the search failed
        if(!found){
            i = -1;
        }
        return i;
    }
}
