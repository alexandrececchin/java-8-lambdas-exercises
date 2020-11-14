package com.insightfullogic.java8.examples.chapter4;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MusicalCarriageTest {

    @Test
    public void rocksLikeACarriage() {
        assertEquals("... from side to side", new MusicalCarriage().rock());
    }

}
