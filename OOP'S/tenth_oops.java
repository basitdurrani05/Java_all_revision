// Polymorphism in Java

// 1). Compile Time / Dynamic Dispatch
// 2). Run Time


// 1). Compile Time  / Dynamic Dispatch


public class tenth_oops {


    void himanshu(String a){

        System.out.println("Himanshu : "+a);

    }


    void himanshu(String a, String b){

        System.out.println("Himanshu : "+a+" "+b);

    }




    public static void main(String[] args) {

        tenth_oops obj = new tenth_oops();

        obj.himanshu("Software Engineer");

        obj.himanshu("Friend","Student");
        
    }
    
}
