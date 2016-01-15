package pos;

public class Index {
	String barcode;  //商品编号
	String name;	 //商品名
	String unit;     //单位
	Double  price;    //商品单价
	Double discount;   //商品折扣率
	boolean promotion; //是否 "买二赠一"
	Double vipDiscount;//vip折扣率
	public Index(String bar, String nam, String uni, Double pri,Double dis,boolean pro,Double vip){
		barcode=bar;
		name=nam;
		unit=uni;
		price=pri;
		discount=dis;
		promotion=pro;
		vipDiscount=vip;
	}
	public String getBarcode(){
		return barcode;
	}
	public String getName(){
		return name;
	}
	public String getUnit() {
		return unit;
	}
	public Double getPrice() {
		return this.price;
	}
	public Double getDiscount() {
		return discount;
	}
	public boolean getPromotion() {
		return promotion;
	}
	public Double getVipDiscount(){
		return vipDiscount;
	}
}
