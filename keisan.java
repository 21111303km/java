class keisan
{
	public static void main(String argv[])
	{
		System.out.println("Hello,world!");
		// ����:�Q�̐��l�����
		int in0 = new java.util.scanner(system.in).nextInt();
		int in1 = new java.util.scanner(system.in).nextInt();
		System.out.println(in0+","+in1);
		
		// ����:�����Z
		int add = in0+in1;
		// ����:�����Z
		int sub = in0-in1;
		// ����:�|���Z
		int a = in0*in1;
		// ����:����Z
		int b = in0/in1;
		// ����:�]��
		int c =in0%in1;
		
		// �v�Z���ʂ��o��
		System.out.println("�����Z:"+add);
		System.out.println("�����Z:"+sub);
		System.out.println("�|���Z:"+a);
		System.out.println("����Z:"+b);
		System.out.println("�]��:"+c);
	}
}