package expression;

import program.IProgram;
import visitors.IExprVisitor;

public class GainExpression extends Expression implements IBinaryExpression, IArithmeticExpression {

	private IExpression mLHS;
	private Integer gain;
	private IExpression output;
	


	public GainExpression(IProgram program, IExpression lhs,int gain,IExpression output) throws Exception {
		super(program, lhs.getType());
	
		this.mLHS = lhs;
		this.gain=gain;
		this.output = output;
	}

	@Override
	public IExpression getLHS() {
		return this.mLHS;
	}


	@Override
	public String toString() {
		
		return this.output+"="+"(" + this.mLHS.toString() + " * " + this.gain.toString() + ")";
		
	}

	@Override
	public void accept(IExprVisitor<?> visitor) {
		try {
			
			visitor.visit(this.mLHS);
		} catch (Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public IExpression getRHS() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getGain() {
		return gain;
	}

	public void setGain(int gain) {
		this.gain = gain;
	}
}
