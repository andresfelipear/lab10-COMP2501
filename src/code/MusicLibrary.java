import java.util.ArrayList;

/**
 * MusicLibrary of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class MusicLibrary
{
    private final ArrayList<MusicMedia> library;

    public MusicLibrary()
    {
        library = new ArrayList<>();
    }


    /**
     * add a subtype to the ArrayList musicMedias, first checking to be sure the parameter
     * is not null.
     * @param media this will be add to the list.
     */
    public void addMedia(MusicMedia media)
    {
        if(media != null)
        {
            library.add(media);
        }
    }

    /**
     * This iterates over the list displaying the entire library using the toString() method.
     */
    public void displayLibrary()
    {
        for(MusicMedia media : library)
        {
            System.out.println(media);
        }
    }

    public void playTitle(String title)
    {
        for(MusicMedia media : library)
        {
            if(media.getSongTitle().equalsIgnoreCase(title))
            {
                media.playSelection();
            }
        }
    }


}
