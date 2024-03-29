/**
 * MusicMedia of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class MusicMedia
{
    private final String artist;
    private final String songTitle;
    private int totalSongs;
    private int totalRuntime;
    private final int year;

    private static final int MIN_SONG_LENGTH = 2;
    private static final int MAX_SONG_LENGTH = 305;
    public MusicMedia(final String artist,
                      final String songTitle,
                      final int totalSongs,
                      final int totalRuntime,
                      final int year)
    {
        if(artist == null || artist.isEmpty())
        {
            throw new IllegalArgumentException("Invalid artist");
        }

        if(!isValidSongTitle(songTitle))
        {
            throw new IllegalArgumentException("Invalid song title");
        }

        if(totalSongs < 0)
        {
            throw new IllegalArgumentException("Invalid total songs, this should be a positive value.");
        }

        if(totalRuntime < 0)
        {
            throw new IllegalArgumentException("Invalid runtime, it should be positive.");
        }

        if(year < 0)
        {
            throw new IllegalArgumentException("Invalid year");
        }

        this.artist = artist;
        this.songTitle = songTitle;
        this.totalSongs = totalSongs;
        this.totalRuntime = totalRuntime;
        this.year = year;
    }

    private boolean isValidSongTitle(final String songTitle)
    {
        return songTitle != null && songTitle.length() > MIN_SONG_LENGTH && songTitle.length() <= MAX_SONG_LENGTH;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getSongTitle()
    {
        return songTitle;
    }

    public int getTotalSongs()
    {
        return totalSongs;
    }

    public int getTotalRuntime()
    {
        return totalRuntime;
    }

    public int getYear()
    {
        return year;
    }

    public void playSelection()
    {
        System.out.println("Thank you for using our Music Library.");
    }

    @Override
    public String toString() {
        return "Album [Artist=" + artist + ", title=" + songTitle + ", trackCount=" + totalSongs + ", totalMinutes=" + totalRuntime + "]";
    }
}
