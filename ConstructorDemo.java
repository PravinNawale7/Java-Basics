
public class ConstructorDemo {
	String clgName;
	int regNo;
	ConstructorDemo(){
		clgName = "K K Wagh";
		regNo = 123;
		System.out.println("College Name "+clgName +", Registration Number is "+regNo);

	}
	ConstructorDemo(String clgName,int regNo){
		this.clgName = clgName;
		this.regNo = regNo;
		System.out.println("College Name "+clgName +", Registration Number is "+regNo);
	}
	ConstructorDemo(ConstructorDemo a){
		this(a.clgName,a.regNo);
		
	}
	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo("Raisoni College",567);
		ConstructorDemo c3 = new ConstructorDemo(c1);

	}

}
