public class StringFun
{
    public static void main (String [] args)
    {
        String s = args[0];
        String otherString = args[1];
        String subString = args[2];

        // Assume input of first argument "s" is at least 2 words/phrases long
        // Assume input of second argument "otherString" is NOT any part of "s"
        // Assume input of third argument "subString" IS part of string "s" and appears twice in "s"

        // Example run
        // javac StringFun.java
        // java StringFun "    I like Pizza Pizza    " "Nachos" "Pizza"

        // First argument has leading and trailing spaces, which will be trimmed and contains Third Argument twice, so there is two indices where it exists


        // TEST 2

        System.out.println();

        System.out.println("Length of s: " + s.length());
        System.out.println("Does s equal otherString: " + s.equals(otherString));

        // Prints substring of s from index 0 to half of s' length to ensure ending index is not beyond the bounds of s' length
        System.out.println("Substring of s from 0 to half of s' length: " + s.substring(0,s.length()/2));

        // Replaces all uses of subString with otherString
        System.out.println(s.replaceAll(subString, otherString));

        // converts all characters in the String s to lower case
        System.out.println(s.toLowerCase());

        // Trims s
        s = s.trim();
        System.out.println("Trim s: " + s);

        System.out.println("Index of subString in s: " + s.indexOf(subString));
        System.out.println("Last Index of subString in s: " + s.lastIndexOf(subString));

        // I use the indexOf the first character of the second word to ensure a space " " is not printed, assuming there are not two or more consecutive spaces
        System.out.println("charAt indexOf first character of second word: " + s.charAt(s.indexOf(" ") + 1));


        System.out.println();

    }


}
