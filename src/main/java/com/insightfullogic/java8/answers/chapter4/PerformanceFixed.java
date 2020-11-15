package com.insightfullogic.java8.answers.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.stream.Stream;

/** A Performance by some musicians - eg an Album or Gig. */
public interface PerformanceFixed {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(artist -> Stream.concat(Stream.of(artist), artist.getMembers()));
    }

}
