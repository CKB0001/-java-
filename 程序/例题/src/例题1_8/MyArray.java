package 例题1_8;

public class MyArray {
	public static void main(String args[]) {
	int myArray[][];         //声明数组
	myArray=new int[5][10];  //创建数组
	int total=0;
	for(int i=0;i<myArray.length ;i++)
		for(int j=0;j<myArray[i].length ;j++)
			myArray[i][j]=i*10+j;
	//为每个数组元素赋值
	/*for(int i=0;i<myArray.length ;i++)
		for(int j=0;j<myArray[i].length ;j++)
			total+=myArray[i][j];
	System.out.println("The sum is:"+total);
	total=0;*/
	for(int a[]:myArray)
		//使用增强for循环遍历二维数组myArray，每次循环时，a都是一个一维数组
		for(int i:a)
			//使用增强for循环遍历一维数组a。每次循环时，i是一个int型整数
			//total+=i;
			System.out.print(i+"  ");
	//System.out.println("The sum is:"+total);	
	}
}
