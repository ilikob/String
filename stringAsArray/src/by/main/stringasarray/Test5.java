package by.main.stringasarray;


// ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ �������� �������� �� ��������� �������.
//������� ������� � ������ �������.



public class Test5 {

	public static void main(String[] args) {
		String str =" ������  � �������  ��������� ";

		while(str.contains("  ")) {
			String replace = str.replace("  ", " ");
		    str=replace;
		}

		System.out.println(str.trim());
	

	
	}
}
