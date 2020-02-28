package 例题1_7;

public class MyArray {
	public static void main(String args[]) {
		int myArray[];	//声明数组
		myArray=new int[10]; //创建数组
		myArray[0]=0;
		myArray[1]=1;
		myArray[2]=2;
		myArray[9]=9;
		System.out.println("Index\t\tValue");
		for(int i=0;i<myArray.length ;i++)
		System.out.println(i+"\t\t"+myArray[i]);
		System.out.print("Values:");
		for(int i:myArray) //使用增强for循环遍历数组，在JDR5及以上版本运行
			System.out.print(i+" ");
		System.out.println("\n");
		//证明数组元素默认初始化为0
		//myArrat[10]=100;    //将产生数组越界异常
		
		
	}
}
