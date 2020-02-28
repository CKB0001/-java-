package os.model;

public class Course {
	private int N;
	private int Max[]=new int[N];//����������
	private int Allocation[]=new int[N];//�ѷ������
	private int Need[]=new int[N];//�������
	private int Request[]=new int[N];//���������
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
		// TODO �Զ����ɵĹ��캯�����
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
