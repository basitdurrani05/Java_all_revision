public class ninth {


    // Method Overloading


    static void basit(){

        System.out.println("Basit - Home - Son - Brother");
    }

    static void basit(String a){

        System.out.println("Basit"+a);
    }

    static void basit(String a, String b){

        System.out.println("Basit"+a+" "+b);
    }


    public static void main(String[] args) {


        basit();
        basit("Software Engineer");
        basit("Friend","Student");
        
    }
    
}
