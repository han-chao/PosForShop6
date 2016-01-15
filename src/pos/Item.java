package pos;
public class Item{
	public String barcode;  //商品编号
	private String name;	 //商品名
	private String unit;     //单位
	private Double  price;   //商品单价
	private Double discount; //商品折扣率
	private int num;        //商品数量
	private boolean promotion; //是否 "买二赠一"
	private boolean isVip;    //是否是vip
	private Double vipDiscount;//vip折扣率
	public Item(String bar, String nam, String uni, Double pri,Double dis,boolean pro,boolean isV,Double vip){
		barcode=bar;
		name=nam;
		unit=uni;
		price=pri;
		discount=dis;
		promotion=pro;
		vipDiscount=vip;
		isVip=isV;
		num=1;
	}
	public void addItemNum(){
		num++;
	}
	public Double getTotal(){ //实际花的钱数
		if(isVip)                 //vip客户
			return (price*num*discount*vipDiscount);
		if(promotion && num>2){ //参加“买二赠一”
			return (price*(num-num/3));
		}
		return (price*num*discount);//普通客户
	}
	public Double getSave(){ //节省的钱数
		return (price*num-getTotal());
	}
	public String twoForOne(){
		if(isVip)
			return "";
		if(promotion && num>2){
			return ("名称："+name+"\t，数量："+(num/3)+unit+"\n");
		}
		return "";
	}
	public String toString(){
		return ("名称："+name+"\t,数量："+num+unit+"\t,单价："
				+String.format("%.2f",price)+"(元)"+"\t,小计："
				+String.format("%.2f",getTotal())+"(元)"+"\n\n");
	}
}