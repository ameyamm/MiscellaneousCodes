public class LinkedList<T>
{
    private static class Node 
    {
        private T data ; 
        private Node next ; 

        private Node(T data) 
        {
            this.data = data ;
            this.next = null ; 
        }

        private Node(T data, Node next)
        {
            this.data = data ; 
            this.next = next ; 
        }

        private T getData()
        {
            return this.data;
        }
    }

    private Node head ; 
    private Node tail ; 

    public LinkedList()
    {
        head = null ; 
        tail = null ; 
    }

    public void add(T data)
    {
        if (head == null)
        {
            head = new Node(data);
            tail = head ; 
            return ; 
        }
        tail.next = new Node(data);
        tail = tail.next ; 
    }

    public void reverse()
    {
        reverse(this.head) ; 
    }

    private void reverse(Node node)
    {

    }

}
