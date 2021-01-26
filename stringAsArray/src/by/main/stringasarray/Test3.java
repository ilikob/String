package by.main.stringasarray;


//В строке найти количество цифр.


public class Test3 {

	public static void main(String[] args) {
		String str ="Строка 4 с цифрами 1";
		int countNumber =0;
		
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				countNumber++;
			}
		}
		
		System.out.println(countNumber);
	}

}
