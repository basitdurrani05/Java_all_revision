// 2). Multiple Inheritance (Interface)


interface A{

    void firstparent();  // Initialize
}


interface B{

    void secondparent(); // Initialize
}




public class ninth_oops implements A,B{





    public void firstparent(){

        System.out.println("1st Parent");
    }

    public void secondparent(){

        System.out.println("2nd Parent");
    }

    public void child(){

        System.out.println("Son");
    }


    public static void main(String[] args) {

        ninth_oops obj = new ninth_oops();

        obj.firstparent();
        obj.secondparent();
        obj.child();
        
    }
    
}
