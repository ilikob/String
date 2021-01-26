package by.main.stringasarray;


//Замените в строке все вхождения 'word' на 'letter'


public class Test2 {

	public static void main(String[] args) {
		String str ="word word".replaceAll("word", "letter");
		
		
		System.out.println(str);
	}

}
