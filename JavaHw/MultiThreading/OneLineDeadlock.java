class OneLineDeadlock 
{
    public static void main(String args[]) 
	{
        try
        {
            Thread.currentThread().join();        
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
