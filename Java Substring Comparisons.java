import java.util.Scanner;

public class Main {
 
    public static String getSmallestAndLargest(String s, int k) {
       
       String smallest = s.substring(0, k);
       String largest = s.substring(0, k);
       String str, result;
       
        for(int i = 0; i <= s.length() - k; i++) {
            
            str = s.substring(i, k + i);
            if(str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if(str.compareTo(largest) > 0) {
                largest = str;
            }   
        }
        result = smallest + "\n" + largest;
        return result;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
