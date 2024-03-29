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

    /**
     * Constructs a new AudioFile object with the specified parameters.
     *
     * @param artist      The artist of the audio file.
     * @param songTitle   The title of the song in the audio file.
     * @param totalSongs  The total number of songs in the audio file.
     * @param totalRuntime The total runtime of the audio file in minutes.
     * @param year        The year when the audio file was released.
     * @param typeFile    The type of file (e.g., mp3, m4a, wav).
     * @throws IllegalArgumentException if any of the parameters are invalid.
     */
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

    /**
     * Checks if the given type of file is valid for an audio file.
     *
     * @param typeFile The type of file to check.
     * @return true if the type of file is valid, false otherwise.
     */
    private boolean isValidTypeFile(final String typeFile)
    {
        return typeFile.equalsIgnoreCase(VALID_TYPE_FILE) || typeFile.equalsIgnoreCase(VALID_TYPE_FILE_2) ||
                typeFile.equalsIgnoreCase(VALID_TYPE_FILE_3);
    }

    /**
     * Returns a string representation of the AudioFile object, including file type information.
     *
     * @return A string representation of the AudioFile object.
     */
    @Override
    public String toString()
    {
        return "AudioFile [fileType=" + typeFile + ", " + super.toString() + "]";
    }

    /**
     * Displays a message indicating the selection of the audio file and additional information.
     */
    @Override
    public void playSelection()
    {
        super.playSelection();
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getArtist() + ".\n" +
                                   "This file is in" + typeFile + "format, from " + getYear() + ".");
    }
}
