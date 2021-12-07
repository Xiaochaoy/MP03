package UF5.expressions_regulars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class santakoString {
    public static void main(String[] args) {
        String linia = "";
        int cPPN = 0;
        int cR = 0;
        int cF = 0;
        String pat1 = "*<]:-DOo";
        String pat2 = ">:o)";
        String pat3 = "<]:-D";

        try {
            BufferedReader br = new BufferedReader(new FileReader("santako.txt"));
            while ((linia = br.readLine()) != null) {
                for (int i = 0, j = 8; j <= linia.length() ; i++,j++) {
                    if (linia.substring(i,j).equals(pat1)){
                        cPPN++;
                    }
                }
                for (int o = 0, k = 4; k <= linia.length() ; o++,k++) {
                    if (linia.substring(o,k).equals(pat2)){
                        cR++;
                    }
                }
                for (int u = 0, l =5; l <= linia.length() ; u++,l++) {
                    if (linia.substring(u,l).equals(pat3)){
                        cF++;
                    }
                }
                if (cPPN != 0){
                    cF -= cPPN;
                    System.out.print("Pare Noel (" + cPPN + ") ");
                    cPPN = 0;
                }
                if (cR != 0){
                    System.out.print("Rens (" + cR + ") ");
                    cR = 0;
                }
                if (cF != 0){
                    System.out.print("Follets (" + cF + ") ");
                    cF = 0;
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
