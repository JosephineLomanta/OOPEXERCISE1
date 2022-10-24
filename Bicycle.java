public class Bicycle
{
	private String ownerName;
	private String tagNo;
	
	public Bicycle() {
		ownerName = "Unknown";
		tagNo = "Unknown";
	}
	public Bicycle(String name, String tag){
		tagNo = tag;
		ownerName = name;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	public String getTagNo(){
		return tagNo;
	}
	
	public void setOwnerName(String name) {
		ownerName = name;
	}
	public void settagNo(String No) {
		tagNo = No;
	}
	
}
