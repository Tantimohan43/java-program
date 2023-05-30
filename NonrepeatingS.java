import java.util.*;
class NonrepeatingS
{
    public static void main(String args[])
    {
        Queue<Character> s=new LinkedList<>();
        char str[]={'a','b','c'};
        int j=0;
        for(int i=0;i<str.length;i++)
        {
            if(!s.contains(str[i]))
            {
                
            s.add(str[i]);
            // System.out.println("apla");
            }
            else 
            {
                while(!s.remove(j)=='str[i]')
                {
                    j++;
                }  
            }
        }
        System.out.println(s);
    }
}