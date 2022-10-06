
public class Product {
	public Product(int id, String Name, String desciption, double price, int stockAmount, String Renk)
	{
		System.out.println("yapıcı blok çalıştı");
		this._id=id;
		this.name=Name;
		this.price=price;
		this.renk=Renk;
		this.description=desciption;
		this.stockAmount=stockAmount;
	}
	//Attribute | Field
	private int _id ;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId(int id) {return id;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	public void setId(int id) 
	{
		this._id=id;
	}
}
