package by.main.stringasarray;


// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.



public class Test5 {

	public static void main(String[] args) {
		String str =" Строка  с лишними  пробелами ";

		while(str.contains("  ")) {
			String replace = str.replace("  ", " ");
		    str=replace;
		}

		System.out.println(str.trim());
	

	
	}
}
