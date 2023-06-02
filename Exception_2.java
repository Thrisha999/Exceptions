class Age
{
    void age(int a)
    {
        if(a<18)
            throw new ArithmeticException("Not eligible");
        else
           System.out.println("eligible for voting");
    }
}
public class Exception_2
{
     public static void main(String[] args)
     {
        Age a1 = new Age();
        a1.age(19);
     }
}
