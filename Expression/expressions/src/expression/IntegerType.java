package expression;

public class IntegerType extends AtomicType {
	

	private static IntegerType getInstance=new IntegerType();
	private IntegerType()
	{
	}
	public static String getType() {
		return INT;
	}
	public static IntegerType getInstance() {
		
		return getInstance;
	}
	
	public boolean typecheck(IValue v){
		if(getInstance==v.getType())
		{
			return true;
	}
		return false;
	}
	

}
