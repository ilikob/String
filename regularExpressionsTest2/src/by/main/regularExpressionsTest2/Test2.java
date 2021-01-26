package by.main.regularExpressionsTest2;

/*�������� ����������, ����������� ��������������� ���������� ���������� ����� xml-��������� � ��� ��� (�����������
���, ����������� ���, ���������� ����, ��� ��� ����). ������������ �������� ��������� XML ��� ������� ������ ������
������.*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	  
	    public static void main(String[] args) {
	    	String xml ="<notes>\r\n"
	    			+ " <note id = \"1\">\r\n"
	    			+ " <to>����</to>\r\n"
	    			+ " <from>�����</from>\r\n"
	    			+ " <heading>�����������</heading>\r\n"
	    			+ " <body>������� ��� ������!</body>\r\n"
	    			+ " </note>\r\n"
	    			+ " <note id = \"2\">\r\n"
	    			+ " <to>����</to>\r\n"
	    			+ " <from>����</from>\r\n"
	    			+ " <heading>������ �����������</heading>\r\n"
	    			+ " <body/>\r\n"
	    			+ " </note>\r\n"
	    			+ "</notes>";
	    	
	    	
	    	System.out.print(analizator(xml));
	    }

	    
	    public static String analizator(String xml) {
	    	 StringBuilder str = new StringBuilder();
	         Pattern openTag = Pattern.compile("<\\w.+?>");
	         Pattern closeTag = Pattern.compile("</\\w+>");
	         Pattern body = Pattern.compile(">.+?<");
	         Pattern tag = Pattern.compile("<\\w.+?/>");

	         String [] lines = xml.split("\n\\s*");

	         for (String line : lines) {
	             Matcher mOpen = openTag.matcher(line);
	             Matcher mClose = closeTag.matcher(line);
	             Matcher mBody = body.matcher(line);
	             Matcher mEmpty = tag.matcher(line);
	             
	             if (mOpen.find()) {
	                 str.append("����������� ��� :  ");
	                 str.append(mOpen.group());
	                 str.append("\n");
	             }
	             
	             if (mClose.find()) {
	                 str.append("����������� ��� : ");
	                 str.append(mClose.group());
	                 str.append("\n");
	             }
	             
	             if (mBody.find()) {
	                 str.append("���������� ���� :  ");
	                 str.append(mBody.group().substring(1));
	                 str.append("\n");
	             }
	             
	             else if (mEmpty.find()) {
	                 str.append("��� :  ");
	                 str.append(mEmpty.group());
	                 str.append("\n");
	             }

	         }
	         return str.toString();
	     }
}
