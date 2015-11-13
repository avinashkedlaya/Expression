package expression;

import java.util.ArrayList;
import java.util.List;

import program.IProgram;
import visitors.IExprVisitor;

public class Func_call extends Expression implements IFunctionCallExpression{

	private IExpression fName;	
	private List<Expression> arg_list;
	private IExpression output;
	public Func_call(IProgram program, IExpression name, List<Expression> args_list,IExpression output, String type) throws Exception {
		super(program, type);
		fName=name;
		arg_list=new ArrayList<Expression>();
		this.arg_list.addAll(args_list);
		System.out.println("test"+arg_list.toString());
		this.output = output;
	}
	
	
	@Override
	public void accept(IExprVisitor<?> visitor) throws Exception {
		visitor.visit(this);
		
	}

	@Override
	public String toString() {
		
		return this.output+"="+ this.fName.toString() + "( " + this.arg_list.toString().replace("[", "").replace("]", "") + " )";
		
	}


	public List<Expression> getArg_list() {
		return arg_list;
	}

	public void setArg_list(List<Expression> arg_list) {
		this.arg_list = arg_list;
	}




	public IExpression getfName() {
		return fName;
	}




	public void setfName(IExpression fName) {
		this.fName = fName;
	}

}