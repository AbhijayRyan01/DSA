import java.util.*;

public class Anargam_BF{
    public static String SortString(String str){
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static boolean checkAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        String Sstr1 = SortString(str1);
        String Sstr2 = SortString(str2);
        for(int i=0; i<str1.length(); i++){
            if(Sstr1.charAt(i)!= Sstr2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String Str1 = "AHONA";
        String Str2 = "ABHIJAY";
        System.out.println(checkAnagrams(Str1, Str2));
    }
}