package os.model;
public class Bank {
	private int Available[]=new int[new Course().getN()];//��������Դ����
	private Boolean Finish[]=new Boolean[new Course().getN()];//ϵͳ�Ƿ����㹻��Դ���������
	
	public Bank(int[] available, Boolean[] finish) {
		super();
		Available = available;
		Finish = finish;
	}
	public Bank() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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
