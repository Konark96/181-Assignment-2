package base;

public class MyInteger {
	private int iValue = 0;

	public MyInteger(int x) {
		iValue = x;
	}

	public int get_iValue() {
		return iValue;
	}

	public boolean isEven() {
		return isEven(iValue);
	}

	public boolean isOdd() {
		return isOdd(iValue);
	}

	public boolean isPrime() {
		return isPrime(iValue);
	}

	public static boolean isEven(int x) {
		if ((x % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int x) {
		return (!isEven(x));
	}

	public static boolean isPrime(int x) {
		if (isEven(x)) {
			return false;
		} else {
			int y = (x / 2) + 1;
			while (y > 1) {
				if ((x % y) == 0) {
					return false;
				}
				y = y - 2;
			}
			return true;
		}
	}

	public static boolean isEven(MyInteger x) {
		if ((x.get_iValue() % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger x) {
		return (!isEven(x));
	}

	public static boolean isPrime(MyInteger x) {
		return isPrime(x.get_iValue());
	}

	public boolean equals(int x) {
		if (x == iValue) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger x) {
		return equals(x.get_iValue());
	}
}
