import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        //sc.next();
        if(t>=1 && t<=10){
            for(int i=1;i<=t;i++){
                String s=sc.next();
                String e="";
                String o="";
            
                for(int j=0;j<s.length();j++){
                    if(j%2==0){
                        e=e+s.charAt(j);
                    }else{
                        o=o+s.charAt(j);
                    }
                }
                System.out.println(e+" "+o);
            }
        }
        
        
        
    }
}
