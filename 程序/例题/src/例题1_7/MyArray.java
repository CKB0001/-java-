package ����1_7;

public class MyArray {
	public static void main(String args[]) {
		int myArray[];	//��������
		myArray=new int[10]; //��������
		myArray[0]=0;
		myArray[1]=1;
		myArray[2]=2;
		myArray[9]=9;
		System.out.println("Index\t\tValue");
		for(int i=0;i<myArray.length ;i++)
		System.out.println(i+"\t\t"+myArray[i]);
		System.out.print("Values:");
		for(int i:myArray) //ʹ����ǿforѭ���������飬��JDR5�����ϰ汾����
			System.out.print(i+" ");
		System.out.println("\n");
		//֤������Ԫ��Ĭ�ϳ�ʼ��Ϊ0
		//myArrat[10]=100;    //����������Խ���쳣
		
		
	}
}
