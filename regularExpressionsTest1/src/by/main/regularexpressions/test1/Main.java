package by.main.regularexpressions.test1;

import java.io.IOException;

/*Cоздать приложение, разбирающее текст (текст хранитс€ в строке) и позвол€ющее выполн€ть с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства Ц по
алфавиту.
*/


public class Main {

	public static void main(String[] args) throws IOException {
		String text="A paragraph could be part of a text that informs people, describes something, critiques something, compares things, persuades people, lists a process, makes an argument, offers a solution or narrates a story. And, the level of detail will vary from text to text.\r\n"
				+ "\r\n"
				+ "If you're getting the sense that the word topic is a bit too grand for a measly paragraph, then think of a paragraph as a distinct section of writing that covers one aspect of your topic. That's the point. Sometimes, a paragraph will be an aspect of a topic, sometimes it will be a topic within an issue. Sometimes it will an issue within an argumentЕa narrative, a process, a comparison, whatever. Whatever the scope of your paragraph, it should be neatly bounded as oneЕwell, topic. If you prefer aspect instead of topic, go with that."
				+ "\r\n"
				+ "All this diversity means that it's not always easy to determine what \"one topic\" means when dividing your text into paragraphs. For example, you could have a one-topic paragraph describing Venus (with the next paragraph describing Mars). One-topic paragraph describing the colours of a sunset (with the next paragraph describing its reflection in the sea).\r\n";
				
		
		System.out.println("—ортировка абзацов по количеству предложений:");
		Logic paragraph=new Logic();
		paragraph.sortByParagraph(text);
		
		System.out.println();
		System.out.println();
		
		System.out.println("—ортировка предложений по длинне слов:");
		Logic sentences=new Logic();
		sentences.sortByWordLength(text);
		
		System.out.println();
		System.out.println();
		
		System.out.println("—ортировка  по лексемам:");
		Logic lexem=new Logic();
		lexem.sortLexemes(text);
	}

}
