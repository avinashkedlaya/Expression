package mycfg;

import utilities.IdGenerator;
import cfg.ICFEdge;
import cfg.ICFG;
import cfg.ICFGNode;

public class CFEdge implements ICFEdge {

	ICFG mCFG;
	ICFGNode mTail = null; // source
	ICFGNode mHead = null; // destination
	private String mId;
	
	public CFEdge(ICFG cfg, ICFGNode tail, ICFGNode head) {
		this.mCFG = cfg;
		this.mTail = tail;
		this.mHead = head;
		if(cfg != null) {
			cfg.addEdge(this);
		}
		this.mId = CFEdge.generateId();
	}

	private static String generateId() {
		return IdGenerator.generateId("CFEdge");
	}

	public CFEdge(String id, ICFG cfg, ICFGNode tail, ICFGNode head) throws Exception {
		this.mCFG = cfg;
		this.mTail = tail;
		this.mHead = head;
		if(IdGenerator.hasId(id)) {
			Exception e = new Exception("Can't construct CFEdge : something with name '" + id + "' already exists.");
			throw e;			
		}
		if(cfg != null) {
			cfg.addEdge(this);
		}
		IdGenerator.addId(id);
		this.mId = id;
	}

	@Override
	public ICFGNode getHead() {
		return this.mHead;
	}

	@Override
	public ICFGNode getTail() {
		return this.mTail;
	}

	@Override
	public ICFG getCFG() {
		return this.mCFG;
	}

	@Override
	public void setCFG(ICFG graph) {
		this.mCFG = graph;
	}

	@Override
	public String getId() {
		return this.mId;
	}
	
	public String toString() {
		return "CFEdge " + this.mId + " tail = " + this.mTail.getId() + " head = " + this.mHead.getId() + "\n";
	}
}