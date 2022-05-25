import java.util.*;
class StrVowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s; 
        char ch;
        int vow = 0, cons = 0, i;
        System.out.print("Enter the String: ");
        s = sc.next();
        System.out.print(s.toLowerCase());
        for(i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vow++;
            }
            else
            {
                cons++;
            }
        }
        System.out.print("Number of vowels in the string are "+vow+" and the number of consonants are "+cons);
    }
}