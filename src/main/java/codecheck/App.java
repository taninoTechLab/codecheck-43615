package codecheck;

public class App {
	public static void main(String[] args) {

		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
		}

		if (args[0].equals("decode")) {
			String base36 = returnNum(args[1]);
			int dec = Integer.parseInt(base36, 9);//10進数に変換
			System.out.println(String.valueOf(dec));
		} else if (args[0].equals("encode")) {
			System.out.println(returnAlphabet(args[1]));
		}
	}

	static String returnNum(String input) {
		StringBuilder output = new StringBuilder();
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
				output.append('0');
			case '1':
				output.append('1');
			case '2':
				output.append('2');
			case '3':
				output.append('3');
			case '4':
				output.append('4');
			case '5':
				output.append('5');
			case '6':
				output.append('6');
			case '7':
				output.append('7');
			case '8':
				output.append('8');
			}
		}
		return output.toString();
	}
}
