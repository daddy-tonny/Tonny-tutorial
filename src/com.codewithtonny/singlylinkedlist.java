

public class singlylinkedlist {

//instnt variable head to hold us the link list
    private listNode head ;
    private static class listNode{

        private int data;
        private listNode  next ;
        public  ListNode(int data){
            this.data=data;
            this .next =null;
        }
    }
    public void display(){
     ListNode current=head;
     while (current!=null) {
        System.out.println(current.data + "--->");
        current=current.next;

        
     }

System.out.print("null");


    }

    
    public static void main(String[] args) {
    SinglyLinkedList sll =new SinglyLinkedList();
    sll.head=new listNode(20);
    ListNode Second= new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fouth = new ListNode(22);
    //connenecting togther the chian
    sll.head.next =second;//20>>>2
    second.next=third;//20>>2>>3
    third.next=fouth;//20>>2>>3>>22----nul


        
        
    }
}
