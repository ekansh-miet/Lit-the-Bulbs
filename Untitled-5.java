import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] c=new int[10];
        for(int i=0;i<s.length();i++){
         c[s.charAt(i)-'0']++;
        }
        int m=Arrays.stream(c).max().getAsInt();
        if(m==4)
        System.out.println("-1");
        else if(m==3)
        System.out.println("6");
        else
        System.out.println("4");
    }
}