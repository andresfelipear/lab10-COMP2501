/**
 * AudioFile of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class AudioFile extends MusicMedia
{
    private final String typeFile;

    private static final String VALID_TYPE_FILE = "mp3";
    private static final String VALID_TYPE_FILE_2 = "m4a";
    private static final String VALID_TYPE_FILE_3 = "wav";
    public AudioFile(final String artist,
                     final String songTitle,
                     final int totalSongs,
                     final int totalRuntime,
                     final int year,
                     final String typeFile)
    {
        super(artist, songTitle, totalSongs, totalRuntime, year);

        if(!isValidTypeFile(typeFile))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid type of file. It should be %s %s or %s",
                                  VALID_TYPE_FILE, VALID_TYPE_FILE_2, VALID_TYPE_FILE_3));
        }
        this.typeFile = typeFile;
    }

    private boolean isValidTypeFile(final String typeFile)
    {
        return typeFile.equalsIgnoreCase(VALID_TYPE_FILE) || typeFile.equalsIgnoreCase(VALID_TYPE_FILE_2) ||
                typeFile.equalsIgnoreCase(VALID_TYPE_FILE_3);
    }

    @Override
    public String toString()
    {
        return "AudioFile [fileType=" + typeFile + ", " + super.toString() + "]";
    }

    @Override
    public void playSelection()
    {
        super.playSelection();
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getArtist() + ".\n" +
                                   "This file is in" + typeFile + "format, from " + getYear() + ".");
    }
}
