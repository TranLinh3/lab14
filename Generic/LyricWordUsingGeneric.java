package Generic;

import java.util.*;

public class LyricWordUsingGeneric {
    private static final Word[] lyric = {
            new Word("you",1), new Word("say",2), new Word("it",3),
            new Word("best",4),new Word("when",5),new Word("you",6),
            new Word("say",7), new Word("nothing",8), new Word("at",9),
            new Word("all",10)};
    public static void main(String[] args) {
      
        List<Word> lyric = new ArrayList<Word>();
  
        for (Word w : lyric)
            lyric.add(w);
        for (Word w : lyric) {
            System.out.print(w.getValue() + ", "+ w.getPosition());
        }
    }
}
class Pair<T>
{
    public Pair() { first = null; second = null; }
    public Pair(T first, T second) { this.first = first;  this.second = second; }

    public T getFirst() { return first; }
    public T getSecond() { return second; }

    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }

    private T first;
    private T second;
}

class ArrayAlg
{
    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<String>(min, max);
    }
}


