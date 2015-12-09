package expression;

public class IntValue extends AtomicValue{

	Integer value;
	
	IntValue(Integer v)
	{
		this.value=new Integer(v);
	}
	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return IntegerType.getInstance();
	}

}
