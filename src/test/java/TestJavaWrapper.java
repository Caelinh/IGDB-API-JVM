import org.junit.jupiter.api.Test;
import proto.Game;
import proto.Search;

import java.util.List;

class TestJavaWrapper {
    private IGDBWrapper wrapper = IGDBWrapper.INSTANCE;

    TestJavaWrapper() {
        wrapper.setUserkey(System.getenv("key"));
    }

    /*
    * The proto tests should cover the rest of the endpoints
    * */

    @Test
    void testGetProtoGames() throws RequestException {
        List<Game> result = ProtoRequestKt.games(wrapper, new APICalypse());
        assert(!result.isEmpty());
    }

    @Test
    void testGetJsonGames() throws RequestException {
        String result = JsonRequestKt.jsonGames(wrapper, new APICalypse());
        assert(!result.isEmpty());
    }

    /*
    * Real-world test cases
    * */

    // TODO uncomment when api bug is fixed *API3-176*
//    //Get all Coming Soon PS4 games
//    @Test
//    void testComingSoonPS4Games() {
//        String date = String.valueOf((System.currentTimeMillis() / 1000));
//        APICalypse query = new APICalypse()
//                .fields("*")
//                .where("platforms = 48 & release_dates.date > " + date)
//                .sort("release_dates.date", SortOrder.ASCENDING);
//
//        try {
//            List<Game> ps4Games = ProtoRequestKt.games(wrapper, query);
//            assert(!ps4Games.isEmpty());
//        } catch (RequestException e) {
//            assert(false);
//        }
//    }
//
//    //Get all Recently released PS4 games
//    @Test
//    void testRecentlyReleasedPS4Games() {
//        String date = String.valueOf((System.currentTimeMillis() / 1000));
//        APICalypse query = new APICalypse()
//                .fields("*")
//                .where("platforms = 48 & release_dates.date < " + date)
//                .sort("release_dates.date", SortOrder.DESCENDING);
//
//        try {
//            List<Game> ps4Games = ProtoRequestKt.games(wrapper, query);
//            assert(!ps4Games.isEmpty());
//        } catch (RequestException e) {
//            assert(false);
//        }
//    }

    //Get all Recently released PS4 games
    @Test
    void testSearch() {
        APICalypse query = new APICalypse()
                .search("Assassins Creed")
                .fields("game.name,game.involved_companies")
                .where("game != null & game.version_parent = null");

        try {
            List<Search> result = ProtoRequestKt.search(wrapper, query);
            assert(!result.isEmpty());
        } catch (RequestException e) {
            assert(false);
        }
    }

    //Get all Recently released PS4 games
    @Test
    void testPS4Exclusives() {
        APICalypse query = new APICalypse()
                .fields("name,category,platforms")
                .where("category = 0 & platforms = 48");

        try {
            List<Game> result = ProtoRequestKt.games(wrapper, query);
            assert(!result.isEmpty());
        } catch (RequestException e) {
            assert(false);
        }
    }

}
