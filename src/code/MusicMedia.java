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

    private static final int MIN_SONG_TITLE_LENGTH = 2;
    private static final int MAX_SONG_TITLE_LENGTH = 305;

    /**
     * Constructs a new MusicMedia object with the specified parameters.
     *
     * @param artist      The artist of the music media.
     * @param songTitle   The title of the song.
     * @param totalSongs  The total number of songs in the media.
     * @param totalRuntime The total runtime of the media in minutes.
     * @param year        The year when the media was released.
     * @throws IllegalArgumentException if any of the parameters are invalid.
     */
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

    /**
     * Checks if a song title is valid based on its length.
     *
     * @param songTitle The song title to validate.
     * @return true if the song title is valid, false otherwise.
     */
    public static boolean isValidSongTitle(final String songTitle)
    {
        return songTitle != null && songTitle.length() > MIN_SONG_TITLE_LENGTH && songTitle.length() <= MAX_SONG_TITLE_LENGTH;
    }

    /**
     * Gets the artist of the music media.
     *
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Gets the title of the song.
     *
     * @return The song title.
     */
    public String getSongTitle()
    {
        return songTitle;
    }

    /**
     * Gets the total number of songs in the media.
     *
     * @return The total number of songs.
     */
    public int getTotalSongs()
    {
        return totalSongs;
    }

    /**
     * Gets the total runtime of the media in minutes.
     *
     * @return The total runtime in minutes.
     */
    public int getTotalRuntime()
    {
        return totalRuntime;
    }

    /**
     * Gets the year when the media was released.
     *
     * @return The release year.
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Displays a message indicating the selection of music media.
     */
    public void playSelection()
    {
        System.out.println("Thank you for using our Music Library.");
    }

    /**
     * Returns a string representation of the music media object in the format:
     * "Album [Artist=<artist>, title=<songTitle>, trackCount=<totalSongs>, totalMinutes=<totalRuntime>]"
     *
     * @return A string representation of the music media.
     */
    @Override
    public String toString() {
        return "Album [Artist=" + artist + ", title=" + songTitle + ", trackCount=" + totalSongs + ", totalMinutes=" + totalRuntime + "]";
    }
}
