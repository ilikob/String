package by.main.stringandstrigbuilder;


//����������, ������� ��� ����� �������� �������� ������ ����������� ����� ���


public class Test5 {

	public static void main(String[] args) {
		String a="fa and af";
		int counta=0;
		
		for(int i=0; i<a.length();i++) {
			if(a.charAt(i)=='a') {
				counta++;
			}
		}
		
		
		System.out.println(counta);
	}

}
