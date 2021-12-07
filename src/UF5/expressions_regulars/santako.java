package UF5.expressions_regulars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class santako {
    public static void main(String[] args) {
        String linia = "";
        int cPPN = 0;
        int cR = 0;
        int cF = 0;

        Pattern pat1 = Pattern.compile("\\*<]:-DOo");
        Pattern pat2 = Pattern.compile(">:o\\)");
        Pattern pat3 = Pattern.compile("<]:-D");
        Matcher mat1, mat2,mat3;

        try {
            BufferedReader br = new BufferedReader(new FileReader("santako.txt"));
            while ((linia = br.readLine()) != null) {
                mat1 = pat1.matcher(linia);
                mat2 = pat2.matcher(linia);
                mat3 = pat3.matcher(linia);
                while (mat1.find()){
                    cPPN++;
                }
                while (mat2.find()){
                    cR++;
                }
                while (mat3.find()){
                    cF++;
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
