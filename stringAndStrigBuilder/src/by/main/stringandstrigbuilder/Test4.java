package by.main.stringandstrigbuilder;


//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.


public class Test4 {

	public static void main(String[] args) {
		String inf ="информатика";
		String cake;
		cake =inf.valueOf('т')+inf.valueOf('о')+inf.valueOf('р')+inf.valueOf('т');
		
		System.out.println(cake);
	}

}
