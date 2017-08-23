package priv.lst.test;

public class HelloChina {
	{
		name = "小三";
		age = 22;
		address = "上海";
		System.out.println("first");
	}
	public String name = "张三";
	public int age = 29;
	public String address = "北京市";
	public int a;
	public HelloChina() {
		name = "cons";
		age = 1;
		address = "cons";
		System.out.println("second");
	}
	public static void main(String[] args) {
		int b;
		System.out.println("git");
		System.out.println("git amend");
		System.out.println("Hello world!");
		System.out.println(new HelloChina().a);
	}

}
