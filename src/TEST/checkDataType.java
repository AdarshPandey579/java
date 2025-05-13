package TEST;

public class checkDataType {
    public static void main(String[] args) {
        Integer a = 10;
        Float b = 30.5f;
        Long c = 456679L;
        Double d = 456.897;
        String e = "adarsh";
        Character f = 'a';
        Boolean g = true;

        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
        System.out.println(d.getClass().getName());
        System.out.println(e.getClass().getName());
        System.out.println(f.getClass().getName());
        System.out.println(g.getClass().getName());
        System.out.println();
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
        System.out.println(c.getClass().getSimpleName());
        System.out.println(d.getClass().getSimpleName());
        System.out.println(e.getClass().getSimpleName());
        System.out.println(f.getClass().getSimpleName());
        System.out.println(g.getClass().getSimpleName());
        System.out.println();

        var A = 10;
        var B = 3045768574L;
        var C = 456F;
        var D = 45679.89;
        var E = "adarsh";
        var F = 'a';
        var G = true;
        System.out.println(((Object) A).getClass().getName());
        System.out.println(((Object) B).getClass().getName());
        System.out.println(((Object) C).getClass().getName());
        System.out.println(((Object) D).getClass().getName());
        System.out.println(((Object) E).getClass().getName());
        System.out.println(((Object) F).getClass().getName());
        System.out.println(((Object) G).getClass().getName());
        System.out.println();
        System.out.println(((Object) A).getClass().getSimpleName());
        System.out.println(((Object) B).getClass().getSimpleName());
        System.out.println(((Object) C).getClass().getSimpleName());
        System.out.println(((Object) D).getClass().getSimpleName());
        System.out.println(((Object) E).getClass().getSimpleName());
        System.out.println(((Object) F).getClass().getSimpleName());
        System.out.println(((Object) G).getClass().getSimpleName());


    }
}
