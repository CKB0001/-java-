
public class StudentBZ extends Student{
	String zeren;//责任
	public String testScore()
	{
		return((super.testScore()+5)+"使用的是班长的testScore");
	}

}
