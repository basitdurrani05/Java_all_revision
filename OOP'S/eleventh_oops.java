// 2). Run Time  or Method Overriding



class world{

    void rajveer(){

        System.out.println("Rajveer : Software Engineer");
    }
}

public class eleventh_oops extends world {



    @Override
    void rajveer(){

       
        System.out.println("Rajveer : Halwa Wala");
    }
   


    public static void main(String[] args) {


      world obj = new world();

        obj.rajveer();

        
    }
    
}
