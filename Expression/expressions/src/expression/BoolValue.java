package expression;

public class BoolValue extends AtomicValue{

	Boolean value;
	
	BoolValue(Boolean v)
	{
		this.value=new Boolean(v);
	}
	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return BooleanType.getInstance();
	}

}
