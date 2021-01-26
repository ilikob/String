package by.main.stringandstrigbuilder;


//ѕосчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. ”читывать только английские
//буквы.

public abstract class Test9 {

	public static void main(String[] args) {
		String str="StrinG";
		int countUppercase=0;
		int countLowercase=0;
		
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))) {
				countUppercase++;
			}
			
			else if(Character.isLowerCase(str.charAt(i))) {
				countLowercase++;
			}
		}
		
		
		
		System.out.print("countUppercase= "+countUppercase+"  countLowercase= "+ countLowercase);
	}

}
