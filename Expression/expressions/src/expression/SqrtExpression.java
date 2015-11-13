package expression;

import program.IProgram;
import visitors.IExprVisitor;

public class SqrtExpression extends Expression implements IBinaryExpression, IArithmeticExpression {

	private IExpression mLHS;
	private Integer gain;
	private IExpression output;
	


	public SqrtExpression(IProgram program, IExpression lhs,IExpression output) throws Exception {
		super(program, lhs.getType());
	
		this.mLHS = lhs;
		
		this.output = output;
	}

	@Override
	public IExpression getLHS() {
		return this.mLHS;
	}


	@Override
	public String toString() {
		
		return this.output+"="+"sqrt(" + this.mLHS.toString()+")";
		
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


	
}
