/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task6;

/**
 *
 * @author Aleksey
 */
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
    System.setOut(new PrintStream(System.out, true, "utf-8"));
    String symbols = "אבגדהוזחטיךכלםמןנסעףפץצקרשתûü‎‏ÿ0123456789";
    Random random=new Random();
    StringBuffer sb=new StringBuffer();
    int flag = -1;
    for(int i=0;i<10;i++){
       int number=random.nextInt(42);
       if (number != flag){
       sb.append(symbols.charAt(number));
       }
       else {
           number=random.nextInt(42);
           sb.append(symbols.charAt(number));
       }
       flag = number;
     }
    System.out.println(sb);
    
    }  
}
