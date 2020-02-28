package os.model;
public class Bank {
	private int Available[]=new int[new Course().getN()];//可利用资源数组
	private Boolean Finish[]=new Boolean[new Course().getN()];//系统是否有足够资源分配给进程
	
	public Bank(int[] available, Boolean[] finish) {
		super();
		Available = available;
		Finish = finish;
	}
	public Bank() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public int[] getAvailable() {
		return Available;
	}
	public void setAvailable(int[] available) {
		Available = available;
	}
	public Boolean[] getFinish() {
		return Finish;
	}
	public void setFinish(Boolean[] finish) {
		Finish = finish;
	}
	
	
	
}
