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

    private boolean isValidRpm(final double rpm)
    {
        return rpm == VALID_RPM || rpm == VALID_RPM_2 || rpm == VALID_RPM_3;
    }

    private boolean isValidSize(final int sizeInches)
    {
        return sizeInches == VALID_SIZE || sizeInches == VALID_SIZE_2 ||
                sizeInches == VALID_SIZE_3;
    }

    @Override
    public String toString()
    {
        return "Record [size=" + sizeInches + ", rpm=" + rpm + ", " + super.toString() + "]";
    }

    @Override
    public void playSection()
    {
        super.playSection();
        System.out.println("You selected the record " + getSongTitle() + " by " + getArtist() + ".\n" +
                        "This is a " + sizeInches + " inch record from " + getYear() + ", playing at " + rpm + " rpm.");
    }
}
