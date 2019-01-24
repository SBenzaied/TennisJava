package fr.lp.iem.tennis;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TennisMatchTest {

    Player p1;
    Player p2;
    TennisMatch tennisMatch;
    MatchType matchType=MatchType.BEST_OF_FIVE;

 @Before
    public void beforeTennisMatchTest() {
        p1 = new Player("Soso");
        p2 = new Player("Germain");

        tennisMatch = new TennisMatch(p1, p2,matchType,false);
    }


    @Test
    public void loveShouldBeDescriptionForScore0() {
        TennisMatch tennisMatch = new TennisMatch(p1,p2,matchType,false);
        assertThat(tennisMatch, hasProperty("score", is("0, 0")));
    }
}