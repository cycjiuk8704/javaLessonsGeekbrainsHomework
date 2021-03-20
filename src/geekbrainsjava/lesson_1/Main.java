package geekbrainsjava.lesson_1;

//part 1
public class Main {

//  part 2
    public static void main(String[] args) {
		short varShort = 159;
		int varInt = 856;
		long varLong = 945785238L;
		float varFloat = 34.65f;
		double varDouble = 1.347;
		char varChar = '*';
		boolean varBoolean = false;
	}
//	part 3
    public static int calc(int a, int b, int c, int d){
        return a * (b + (c/d));
        }

//    part 4
    public static boolean range(int a, int b){
    	if (((a + b) >=10) && ((a + b) <= 20)) {
    		return true;
		} else {
    		return false;
		}
	}

//	part 5
	public static void positiveNegative(int a){
    	if(a >= 0){
    		System.out.println("Число " + a + " положительно");
		} else {
			System.out.println("Число " + a + " отрицательно");
		}
	}

//	part 6
	public static boolean isNegative(int a){
		if (a < 0) {
			return true;
		} else {
			return false;
		}
	}

//	part 7
	public static void helloName(String name){
    	System.out.println("Привет, " + name + "!");
	}

//	part 8
	public static void leapYear (int yearGiven){
    	if( (yearGiven %4 == 0) ^ (yearGiven %100 == 0) ^ (yearGiven %400 == 0) ){
    		System.out.println("Год " + yearGiven + " - високосный");
		} else System.out.println("Год " + yearGiven + " - не високосный");
	}
}
