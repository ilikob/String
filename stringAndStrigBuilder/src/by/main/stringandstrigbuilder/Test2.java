package by.main.stringandstrigbuilder;


//. В строке вставить после каждого символа 'a' символ 'b'.


public class Test2 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("aa and a");
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)=='a') {
        		str.insert(i+1, 'b');
        	}
        }

        
        
        System.out.println(str);
	}

}
