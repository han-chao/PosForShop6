package pos;
public class User {
	private String name;
	private boolean isVip;
	private int memberPoints;
	public User(String name,boolean isVip,int memberPoints){
		this.name=name;
		this.isVip=isVip;
		this.memberPoints=memberPoints;
	}
	public String getName(){
		return name;
	}
	public boolean getIsVip(){
		return isVip;
	}
	public int  getMemberPoints(){
		return memberPoints;
	}
	public void  setMemberPoints(int memberPoints){
		this.memberPoints= memberPoints;
	}
	public String toString(){
		return (name+"\t"+isVip+"\t"+memberPoints+"\n");
	}
}
