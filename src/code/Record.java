/**
 * Record of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class Record extends MusicMedia
{
    private final int sizeInches;
    private final double rpm;

    private static final int VALID_SIZE = 7;
    private static final int VALID_SIZE_2 = 10;
    private static final int VALID_SIZE_3 = 12;

    private static final double VALID_RPM = 33.30;
    private static final double VALID_RPM_2 = 45.00;
    private static final double VALID_RPM_3 = 78.00;

    /**
     * Constructs a new Record object with the specified parameters.
     *
     * @param artist      The artist of the record.
     * @param songTitle   The title of the song on the record.
     * @param totalSongs  The total number of songs on the record.
     * @param totalRuntime The total runtime of the record in minutes.
     * @param year        The year when the record was released.
     * @param sizeInches  The size of the record in inches.
     * @param rpm         The revolutions per minute (rpm) of the record.
     * @throws IllegalArgumentException if any of the parameters are invalid.
     */
    public Record(final String artist,
                  final String songTitle,
                  final int totalSongs,
                  final int totalRuntime,
                  final int year,
                  final int sizeInches,
                  final double rpm)
    {
        super(artist, songTitle, totalSongs, totalRuntime, year);

        if(!isValidSize(sizeInches))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid record size. It should be %d %d or %d",
                                  VALID_SIZE, VALID_SIZE_2, VALID_SIZE_3));
        }

        if(!isValidRpm(rpm))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid record rpm. It should be %.2f %.2f or %.2f",
                                  VALID_RPM, VALID_RPM_2, VALID_RPM_3));
        }
        this.sizeInches = sizeInches;
        this.rpm = rpm;
    }

    /**
     * Checks if the given rpm value is valid for a record.
     *
     * @param rpm The rpm value to check.
     * @return true if the rpm is valid, false otherwise.
     */
    private boolean isValidRpm(final double rpm)
    {
        return rpm == VALID_RPM || rpm == VALID_RPM_2 || rpm == VALID_RPM_3;
    }

    /**
     * Checks if the given size in inches is valid for a record.
     *
     * @param sizeInches The size in inches to check.
     * @return true if the size is valid, false otherwise.
     */
    private boolean isValidSize(final int sizeInches)
    {
        return sizeInches == VALID_SIZE || sizeInches == VALID_SIZE_2 ||
                sizeInches == VALID_SIZE_3;
    }

    /**
     * Returns a string representation of the Record object, including size and rpm information.
     *
     * @return A string representation of the Record object.
     */
    @Override
    public String toString()
    {
        return "Record [size=" + sizeInches + ", rpm=" + rpm + ", " + super.toString() + "]";
    }

    /**
     * Displays a message indicating the selection of the record and additional information.
     */
    @Override
    public void playSelection()
    {
        super.playSelection();
        System.out.println("You selected the record " + getSongTitle() + " by " + getArtist() + ".\n" +
                        "This is a " + sizeInches + " inch record from " + getYear() + ", playing at " + rpm + " rpm.");
    }
}
