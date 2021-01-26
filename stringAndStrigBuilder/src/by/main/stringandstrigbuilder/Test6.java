package by.main.stringandstrigbuilder;


//Из заданной строки получить новую, повторив каждый символ дважды.


public class Test6 {

	public static void main(String[] args) {
		String str="Строка";
		StringBuilder newStr=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			newStr.append(str.charAt(i)).append(str.charAt(i));
		}
		
		System.out.print(newStr);

	}

}
