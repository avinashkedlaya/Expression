package expression;

public class FloatType extends AtomicType {
	

	

	private static FloatType getInstance=new FloatType();
	private FloatType()
	{
		
	}
	public static String getType() {
		return FLOAT;
	}
	public static FloatType getInstance() {
		
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
