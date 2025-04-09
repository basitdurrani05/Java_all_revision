// 4). Hybrid Inheritance


class dada1{

    void show(){
        System.out.println("Dada1");



    }
}



class parents1 extends dada1{

    void show2(){
        System.out.println("Parents1");
    }


}

class me1 extends parents1{

    void show3(){
        System.out.println("Me - Basit");
    }


}


class dada2 extends me1{
    void show4(){
        System.out.println("Dada2");
    }
}


class parents2 extends dada2{
    void show5(){
        System.out.println("Parents2");
    }
}

public class eighth_oops extends parents2 {

    void show6(){
        System.out.println("Me - Baby");
    }


    public static void main(String[] args) {


        eighth_oops obj = new eighth_oops();
        obj.show();
        obj.show2();
        obj.show3();
        obj.show4();
        obj.show5();
        obj.show6();


        
    }



    
}
