package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;

public class Question2 {

    public static int countBandMembersInternal(List<Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getMembers().count())
                .reduce(0L, Long::sum)
                .intValue();
//        int totalMembers = (int) artists.stream() .flatMap(Artist::getMembers).count();
    }
}
