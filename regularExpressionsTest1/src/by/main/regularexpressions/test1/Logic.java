package by.main.regularexpressions.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Logic {

	public Logic() {
		
	}
	
	public void sortByParagraph(String text) {
		String[] paragraphs = splitParagraphs(text);
        int[] countSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            countSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < countSentences.length; j++) {
                if (i == countSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
            

        }
	}
	
	public void sortByWordLength(String text) {
		String minLetters="";
		String[] paragraphs = splitParagraphs(text);
	    for (int i=0;i<paragraphs.length;i++) {
	        String[] sentences = splitSentences(paragraphs[i]);
	        for (int j=0;j<sentences.length;j++) {
	            String[] words = splitWord(sentences[j]);

				boolean check=false;
				while(!check) {
					check=true;
				
				
					for(int l=0;l<words.length-1;l++) {
					
						if(words[l].length()<words[l+1].length()) {
							check =false;
						
							minLetters=words[l];
							words[l]=words[l+1];
							words[l+1]=minLetters;
						}
					}
				}

	            for (String word : words) {
	                System.out.print(word + " ");
	            }
	            System.out.print("\b. ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	}
   
	
	   public void sortLexemes(String text) throws IOException {
		    String minLexems="";
	        System.out.print("¬ведите лексему:");
	        String letter = View.readString();
	        String[] paragraphs = splitParagraphs(text);
		    for (int i=0;i<paragraphs.length;i++) {
	            String[] sentences = splitSentences(paragraphs[i]);
	            for (int j=0;j<sentences.length;j++) {
		            String[] words = splitWord(sentences[j]);
	                for (int l = words.length - 1; l >= 0; l--) {
	                    for (int m = 0; m < l; m++) {
	                        int countLexems1 = 0;
	                        int countLexems2 = 0;
	                        for (int n = 0; n < words[m].length(); n++) {
	                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
	                            	countLexems1++;
	                            }
	                        }
	                        for (int n = 0; n < words[m + 1].length(); n++) {
	                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
	                            	countLexems2++;
	                            }
	                        }
	                        if (countLexems1 < countLexems2) {
	                        	minLexems = words[m];
	                            words[m] = words[m + 1];
	                            words[m + 1] = minLexems;
	                        } else if (countLexems1 == countLexems2) {
	                            String[] forCompare = {words[m], words[m + 1]};
	                            Arrays.sort(forCompare);
	                            words[m] = forCompare[0];
	                            words[m + 1] = forCompare[1];
	                        }
	                    }
	                }
	                for (String word : words) {
	                    System.out.print(word + " ");
	                }
	                System.out.print("\b. ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	
	
	
     private static String[] splitSentences(String text) {
    	 Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
     	return pattern.split(text);
     }
     
     private static String[] splitParagraphs(String text) {
    	 Pattern pattern = Pattern.compile("\n");
     	return pattern.split(text);
     }
     
     private static String[] splitWord(String sentences) {
    	 Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
     	return pattern.split(sentences);
     }
     
}
