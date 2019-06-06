package passwordProject;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Crypto {
	HashMap<Character, Character> code = new HashMap<Character, Character>();
	HashMap<Character, Character> uncode = new HashMap<Character, Character>();

	private final char[] list = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j',
			'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', '@',
			'#', '$', '%', '^', '&', '*', '~', '?', ',', '.', '/', '<', '>', ';', ':',  '[', '{', ']', '}', '|',
			'=', '+', '-', '_', '(', ')','A','B','C','D','E','F','G','`',
			'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','\''};

	public Crypto(int level) {
		code.put('a', null);
		code.put('b', null);
		code.put('c', null);
		code.put('d', null);
		code.put('e', null);
		code.put('f', null);
		code.put('g', null);
		code.put('h', null);
		code.put('i', null);
		code.put('j', null);
		code.put('k', null);
		code.put('l', null);
		code.put('m', null);
		code.put('n', null);
		code.put('o', null);
		code.put('p', null);
		code.put('q', null);
		code.put('r', null);
		code.put('s', null);
		code.put('t', null);
		code.put('u', null);
		code.put('v', null);
		code.put('w', null);
		code.put('x', null);
		code.put('y', null);
		code.put('z', null);
		code.put('A', null);
		code.put('B', null);
		code.put('C', null);
		code.put('D', null);
		code.put('E', null);
		code.put('F', null);
		code.put('G', null);
		code.put('H', null);
		code.put('I', null);
		code.put('J', null);
		code.put('K', null);
		code.put('L', null);
		code.put('M', null);
		code.put('N', null);
		code.put('O', null);
		code.put('P', null);
		code.put('Q', null);
		code.put('R', null);
		code.put('S', null);
		code.put('T', null);
		code.put('U', null);
		code.put('V', null);
		code.put('W', null);
		code.put('X', null);
		code.put('Y', null);
		code.put('Z', null);
		code.put('1', null);
		code.put('2', null);
		code.put('3', null);
		code.put('4', null);
		code.put('5', null);
		code.put('6', null);
		code.put('7', null);
		code.put('8', null);
		code.put('9', null);
		code.put('0', null);
		code.put(' ', null);
		code.put('?', null);
		code.put('.', null);
		code.put('!', null);
		code.put(':', null);
		code.put('&', null);
		code.put('$', null);
		code.put('%', null);
		code.put(',', null);
		code.put(';', null);
		code.put('/', null);
		code.put('<', null);
		code.put('>', null);
		code.put('-', null);
		code.put('	', null);
		code.put('(', null);
		code.put(')', null);
		code.put('\'', null);


		

		Random rand = new Random(level);
		ArrayList<Integer> x = new ArrayList<Integer>();

		for (int i = 0; i < list.length; i++) {
			x.add(i);
		}
		for (Character key : code.keySet()) {
			int value = rand.nextInt(x.size());
			code.put(key, list[x.get(value)]);
			x.remove(value);

		}
		for (Entry<Character, Character> entry : code.entrySet()) {
			uncode.put(entry.getValue(), entry.getKey());
		}

	}

	public String getEncoded(String str) {
		int len = str.length();
		String set = "";
		Character[] sttr = new Character[len];
		Character[] last = new Character[len];

		for (int i = 0; i < len; i++) {
			sttr[i] = new Character(str.charAt(i));
			last[i] = code.get(sttr[i]);
			set = set + last[i];
		}

		return set;
	}

	public String getMessage(String str) {
		int len = str.length();
		String set = "";
		Character[] sttr = new Character[len];
		Character[] last = new Character[len];

		for (int i = 0; i < len; i++) {
			sttr[i] = new Character(str.charAt(i));
			last[i] = uncode.get(sttr[i]);
			set = set + last[i];
		}

		return set;
	}
	
	public HashMap getAlphabet(){
		return code;
	}


}
