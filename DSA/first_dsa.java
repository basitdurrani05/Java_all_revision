// Asymtomatic Notation

// 1). Big O Notation - Most Of the cases
// 2). Big Omega Notation
// 3). Big Theta Notation



// Time Complexity

import java.util.Scanner;

public class first_dsa {

    public static void main(String[] args) {


        // Time Complexity - Execution time in a Program

        
        // for(int i=1; i<=5; i++){       Time Complexity O(1)
        //     System.out.println(i);
        // }



        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number : ");
        // int a = sc.nextInt();

        // for(int i=1; i<=a; i++){       // Time Complexity O(n)
        //     System.out.println(i);
        // }


        // Space Complexity - Memory usuage time in a Program.


        // for(int i=1; i<=5; i++){  Space Complexity - Low
        //     System.out.println(i);
        // }


        // Scanner sc = new Scanner(System.in);     Space Complexity - High 
        // System.out.println("Enter Number : ");
        // int a = sc.nextInt();


        // for(int i=1; i<=a; i++){
        //     System.out.println(i);
        // }



        String a = "Singing";  // Jawan



        String b = new String("Singing");  // 1 object  // Old
       


        if(a.equals(b)){

            System.out.println("Equal");
        }

        else{
            System.out.println("Not Equal");
        }




    }
}