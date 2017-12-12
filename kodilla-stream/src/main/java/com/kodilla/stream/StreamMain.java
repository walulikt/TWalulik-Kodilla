package com.kodilla.stream;



import com.kodilla.stream.com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main (String [] args){
        PoemBeautifier poemBeautifier=new PoemBeautifier();

        poemBeautifier.beautify1( "Alfabet",text -> "ABC"+text+"ABC");
        poemBeautifier.beautify2( "litle text",text -> text.toUpperCase());
        poemBeautifier.beautify3( "Good day",text -> text.substring(0,4));
        poemBeautifier.beautify4( "Piasek do maty",text -> text.replace('a','e'));
    }
}

