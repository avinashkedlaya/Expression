package expression;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Type{

	protected static final String BOOLEAN = "boolean";
	protected static final String INT = "int";
	protected static final String FLOAT = "float";
	protected static final String COMPOSITE = "struct";
	private static Type mType = new Type();
	private static Map<String, Type> mTypes = new HashMap<String, Type>();
	static{
		mTypes.put("INT", IntegerType.getInstance());
		mTypes.put("FLOAT", FloatType.getInstance());
		mTypes.put("BOOLEAN", BooleanType.getInstance());
	}
	protected Type() {

	}

	public static void addType(String typeName, Type newType) {

		mTypes.put(typeName, newType);
	}

	public static boolean hasType(String name) {

		return mTypes.containsKey(name.toUpperCase());
	}

	public static Type getInstance() {

		return mType;
	}
	

}
