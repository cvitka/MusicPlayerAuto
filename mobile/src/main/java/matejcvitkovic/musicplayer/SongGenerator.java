package matejcvitkovic.musicplayer;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Gost on 29.7.2016..
 */
public class SongGenerator {
    public static List<Song> generateSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add( new Song( "onakoodokagibboni",
                "Onako od oka",
                "Gibonni",
                "Familija,familija",
                "Pop",
                "http://chicagodesavanja.us/wp-content/uploads/2015/05/Gibonni1.jpg",
                "http://chicagodesavanja.us/wp-content/uploads/2015/05/Gibonni1.jpg" ) );
        songs.add( new Song( "dusabecarskaslavonskelole",
                "Duša Bećarska",
                "Slavonske lole",
                "Mix",
                "Tamburasi",
                "http://cbadanjak.com/wp-content/uploads/2011/02/Slavonske-Lole-2011.jpg",
                "http://cbadanjak.com/wp-content/uploads/2011/02/Slavonske-Lole-2011.jpg" ) );

        songs.add( new Song( "svejelakokadsimladprljavokazaliste",
                "Sve je lako kad si mlad",
                "Prljavo kazalište",
                "Sve je lako kad si mlad",
                "Rock",
                "https://i.ytimg.com/vi/d742WEXXxOA/hqdefault.jpg",
                "https://i.ytimg.com/vi/d742WEXXxOA/hqdefault.jpg" ) );

        return songs;
    }
}
