// Queue


// It is also a linear data Structure.

// It Fllows FIFO (FIRST IN FIRST OUT)

// Types.

// 1). Enqueue
// 2).Circular
// 3).Priority


// Empty - Underflow (-1)  EK dam empty hai
// Fill - Overflow


// Push - Offer
// Pop - Poll



import java.util.*;

public class eighth_dsa {


    public static void main(String[] args) {


        // Queue<Integer> a = new LinkedList<>();

        Queue<Integer> a = new PriorityQueue<>();
        
        a.offer(12);

        a.offer(13);
        a.offer(14);

        a.offer(15);
        

        
     

        System.out.println(a.poll());

        System.out.println(a.poll());

        
        

    }
    
}
