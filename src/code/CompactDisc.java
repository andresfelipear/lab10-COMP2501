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

    @Override
    public String toString()
    {
        return "CompactDisc [bonusTrack=" + bonusTrack + ", digipac=" + digipac + ", " + super.toString() + "]";
    }

    @Override
    public void playSelection()
    {
        super.playSelection();
        System.out.println("You selected the CD " + getSongTitle() + " by " + getArtist() + ".\n" +
                                   "This is a Compact Disc from the year " + getYear() + ".");
    }
}
