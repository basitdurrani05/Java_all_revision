// 2). Multilevel Inheritance


class dada{

    void show(){

        System.out.println("Dadaji");
    }
}

class parents extends dada{

    


    void show2(){

        System.out.println("Parents");
    }
}


public class sixth_oops extends parents {    // sixth oops is me - ex daivik

    void show3(){

        System.out.println("Me - Daivik");
    }


    public static void main(String[] args) {

        sixth_oops obj = new sixth_oops();
        obj.show();
        obj.show2();
        obj.show3();
        
    }
    
}
