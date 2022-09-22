//$Id$
package programs;

class Palindrome {
	public static boolean isPalindrome(int x) {

		int temp = x;
		int rem = 0;
		boolean flag = false;
		int sum = 0;

		while (x > 0) {

			rem = x % 10;
			sum = rem + (sum * 10);
			x = x / 10;
		}

		if (temp == sum)
			flag = true;

		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(101));
	}

}
