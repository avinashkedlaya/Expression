package expression;


import program.IProgram;
import visitors.IExprVisitor;

public class ConcreteFloatConstant  extends Expression implements IArithmeticExpression {

	private final float mValue;
	private IExpression output;
	public ConcreteFloatConstant(float value, IProgram program,IExpression output) throws Exception {
		super(program, Type.FLOAT);
		this.mValue = value;
		this.output= output;
	}
	public ConcreteFloatConstant(float value, IProgram program) throws Exception {
		super(program, Type.FLOAT);
		this.mValue = value;

	}

	public float getValue() {
		return this.mValue;
	}
	
	@Override
	public String toString() {
		Float i = new Float(this.mValue);
		return this.output+"="+i.toString();
	}

	@Override
	public void accept(IExprVisitor<?> visitor) {
	}
}
