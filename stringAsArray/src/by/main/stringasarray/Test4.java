package by.main.stringasarray;


//� ������ ����� ���������� �����.



public class Test4 {

	public static void main(String[] args) {
		String str ="������ 12 � 23������� 1 25";
		int countNumber =0;
		
		
		for(int i=0;i<str.length()-1;i++) {
			if(Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i+1))) {
				countNumber++;
			}
			else if(i==str.length()-2 && Character.isDigit(str.charAt(i+1)) ) {
				countNumber++;
			}
		}
		
		System.out.println(countNumber);
	}

	

}
