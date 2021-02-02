package practice;

class Demo{
    public void Check() throws NullPointerException{
            throw new NullPointerException("Hmmm!");
    }
}

public class ThrowAndThrows {
    public static void main(String[] args) {
        Demo d = new Demo();
//        d.Check();    ///Okay if the function not throwing an exception.
        try{
            d.Check();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}