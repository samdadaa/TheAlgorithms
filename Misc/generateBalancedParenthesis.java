package Misc;

import java.util.*;
class ParenthesisString{
    String str;
    int openCount, closedCount; // Open & Closed Parenthesis count respectively

    public ParenthesisString(String str, int openCount, int closedCount)
    {
        this.str  =str;
        this.openCount = openCount;
        this.closedCount = closedCount;
    }
}

public class generateBalancedParenthesis {
    // Follows a BFS-based approach to generate all combinations of balanced paranthesis with 'A' number of pairs
    // Time complexity : O(4^n/sqrt(n)) Refer this : https://en.wikipedia.org/wiki/Central_binomial_coefficient
    // Space complexity : O(n*2^n)
    public static List<String> generateParenthesis(int A)
    {
        List<String> res=new ArrayList<>();
        Queue<ParenthesisString> queue=new ArrayDeque<>();
        queue.add(new ParenthesisString("", 0, 0));
        while(!queue.isEmpty())
        {
            ParenthesisString ps = queue.poll();
            // Add to the result if the max open & closed parenthesis count is reached
            if(ps.openCount == A && ps.closedCount == A)
                res.add(ps.str);
            else
            {
                if(ps.openCount < A) // Add if we can add an open parenthesis
                    queue.add(new ParenthesisString(ps.str + "(", ps.openCount+1, ps.closedCount));

                if(ps.openCount > ps.closedCount) // Add if we can add a closed parenthesis
                    queue.add(new ParenthesisString(ps.str + ")", ps.openCount, ps.closedCount+1));
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        // Testcases
        System.out.println(generateParenthesis(4));
        System.out.println(generateParenthesis(8));
    }
}