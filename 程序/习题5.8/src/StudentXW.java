
public class StudentXW extends Student {
	String zeren;//责任
	public String testScore()
	{
		return((super.testScore()+3)+"使用的是学习委员的testScore");
	}

}
