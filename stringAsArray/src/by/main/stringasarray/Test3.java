package by.main.stringasarray;


//� ������ ����� ���������� ����.


public class Test3 {

	public static void main(String[] args) {
		String str ="������ 4 � ������� 1";
		int countNumber =0;
		
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				countNumber++;
			}
		}
		
		System.out.println(countNumber);
	}

}
