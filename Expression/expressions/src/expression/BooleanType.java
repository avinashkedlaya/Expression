package expression;

public class BooleanType extends AtomicType {
	

	private static BooleanType getInstance=new BooleanType();
	private BooleanType()
	{
		
	}
	public static String getType() {
		return BOOLEAN;
	}
	public static BooleanType getInstance() {
		
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
