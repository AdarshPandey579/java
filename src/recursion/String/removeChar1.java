package recursion.String;

public class removeChar1 {

    static void remove(String a,char c,int i){
        if(i==a.length()){
            return ;
        }
        if(a.charAt(i)!=c){
            System.out.println(a.charAt(i));
        }
        remove(a,c,i+1);
    }

    public static void main(String[] args) {
        String a="adarsh";
        char c='a';
        remove(a,c,0);
    }
}
