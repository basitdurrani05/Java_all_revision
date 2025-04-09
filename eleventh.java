public class eleventh {


    // VarArgs

    static void first(int ...a){

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {

        first(12,13,14,15,156,145,46,457,46,78856,856,7);


        
    }
    
}
