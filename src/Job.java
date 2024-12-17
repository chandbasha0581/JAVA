public class Job {
    String str;
    static {
        System.out.print("Instagram");
    }
    static {
        System.out.print(" Whatsapp");
    }
    static {
        System.out.println(" Snapchat");
    }
    Job(){
        str="Job";
    }

    {
        System.out.print("IBM Company");
    }
    {
        System.out.println(" Accenture");
    }

    public static void main(String[] args) {
        Job obj=new Job();
        System.out.println(obj.str);
    }
}
