package by.main.stringandstrigbuilder;

//¬водитс€ строка слов, разделенных пробелами. Ќайти самое длинное слово и вывести его на экран. —лучай, когда самых
//длинных слов может быть несколько, не обрабатывать


public class Test8 {

	public static void main(String[] args) {
		String str ="—трока с длинным словом";
		StringBuilder longWord = new StringBuilder();

		int countLetters=0;
		int maxLetters=0;
		
		
		for(int i=1;i<str.length();i++){
			countLetters++;
			if(Character.isWhitespace(str.charAt(i)) || i==str.length()-1) {
				if(countLetters>maxLetters) {
					maxLetters=countLetters;
					longWord.delete(0, longWord.length());
					
					
					if(i-countLetters==0) {
						longWord.append(str, i-countLetters, i+1);
					}
					
					else{
						longWord.append(str, i-countLetters+1, i+1);
					}
					
					
				}
				countLetters=0;
			}
		}
		
		
		System.out.print(longWord.toString());
	}

}
