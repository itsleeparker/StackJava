package  org.example;

public class Stack<T>{
    private Nodes current;
    private Nodes start;
    private Nodes node;

    Stack(){
        this.start = null;
    }

    public void push(T data){
        this.node = new Nodes<T>(data);
        if(this.start == null){
            this.start = this.node;
            this.current = this.start;
        }else{
            this.node.next = this.current;
            this.current = this.node;
        }
    }

    public T Pop(){
        if(this.start == null){
            System.out.println("Nothing to Pop Out !!");
            return null;
        }
        this.node = this.current;
        this.current = this.current.next;
        return (T) this.node.getNode();
    }

    public int  getLength(){
        if(this.start == null)
            return 0;

        int count = 0;
        Nodes temp = this.current;
        do{
            temp = temp.next;
            count++;
        }while(temp != null);
        return count;
    }
}