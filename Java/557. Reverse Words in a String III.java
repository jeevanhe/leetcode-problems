//557. Reverse Words in a String III
// Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
// Example 1:
// Input: "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Note: In the string, each word is separated by single space and there will not be any extra space in the string.

//Resource: https://leetcode.com/problems/reverse-string-ii/#/description
//Editorial Solution https://leetcode.com/articles/reverse-words-in-a-string/


public class Solution {
    public String reverseWords(String s) {

        if(s == null)
            return null;
        //Split sentence into words
        String [] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0; i<words.length; i++){
            //Reverse each word and append to string builder
            str.append(reverseString(words[i]));
            str.append(" ");
        }
        return str.toString().trim();

    }
    //Xor method to reverse a string
    public String reverseString(String st){
        int front = 0;
        int back = st.length()-1;
        char [] arr = st.toCharArray();
        while(front < back) {
            arr[front] = (char)(arr[front] ^ arr[back]);
            arr[back]  = (char)(arr[front] ^ arr[back]);
            arr[front] = (char)(arr[back] ^ arr[front]);
            front++;
            back--;
        }
       return String.valueOf(arr);
    }
}

//Runtime: 12 ms
//1. Can make use of StringBuilder reverse method to solve.
