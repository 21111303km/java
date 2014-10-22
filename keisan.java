class keisan
{
	public static void main(String argv[])
	{
		System.out.println("Hello,world!");
		// “ü—Í:‚Q‚Â‚Ì”’l‚ğ“ü—Í
		int in0 = new java.util.scanner(system.in).nextInt();
		int in1 = new java.util.scanner(system.in).nextInt();
		System.out.println(in0+","+in1);
		
		// ˆ—:‘«‚µZ
		int add = in0+in1;
		// ˆ—:ˆø‚«Z
		int sub = in0-in1;
		// ˆ—:Š|‚¯Z
		int a = in0*in1;
		// ˆ—:Š„‚èZ
		int b = in0/in1;
		// ˆ—:—]‚è
		int c =in0%in1;
		
		// ŒvZŒ‹‰Ê‚ğo—Í
		System.out.println("‘«‚µZ:"+add);
		System.out.println("ˆø‚«Z:"+sub);
		System.out.println("Š|‚¯Z:"+a);
		System.out.println("Š„‚èZ:"+b);
		System.out.println("—]‚è:"+c);
	}
}