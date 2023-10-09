package _05_Accessmodifier_static.baitap;

public class xaydunglopchi {
    private String name="john";
    private String classes="C02";
    public xaydunglopchi(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public static void main(String[] args) {
        xaydunglopchi student1 = new xaydunglopchi();
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
        student1.setName("Dao Nguyen Trieu Phung");
        student1.setClasses("A0623I1");
       System.out.println(student1.getName());
      System.out.println(student1.getClasses());
    }
}
