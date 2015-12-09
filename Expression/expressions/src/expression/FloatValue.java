package expression;

public class FloatValue extends AtomicValue{

	Float value;

	FloatValue(	Float v)
	{
		this.value=new 	Float(v);
	}


	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return FloatType.getInstance();
	}

}
