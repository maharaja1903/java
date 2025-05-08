import java.util.*;
class Node{
    int data;
    Node next;
    // Node prev;
    Node(int data){
        this.data=data;
        next=null;
        // prev=null;
    }
}
class loop{
    Node head=null,tail=null;
    void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
            // tail.prev=head;
        }

    }
    void dis(){
        Node temp=head;
       do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        } while(temp!=head);

    }
}
public class circular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        loop lp=new loop();
        while(true){
            int v=sc.nextInt();
            if(v==-1)break;
            lp.insert(v);
        }
        
        lp.tail.next=lp.head;
        lp.dis();

    }
    
}
