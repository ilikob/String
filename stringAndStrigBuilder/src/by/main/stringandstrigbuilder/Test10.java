package by.main.stringandstrigbuilder;


//������ X ������� �� ���������� �����������, ������ �� ������� ��������� ������,
//��������������� ��� ��������������
//������. ���������� ���������� ����������� � ������ X.


public class Test10 {

	public static void main(String[] args) {
		String str = "�����������. ���! ���?";
		int countSentences =0;
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='.' ||str.charAt(i)=='!'||str.charAt(i)=='?' ) {
				countSentences++;
			}
		}
		
		
		System.out.print(countSentences);
	}

}
