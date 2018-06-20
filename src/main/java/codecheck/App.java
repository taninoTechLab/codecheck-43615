package codecheck;

public class App {
	public static void main(String[] args) {

		//		for (int i = 0, l = args.length; i < l; i++) {
		//			String output = String.format("argv[%s]: %s", i, args[i]);
		//			System.out.println(output);
		//		}

		if (args[0].equals("decode")) {
			String base = returnNum(args[1]);
			Long dec = Long.parseLong(base, 9);//10進数に変換
			System.out.println(String.valueOf(dec));

		} else if (args[0].equals("encode")) {
			System.out.println(returnAlphabet(args[1]));
		} else if (args[0].equals("align")) {
			System.out.println(returnAlphabet(args[1]));
		}
	}

	static String calculateH(String input) {
		StringBuilder output = new StringBuilder();
		output.append(input).append(" + "); // 結果式の準備

		String addStr = ""; //加算する数値の文字列
		long add = 0; // 加算する数値
		long result = 0; // 加算結果
		String resultStr = ""; // 加算結果の文字列

		String base = returnNum(input);
		Long dec = Long.parseLong(base, 9);//10進数に変換

		// 繰り返し加算してHになる数字を導く
		boolean flag = false;
		while (flag) {
			result = dec + add;
			resultStr = returnAlphabet(String.valueOf(result));
			if (resultStr.matches("^[H]+$")) { // すべての文字がHに一致すれば終わり
				addStr = returnAlphabet(String.valueOf(add));
				flag = true;
			}
			add++;
		}

		return output
				.append(addStr)
				.append(" = ")
				.append(returnAlphabet(resultStr))
				.toString();
	}

	static String returnNum(String input) {
		StringBuilder output = new StringBuilder();
		for (int i = 0, l = input.length(); i < l; i++) {
			switch (input.charAt(i)) {
			case 'A':
				output.append('0');
				break;
			case 'B':
				output.append('1');
				break;
			case 'C':
				output.append('2');
				break;
			case 'D':
				output.append('3');
				break;
			case 'E':
				output.append('4');
				break;
			case 'F':
				output.append('5');
				break;
			case 'G':
				output.append('6');
				break;
			case 'H':
				output.append('7');
				break;
			case 'I':
				output.append('8');
				break;
			}
		}
		return output.toString();
	}

	static String returnAlphabet(String input) {
		StringBuilder output = new StringBuilder();
		Long dec = Long.parseLong(input);
		String base9 = Long.toString(dec, 9);
		for (int i = 0, l = base9.length(); i < l; i++) {
			switch (base9.charAt(i)) {

			case '0':
				output.append('A');
				break;
			case '1':
				output.append('B');
				break;
			case '2':
				output.append('C');
				break;
			case '3':
				output.append('D');
				break;
			case '4':
				output.append('E');
				break;
			case '5':
				output.append('F');
				break;
			case '6':
				output.append('G');
				break;
			case '7':
				output.append('H');
				break;
			case '8':
				output.append('I');
				break;
			}
		}
		return output.toString();
	}
}
