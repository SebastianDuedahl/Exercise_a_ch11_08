package Chapter_11_a_08;

/*
Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest
string in the list. If your method is passed an empty set, it should return 0.
 */

import java.util.*;

public class Exercise_08
{
    public static void main(String[] args)
    {

        Set<String> set1 = new HashSet<String>();

        set1.add("Hvor er du");
        set1.add("Hvad så");
        set1.add("Hvad skal du");
        set1.add("uhadada");
        set1.add("Hej");
        set1.add("Jamen");

        System.out.println(minLength(set1));


    }
    public static int minLength(Set<String> set)
    {
        if(set.isEmpty())
        {
            return 0;
        }
        int shortest = 100;

        for(String s : set)
        {
            if (s.length()< shortest)
            {
                shortest = s.length();
            }
        }
        return shortest;

    }


}
