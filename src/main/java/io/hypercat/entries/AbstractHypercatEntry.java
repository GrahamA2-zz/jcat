package hypercat.entries;


public class AbstractHypercatEntry implements HypercatEntry {
	
	private final String rel;
	private String val;
	
	public AbstractHypercatEntry(String rel, String val){
		this.rel = rel;
		this.val = val;
	}
	
	public String getRel(){
		return rel;
	}
	
	public String getVal(){
		return val;
	}
}
