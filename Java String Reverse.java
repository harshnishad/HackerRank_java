import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        StringBuffer buffer = new StringBuffer(A);
        buffer.reverse();
        String rev = buffer.toString();
        
        if(rev.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        } 
    }
}



