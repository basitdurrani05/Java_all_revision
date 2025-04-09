// Inheritance


// 1). Single Inheritance
// 2). Multilevel Inheritance
// 3). Hierarchical Inheritance
// 4). Multiple Inheritance (Not Supported in Java)  Possible - Interface
// 5). Hybrid Inheritance


// 1). Single Inheritance


class parents{

    void show(){
        System.out.println("I am Your Parents");
    }

}


public class fifth_oops extends parents{


    void show2(){
        System.out.println("I am Your New Born bay");
    }

    public static void main(String[] args) {


        fifth_oops obj = new fifth_oops();
        obj.show();
        obj.show2();


        
    }
    
}
