package by.main.stringandstrigbuilder;


//—трока X состоит из нескольких предложений, каждое из которых кончаетс€ точкой,
//восклицательным или вопросительным
//знаком. ќпределить количество предложений в строке X.


public class Test10 {

	public static void main(String[] args) {
		String str = "ѕредложение. ƒва! “ри?";
		int countSentences =0;
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='.' ||str.charAt(i)=='!'||str.charAt(i)=='?' ) {
				countSentences++;
			}
		}
		
		
		System.out.print(countSentences);
	}

}
