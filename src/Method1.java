import java.util.*;



class Method1 {
    int jurseyno;
    String playername;
    String battingstyle;
    static void method(){
        Scanner read = new Scanner(System.in);
        System.out.println("this is for calling method ");
        int n= read.nextInt();

    }
    void  method1(){
        Scanner read = new Scanner(System.in);
        System.out.println("this is for calling by object ");
        int n1= read.nextInt();
        //return n;
    }
    Method1(int n,String str){
        jurseyno = n;
        playername = str;
    }
    Method1(String str,int n){
        jurseyno = n;
        playername = str;
    }
    Method1(int n){
        jurseyno = n;
        //playername = str;
    }
    Method1(String str,int n,String str1){
        jurseyno = n;
        playername = str;
        battingstyle =str1;
    }
    void display(){
        System.out.println(playername+" "+jurseyno+" "+battingstyle);
    }
    public static void main(String[] args) {
        method();
        Method1 a=new Method1(18,"virat");
        a.display();  // here we are printing the display method by calling it using the object
        Method1 a1=new Method1(18,"virat");
        a1.display();
        Method1 a2=new Method1(18,"virat");
        a2.display();
        Method1 a3=new Method1("virat",18,"righthand");
        a3.display();
    }
}

