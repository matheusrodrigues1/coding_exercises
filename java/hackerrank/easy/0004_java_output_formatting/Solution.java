import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++){
            String s = scan.next();
            int i2 = scan.nextInt();
            System.out.printf("%-15s", s);
            System.out.printf("%03d\n", i2);
        }
        
        System.out.println("================================");
    }
}