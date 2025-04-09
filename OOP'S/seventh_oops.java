// 3). Hierarchical Inheritance


class parents{

    void show(){

        System.out.println("Parents");
    }
}


class sister extends parents{

    

    void show2(){
        System.out.println("Daughter");
    }


}



public class seventh_oops extends sister{

    

    void show3(){
        System.out.println("Son");
    }


    public static void main(String[] args) {


        seventh_oops obj = new seventh_oops();
        obj.show();
        obj.show2();
        obj.show3();

        
    }
    
}
