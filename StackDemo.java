interface StackSize
{
   int  StackSizeHai = 5;
}
class StackOverflownException extends RuntimeException
{
    StackOverflownException(String msg)
    {
        super(msg);
    }
}
class StackUnderflownException extends RuntimeException
{
    StackUnderflownException(String msg)
    {
        super(msg);
    }
}
class StackOg 
{
    private int items[] = new int[StackSize.StackSizeHai];
    private int top;
    StackOg()
    {
        this.top = -1;
    }

    private boolean IsFull()
    {
        return top==StackSize.StackSizeHai - 1;
    }
    private boolean IsEmpty()
    {
        return top==-1;
    }

    void push(int element) throws StackOverflownException
    {
        if(IsFull())
            throw new StackOverflownException("Stack ka size khatam hogaya");
        this.items[++this.top] =  element;
        
    }
    int  pop() throws StackUnderflownException
    {
        if(IsEmpty())
            throw new StackUnderflownException("Stack meh kuch nahi hai");
        return this.items[this.top--];
    }
    int  peek() throws StackUnderflownException
    {
        if(IsEmpty())
            throw new StackUnderflownException("Stack meh kuch nahi hai");
        return this.items[this.top];
    }

    void show() throws StackUnderflownException
    {
        if(IsEmpty())
            throw new StackUnderflownException("Stack meh kuch nahi hai");
        System.out.println("Stack :");
        for(int i = this.top; i>=0; i--)
            System.out.println(this.items[i]+ " ");
        
    } 

}
class StackDemo 
{
    public static void main(String args[]) 
	{
        StackOg stack = new StackOg();
        try
        {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(400);
            stack.push(50);
            stack.show();
            System.out.println(stack.peek());
            // stack.push(50);
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            // stack.pop();
            // stack.show();
        }
        catch(StackOverflownException e )
        {
            System.out.println(e);
        }
        catch(StackUnderflownException e )
        {
            System.out.println(e);
        }
    
    }
}

