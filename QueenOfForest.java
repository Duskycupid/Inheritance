package Practice;

public class QueenOfForest  extends KingOfForest {
	//overriding 
	public void lion()
	{
		System.out.println ("Iam the Queen of the forest");

	}
 public  void wife ()
{
	System.out.println ("Iam wife of lion ");

}
}
class Maint
{
	public static void main (String [] args)
	{
    QueenOfForest q = new QueenOfForest ();
    q.lion();
    q.wife();
	}
}
