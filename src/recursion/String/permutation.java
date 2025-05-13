package recursion.String;

public class permutation {
//    static int k=0;
    static void Permutation(String s1,String s2){
        if(s2.isEmpty()){
            System.out.println(s1);
//            k++;
            return;
        }
        for(int i=0;i<=s1.length();i++){
            Permutation(s1.substring(0,i)+s2.charAt(0)+s1.substring(i),s2.substring(1));
        }
    }

    public static void main(String[] args) {
        String s="abc";
        Permutation("",s);
//        System.out.println(k);
    }
}
