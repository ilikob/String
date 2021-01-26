package by.main.regularexpressions.test1;

import java.io.IOException;

/*C������ ����������, ����������� ����� (����� �������� � ������) � ����������� ��������� � ������� ��� ���������
��������: ������������� ������ �� ���������� �����������; � ������ ����������� ������������� ����� �� �����;
������������� ������� � ����������� �� �������� ���������� ��������� ��������� �������, � � ������ ��������� � ��
��������.
*/


public class Main {

	public static void main(String[] args) throws IOException {
		String text="A paragraph could be part of a text that informs people, describes something, critiques something, compares things, persuades people, lists a process, makes an argument, offers a solution or narrates a story. And, the level of detail will vary from text to text.\r\n"
				+ "\r\n"
				+ "If you're getting the sense that the word topic is a bit too grand for a measly paragraph, then think of a paragraph as a distinct section of writing that covers one aspect of your topic. That's the point. Sometimes, a paragraph will be an aspect of a topic, sometimes it will be a topic within an issue. Sometimes it will an issue within an argument�a narrative, a process, a comparison, whatever. Whatever the scope of your paragraph, it should be neatly bounded as one�well, topic. If you prefer aspect instead of topic, go with that."
				+ "\r\n"
				+ "All this diversity means that it's not always easy to determine what \"one topic\" means when dividing your text into paragraphs. For example, you could have a one-topic paragraph describing Venus (with the next paragraph describing Mars). One-topic paragraph describing the colours of a sunset (with the next paragraph describing its reflection in the sea).\r\n";
				
		
		System.out.println("���������� ������� �� ���������� �����������:");
		Logic paragraph=new Logic();
		paragraph.sortByParagraph(text);
		
		System.out.println();
		System.out.println();
		
		System.out.println("���������� ����������� �� ������ ����:");
		Logic sentences=new Logic();
		sentences.sortByWordLength(text);
		
		System.out.println();
		System.out.println();
		
		System.out.println("����������  �� ��������:");
		Logic lexem=new Logic();
		lexem.sortLexemes(text);
	}

}
