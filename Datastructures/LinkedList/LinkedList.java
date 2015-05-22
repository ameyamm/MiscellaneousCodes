public class LinkedList<T>
{
    private static class Node<T> 
    {
        private T data ; 
        private Node<T> next ; 

        private Node(T data) 
        {
            this.data = data ;
            this.next = null ; 
        }

        private Node(T data, Node<T> next)
        {
            this.data = data ; 
            this.next = next ; 
        }

        private T getData()
        {
            return this.data;
        }
    }

    private Node<T> head ; 
    private Node<T> tail ; 

    public LinkedList()
    {
        head = null ; 
        tail = null ; 
    }

    public void add(T data)
    {
        if (head == null)
        {
            head = new Node<T>(data);
            tail = head ; 
            return ; 
        }
        tail.next = new Node<T>(data);
        tail = tail.next ; 
    }

    public void reverse()
    {
        if (this.head == null)
            return ; 
        this.tail = this.head ; 
        reverse(this.head) ; 
    }

    /**
     * Reverse recursive
     */
    private void reverse(Node<T> node)
    {
        if (node.next == null)
        {
            this.head = node;
            return ; 
        }
        
        reverse(node.next);
        node.next.next = node ; 
        node.next = null ; 
    }

    public void print()
    {
        Node<T> temp = this.head ; 
        while(temp != null)
        {
            System.out.print(temp.data);
            System.out.print(" ");
            temp = temp.next ; 
        }
        System.out.println();
    }
}
