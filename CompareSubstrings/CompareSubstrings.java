import java.util.*;
public class CompareSubstrings {

    public static String getSmallestAndLArgest(String s, int k){
        if (s == null) {
            throw new IllegalArgumentException("A string não pode ser nula");
        }
        
        if (k <= 0) {
            throw new IllegalArgumentException("K deve ser maior que 0");
        }

        if (s.length() < k) {
            throw new IllegalArgumentException("Tamanho de K deve ser < ou = ao da String");
        }
        
        String smallest = "";
        String largest = "";

        int idx = 0;
        smallest = largest = s.substring(idx, idx + k);
        while(idx + k < s.length()){
            idx++;
            if(smallest.compareTo(s.substring(idx,idx + k)) > 0)
                smallest = s.substring(idx, idx + k);
            else if(largest.compareTo(s.substring(idx,idx + k)) < 0)
                largest = s.substring(idx, idx + k);
        }

        return smallest + "\n" + largest;
    }
    public static void main(String args[]){
        if (sc.hasNext()) {
            String str = sc.next();
            int size = sc.nextInt();
            try {
                System.out.println(getSmallestAndLArgest(str, size));
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        sc.close();
    }
}
