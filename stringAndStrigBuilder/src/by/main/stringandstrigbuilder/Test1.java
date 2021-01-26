package by.main.stringandstrigbuilder;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.


public class Test1 {

	public static void main(String[] args) {
		String str="Строка   с      пробелами";
		int countSpace=0;
		int maxSpace=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				countSpace++;
				
				if(!Character.isWhitespace(str.charAt(i+1))) {
					
					if( maxSpace<countSpace) {
						maxSpace=countSpace;
					}
					
					countSpace=0;
			
				}
			}
			
		}
		System.out.println(maxSpace);
		
	}

}
