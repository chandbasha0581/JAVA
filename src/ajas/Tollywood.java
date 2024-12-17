package ajas;

public class Tollywood {

    public String ch = "Ram charan";
    private String str = "Kajal";
    String st = "Raja mouli";
    protected String stri = "anirudh";

    void chand() {
        System.out.println(ch);
        System.out.println(str);
       System.out.println(st);
       System.out.println(stri);
    }

    public static void main(String[] args) {
        Tollywood a = new Tollywood();
        a.chand();
    }
}
class Bollywood extends Tollywood{
        public static void main(String[] args)
        {
            Bollywood a1 =new Bollywood();

            a1.chand();
        }

//        System.out.println(a1.ch);
//        //System.out.println(a.str);
//        System.out.println(a1.st);
//        System.out.println(a1.stri);
}

