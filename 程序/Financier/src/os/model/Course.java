package os.model;

public class Course {
	private int N;
	private int Max[]=new int[N];//最大需求矩阵
	private int Allocation[]=new int[N];//已分配矩阵
	private int Need[]=new int[N];//需求矩阵
	private int Request[]=new int[N];//申请的需求
	public Course(int n, int[] max, int[] allocation, int[] need, int[] request) {
		super();
		N = n;
		Max = max;
		Allocation = allocation;
		Need = need;
		Request = request;
	}
	public Course() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int[] getMax() {
		return Max;
	}
	public void setMax(int[] max) {
		Max = max;
	}
	public int[] getAllocation() {
		return Allocation;
	}
	public void setAllocation(int[] allocation) {
		Allocation = allocation;
	}
	public int[] getNeed() {
		return Need;
	}
	public void setNeed(int[] need) {
		Need = need;
	}
	public int[] getRequest() {
		return Request;
	}
	public void setRequest(int[] request) {
		Request = request;
	}
	
	
	
}
