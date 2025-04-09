// Getter and Setter In Java
// Encapsulation


public class second_oops {

    private String fname; // private variable
    private String lname; // private variable
    private int age; // private variable

    public void setname(String a){

        fname=a;    // Private + Public = public

    }

    public String getname(){

        return fname; // Private + Public = public
    }

    public void setlname(String b){

        lname=b;    // Private + Public = public

    }

    public String getlname(){

        return lname; // Private + Public = public
    }

    public void setage(int c){

        age=c;    // Private + Public = public

    }

    public int getage(){

        return age; // Private + Public = public
    }

    





    public static void main(String[] args) {


        second_oops obj = new second_oops();

        obj.setname("Daivik");

        obj.setlname("Jain");

        obj.setage(21);

        System.out.println(obj.getname());
        System.out.println(obj.getlname());
        System.out.println(obj.getage());
        
    }
    
}
