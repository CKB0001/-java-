import java.util.Date;

public class People {
	private String name;
	private String day; 
	private String sex;
	private double height;
	private double weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String  getDay() {
		return day;
	}
	public void setDay(String  day) {
		this.day = day;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString ()
	{
		String s="������"+name+"\t�Ա�:"+sex+"\t����:"+day+"\t���:"+height+"\t����:"+weight+"\n";
		return s;
	}
}
