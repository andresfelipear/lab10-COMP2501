/**
 * CompactDisc of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class CompactDisc extends MusicMedia
{
    private final boolean bonusTrack;
    private final boolean digipac;

    /**
     * Constructs a new CompactDisc object with the specified parameters.
     *
     * @param artist      The artist of the compact disc.
     * @param songTitle   The title of the song in the compact disc.
     * @param totalSongs  The total number of songs in the compact disc.
     * @param totalRuntime The total runtime of the compact disc in minutes.
     * @param year        The year when the compact disc was released.
     * @param bonusTrack  Indicates if the compact disc has bonus tracks.
     * @param digipac     Indicates if the compact disc is in digipac packaging.
     */
    public CompactDisc(final String artist,
                       final String songTitle,
                       final int totalSongs,
                       final int totalRuntime,
                       final int year,
                       final boolean bonusTrack,
                       final boolean digipac)
    {
        super(artist, songTitle, totalSongs, totalRuntime, year);
        this.bonusTrack = bonusTrack;
        this.digipac = digipac;
    }

    /**
     * Returns a string representation of the CompactDisc object, including bonus track and packaging information.
     *
     * @return A string representation of the CompactDisc object.
     */
    @Override
    public String toString()
    {
        return "CompactDisc [bonusTrack=" + bonusTrack + ", digipac=" + digipac + ", " + super.toString() + "]";
    }

    /**
     * Displays a message indicating the selection of the compact disc and additional information.
     */
    @Override
    public void playSelection()
    {
        super.playSelection();
        System.out.println("You selected the CD " + getSongTitle() + " by " + getArtist() + ".\n" +
                                   "This is a Compact Disc from the year " + getYear() + ".");
    }
}
