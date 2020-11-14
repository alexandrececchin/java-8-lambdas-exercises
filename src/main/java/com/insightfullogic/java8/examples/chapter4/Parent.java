package com.insightfullogic.java8.examples.chapter4;

// BEGIN body
public interface Parent {

    void message(String body);

    default void welcome() {
        message("Parent: Hi!");
    }

    String getLastMessage();

}
// END body
