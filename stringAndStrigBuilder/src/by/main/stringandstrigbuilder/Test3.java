package by.main.stringandstrigbuilder;


//. ���������, �������� �� �������� ����� �����������.


public class Test3 {

	public static void main(String[] args) {
		String str ="�����";
		StringBuilder rev=new StringBuilder(str).reverse();
		String sRev = rev.toString(); 
		if(str.compareTo(sRev)==0) {
			System.out.println("��� �����������");
		}
		else {
			System.out.println("��� �� �����������");
		}
		
	}

}
