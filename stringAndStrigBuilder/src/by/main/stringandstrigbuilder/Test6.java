package by.main.stringandstrigbuilder;


//�� �������� ������ �������� �����, �������� ������ ������ ������.


public class Test6 {

	public static void main(String[] args) {
		String str="������";
		StringBuilder newStr=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			newStr.append(str.charAt(i)).append(str.charAt(i));
		}
		
		System.out.print(newStr);

	}

}
