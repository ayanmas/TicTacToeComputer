import java.util.Scanner;

public class TicTacToeComputer {

	String a1 = " ";
	String a2 = " ";
	String a3 = " ";
	String b1 = " ";
	String b2 = " ";
	String b3 = " ";
	String c1 = " ";
	String c2 = " ";
	String c3 = " ";
	boolean moved = false;
	int z = 1;
	boolean isPlaying = true;
	Scanner scanner = new Scanner(System.in);
	int a = 1;
	int b = 1;
	int c = 1;
	int d = 1;
	int e = 1;
	int f = 1;
	int g = 1;
	int h = 1;
	int i = 1;
	int j = 1;
	int k = 1;
	int l = 1;
	int m = 1;
	int n = 1;
	int o = 1;
	int p = 1;
	int q = 1;
	int r = 1;
	int s = 1;
	int t = 1;
	int u = 1;
	int v = 1;
	int w = 1;
	
	public TicTacToeComputer() {
		
		
		System.out.println(" \t1\t2\t3\r\na\t" + a1 + "\t" + a2 + "\t" + a3 + "\r\nb\t" + b1 + "\t" + b2 + "\t" + b3 + "\r\nc\t" + c1 + "\t" + c2 + "\t" + c3);
		while (isPlaying == true) {
			checkTie();
			checkWin();
			String input = scanner.nextLine();
			moved = false;
			if (input.equals("a1") && a1 != "X" && a1 != "O") { // plays the move
				a1 = "X";
			}
			else if (input.equals("a2") && a2 != "X" && a2 != "O") {
				a2 = "X";
			}
			else if (input.equals("a3") && a3 != "X" && a3 != "O") {
				a3 = "X";
			}
			else if (input.equals("b1") && b1 != "X" && b1 != "O") {
				b1 = "X";
			}
			else if (input.equals("b2") && b2 != "X" && b2 != "O") {
				b2 = "X";
			}
			else if (input.equals("b3") && b3 != "X" && b3 != "O") {
				b3 = "X";
			}
			else if (input.equals("c1") && c1 != "X" && c1 != "O") {
				c1 = "X";
			}
			else if (input.equals("c2") && c2 != "X" && c2 != "O") {
				c2 = "X";
			}
			else if (input.equals("c3") && c3 != "X" && c3 != "O") {
				c3 = "X";
			}
			else {
				System.out.println("Something went wrong, please try again");
				continue;
			}
			
			if (b2 == "X") { // starting so that middle is forced
				if (s == 1) {
					a1 = "O";
					s = 2;
					z = 2;
					printBoard();
					continue;
				}
			}
			if (a1 == "X" || a2 == "X" || a3 == "X" || b1 == "X" || b3 == "X" || c1 == "X" || c2 == "X" || c3 == "X") {
				if (z == 1) {
					z = 2;
					b2 = "O";
					printBoard();
					continue;
				}
			}
			
			if (a1 == "X" && a2 == "X") { // a horizontal
				if (a == 1) {
					a3 = "O";
					a = 2;
					moved = true;
				}
			}
			if (a1 == "X" && a3 == "X") {
				if (b == 1) {
					a2 = "O";
					b = 2;
					moved = true;
				}
			}
			if (a2 == "X" && a3 == "X") {
				if (c == 1) {
					a1 = "O";
					c = 2;
					moved = true;
				}
			}
			if (b1 == "X" && b2 == "X") { // b horizontal
				if (d == 1) {
					b3 = "O";
					d = 2;
					moved = true;
				}
			}
			if (b1 == "X" && b3 == "X") {
				if (e == 1) {
					b2 = "O";
					e = 2;
					moved = true;
				}
			}
			if (b2 == "X" && b3 == "X") {
				if (f == 1) {
					b1 = "O";
					f = 2;
					moved = true;
				}
			}
			if (c1 == "X" && c2 == "X") { // c horizontal
				if (g == 1) {
					c3 = "O";
					g = 2;
					moved = true;
				}
			}
			if (c1 == "X" && c3 == "X") {
				if (h == 1) {
					c2 = "O";
					h = 2;
					moved = true;
				}
			}
			if (c2 == "X" && c3 == "X") {
				if (i == 1) {
					c1 = "O";
					i = 2;
					moved = true;
				}
			}
			if (a1 == "X" && b1 == "X") { // 1 vertical
				if (j == 1) {
					c1 = "O";
					j = 2;
					moved = true;
				}
			}
			if (a1 == "X" && c1 == "X") {
				if (k == 1) {
					b1 = "O";
					k = 2;
					moved = true;
				}
			}
			if (b1 == "X" && c1 == "X") {
				if (l == 1) {
				a1 = "O";
				l = 2;
				moved = true;
				}
			}
			if (a2 == "X" && b2 == "X") { // 2 vertical
				if (m == 1) {
					c2 = "O";
					m = 2;
					moved = true;
				}
			}
			if (a2 == "X" && c2 == "X") {
				if (n == 1) {
					b2 = "O";
					n = 2;
					moved = true;
				}
			}
			if (b2 == "X" && c2 == "X") {
				if (o == 1) {
					a2 = "O";
					o = 2;
					moved = true;
				}
			}
			if (a3 == "X" && b3 == "X") { // 3 vertical
				if (p == 1) {
					c3 = "O";
					p = 2;
					moved = true;
				}
			}
			if (a3 == "X" && c3 == "X") {
				if (q == 1) {
					b3 = "O";
					q = 2;
					moved = true;
				}
			}
			if (b3 == "X" && c3 == "X") {
				if (r == 1) {
					a3 = "O";
					r = 2;
					moved = true;
				}
			}
			if (a1 == "X" && b2 == "X") { // diagonals
				if (t == 1) {
					c3 = "O";
					t = 2;
					moved = true;
				}
			}
			if (c3 == "X" && b2 == "X") {
				if (u == 1) {
					if (a1 != " ") {
						a1 = "O";
						u = 2;
						moved = true;
					}
				}
			}
			if (c1 == "X" && b2 == "X") {
				if (v == 1) {
					a3 = "O";
					v = 2;
					moved = true;
				}
			}
			if (a3 == "X" && b2 == "X") {
				if (w == 1) {
					c1 = "O";
					w = 2;
					moved = true;
				}
			}
			if (moved == false) {
				if (a1 == " ") { // stuff to fill it in cause I dont wanna figure out every possibilty
					a1 = "O";
					printBoard();
					continue;
				}
				if (a2 == " ") {
					a2 = "O";
					printBoard();
					continue;
				}
				if (a3 == " ") {
					a3 = "O";
					printBoard();
					continue;
				}
				if (b1 == " ") {
					b1 = "O";
					printBoard();
					continue;
				}
				if (b2 == " ") {
					b2 = "O";
					printBoard();
					continue;
				}
				if (b3 == " ") {
					b3 = "O";
					printBoard();
					continue;
				}
				if (c1 == " ") {
					c1 = "O";
					printBoard();
					continue;
				}
				if (c2 == " ") {
					c2 = "O";
					printBoard();
					continue;
				}
				if (c3 == " ") {
					c3 = "O";
					printBoard();
					continue;
				}
			}
			
			printBoard();
		}
	}
	
	public void printBoard() {
		System.out.println(" \t1\t2\t3\r\na\t" + a1 + "\t" + a2 + "\t" + a3 + "\r\nb\t" + b1 + "\t" + b2 + "\t" + b3 + "\r\nc\t" + c1 + "\t" + c2 + "\t" + c3);
	}
	
	public void checkWin() {
		if (a1 == "O" && a2 == "O" && a3 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
		if (b1 == "O" && b2 == "O" && b3 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
		if (c1 == "O" && c2 == "O" && c3 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
		if (a1 == "O" && b1 == "O" && c1 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
		if (a2 == "O" && b2 == "O" && c2 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
		if (a3 == "O" && b3 == "O" && c3 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
		if (a1 == "O" && b2 == "O" && c3 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
		if (a3 == "O" && b2 == "O" && c1 == "O") {
			System.out.println("Computer wins");
			playAgain();
		}
	}
	
	public void playAgain() {
		System.out.println("Play again?");
		String yesno = scanner.nextLine();
		if (yesno.equals("yes") || yesno.equals("y")) {
			a = 1;
			b = 1;
			c = 1;
			d = 1;
			e = 1;
			f = 1;
			g = 1;
			h = 1;
			i = 1;
			j = 1;
			k = 1;
			l = 1;
			m = 1;
			n = 1;
			o = 1;
			p = 1;
			q = 1;
			r = 1;
			s = 1;
			t = 1;
			u = 1;
			v = 1;
			w = 1;
			z = 1;
			a1 = " ";
			a2 = " ";
			a3 = " ";
			b1 = " ";
			b2 = " ";
			b3 = " ";
			c1 = " ";
			c2 = " ";
			c3 = " ";
			printBoard();
		}
		else {
			isPlaying = false;
		}
		
	}
	
	public void checkTie() {
		if (a1 != " " && a2 != " " && a3 != " " && b1 != " " && b2 != " " && b3 != " " && c1 != " " && c2 != " " && c3 != " ") {
			System.out.println("It's a tie");
			playAgain();
		}
	}
	
	public static void main(String[] args) {
		new TicTacToeComputer();
	}
}
