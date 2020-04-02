package DZ2v;

import java.util.*;
import java.lang.*;
import java.io.*;

public class glavnaKlasa {

    
    public static void main(String[] args) {
       Scanner unos = new Scanner(System.in);
        System.out.println("Unesite string:\n");
       String s = unos.nextLine();
       
       VesnaSicovic v = new VesnaSicovic(s);
       v.okreni();
       
    }
    
