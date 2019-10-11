import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int l=0;l<t;l++){
            int n = s.nextInt();
             int i,j,k;
        System.out.println("Case #"+(l+1)+":");
            for(i=1;i<=n;i++)
     {
        
        for(j=i;j<n;j++)
         {
             System.out.print(" ");
            
         }
         for(j=1;j<=i;j++)
         {
            
             System.out.print("*");
         }
        
        System.out.println("");
     } 
    }

}
}