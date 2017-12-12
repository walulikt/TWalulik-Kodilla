package com.kodilla.stream.com.kodilla.stream.beautifier;


public class PoemBeautifier {

    public  String beautify1 (String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
       System.out.println (result);
       return result;
    }
  public  String beautify2 (String text, PoemDecorator poemDecorator ){
        String result = poemDecorator.decorate(text);
      System.out.println (result);
        return result;
    }
    public  String beautify3 (String text, PoemDecorator poemDecorator ){
        String result = poemDecorator.decorate(text);
        System.out.println (result);
        return result;
    }
    public  String beautify4 (String text, PoemDecorator poemDecorator ){
        String result = poemDecorator.decorate(text);
        System.out.println (result);
        return result;
    }
}
