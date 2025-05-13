package recursion.String;

public class subSet {
    static void SubSet(String s1, String s2){
        if(s2.isEmpty()){
            System.out.println(s1);
            return;
        }
//        SubSet(s1+s2.charAt(0),s2.substring(1));
        SubSet(s1,s2.substring(1));
        SubSet(s1+s2.charAt(0),s2.substring(1));

    }

    public static void main(String[] args) {
        String set="abc";
        SubSet("",set);
    }
}
