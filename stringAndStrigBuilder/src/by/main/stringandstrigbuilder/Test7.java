package by.main.stringandstrigbuilder;


// �������� ������. ��������� ������� �� ��� ������������� ������� � ��� �������.
//��������, ���� ���� ������� "abc cde def", �� ������ ���� �������� "abcdef".


public class Test7 {

	public static void main(String[] args) {
		String str ="abc cde def";
		StringBuilder s= new StringBuilder(str);
		
		for(int i=0;i<s.length();i++) {
			char symbol =s.charAt(i);
			if(s.charAt(i)==' ') {
				s.deleteCharAt(i);
				i--;
			}
			
			
			for(int j=i+1;j<s.length();j++) {
				if(str.charAt(j)==symbol) {
					s.deleteCharAt(j);
					
				}
			}
		}
		
		System.out.println(s.toString());

		

	}

}
