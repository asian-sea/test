package jp.co.internous.action;

public class Test {

	public static void main(String[]args){
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age=20;
		taro.phoneNumber = "090-XXX-XXX";
		taro.address = "taro@XXX.XXX";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		taro.talk();
		taro.walk();
		taro.run();

		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "090-XXX-XXX";
		jiro.address = "jiro@XXX.XXX";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);


		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber= "080-XXX-XXX";
		hanako.address = "hanako@XXX.XXX";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person ami = new Person();
		ami.name = "田之上亜海";
		ami.age = 26;
		ami.phoneNumber = "080-XXX-XXX";
		ami.address = "ami@XXX.XXX";

		System.out.println(ami.name);
		System.out.println(ami.age);
		System.out.println(ami.phoneNumber);
		System.out.println(ami.address);

		Person aibo=new Person();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Person asimo=new Person();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Person pepper=new Person();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
