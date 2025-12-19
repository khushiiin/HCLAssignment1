package Assignment1;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        System.out.println("Length of the string: " + s1.length());
        System.out.println("String is empty: " + s1.isEmpty());

        System.out.print("Enter the index: ");
        int a = sc.nextInt();
        if (a >= 0 && a < s1.length()) {
            System.out.println("Character at index: " + s1.charAt(a));
        } else {
            System.out.println("Invalid index");
        }

        sc.nextLine();

        System.out.println("To string: " + s1.toString());
        System.out.println("s1 and s2 are equal: " + s1.equals(s2));
        System.out.println("Compare To: " + s1.compareTo(s2));
        System.out.println("s1 contains 'man': " + s1.contains("man"));

        System.out.print("Enter character for indexOf: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Index of character: " + s1.indexOf(c1));

        System.out.print("Enter character for lastIndexOf: ");
        char c2 = sc.next().charAt(0);
        System.out.println("Last index of character: " + s1.lastIndexOf(c2));

        sc.nextLine();

        System.out.print("Enter starting string: ");
        String start = sc.nextLine();
        System.out.println("Starts with: " + s1.startsWith(start));

        System.out.print("Enter ending string: ");
        String end = sc.nextLine();
        System.out.println("Ends with: " + s1.endsWith(end));

        System.out.println("String matches alphabets only: " + s1.matches("[A-Za-z ]+"));

        System.out.println("Substring (2,5): " + s1.substring(2, 5));
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Trimmed: " + s1.trim());

        System.out.print("Enter word to replace: ");
        String original = sc.nextLine();

        System.out.print("Enter replacement word: ");
        String replaceWith = sc.nextLine();

        System.out.println("After replace: " + s1.replace(original, replaceWith));

        String[] words = s2.split(" ");
        System.out.println("Split:");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("Join: " + String.join("-", words));

        int num = 100;
        System.out.println("Value Of: " + String.valueOf(num));

        sc.close();
    }
}
