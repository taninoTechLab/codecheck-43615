package codecheck;

public class App {
	public static void main(String[] args) {

		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
		}

		if (args[0].equals("decode")) {
			String base = returnNum(args[1]);
			System.out.println(base);
			int dec = Integer.parseInt(base, 9);//10進数に変換
			System.out.println(String.valueOf(dec));

		} else if (args[0].equals("encode")) {
			System.out.println(returnAlphabet(args[1]));
		}
	}

	static String returnNum(String input) {
		StringBuilder output = new StringBuilder();
		System.out.println(input.length());
		System.out.println(input + "hoge");
		for (int i = 0, l = input.length(); i < l; i++) {
			switch (input.charAt(i)) {
			case 'A':
				output.append('0');
			case 'B':
				output.append('1');
			case 'C':
				output.append('2');
			case 'D':
				output.append('3');
			case 'E':
				output.append('4');
			case 'F':
				output.append('5');
			case 'G':
				output.append('6');
			case 'H':
				output.append('7');
			case 'I':
				output.append('8');
			}
		}
		return output.toString();
	}

	static String returnAlphabet(String input) {
		StringBuilder output = new StringBuilder();
		int dec = Integer.parseInt(input);
		String base9 = Integer.toString(dec, 9);
		for (int i = 0, l = base9.length(); i < l; i++) {
			switch (base9.charAt(i)) {

			case '0':
				output.append('A');
			case '1':
				output.append('B');
			case '2':
				output.append('C');
			case '3':
				output.append('D');
			case '4':
				output.append('E');
			case '5':
				output.append('F');
			case '6':
				output.append('G');
			case '7':
				output.append('H');
			case '8':
				output.append('I');
			}
		}
		return output.toString();
	}
}
