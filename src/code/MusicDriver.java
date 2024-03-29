/**
 * MusicDriver of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class MusicDriver
{
    public static void main(final String[] args)
    {
        final MusicMedia record1;
        final MusicMedia audioFile1;
        final MusicMedia compactDisc1;
        final MusicLibrary library;

        record1 = new Record("The Beatles", "Hey Jude", 1, 7, 1968, 7, 45);
        audioFile1 = new AudioFile("Donnie Iris and the Cruisers", "Ah Leah!", 1, 4, 1980, "wav");
        compactDisc1 = new CompactDisc("Neil Young & Crazy Horse", "Everybody Knows This Is Nowhere", 4, 40, 1969, false, false);

        library = new MusicLibrary();

        library.addMedia(record1);
        library.addMedia(audioFile1);
        library.addMedia(compactDisc1);

        library.displayLibrary();

        library.playTitle("Hey Jude");
    }



}
