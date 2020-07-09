public class Hello {
	public static void main(String[] args) {
		/*
		 * int x = 4; if (x == 5) { if (x >= 5) {
		 * System.out.println("x is greater than you"); } else {
		 * System.out.println("smaller x chomu hia"); }
		 * 
		 * }
		 */
		/*
		 * String name = "channD"; switch (name.toLowerCase()) {
		 * 
		 * case "channd":
		 * 
		 * System.out.println("value of x is a "); break; case "editor":
		 * System.out.println("value of x is b"); break; case "team":
		 * System.out.println("value is c"); break; default:
		 * System.out.println("value is other man..!"); break;
		 * 
		 * }
		 */
		/*
		 * int isprime=25; int N=0;
		 * 
		 * for(int i=2;;) { if(isprime % i == 0) N++; if(i > 50) { break; } i++;
		 * 
		 * } if(N==1) System.out.println("prime"); else System.out.println("not prime");
		 * 
		 */
		/*
		 * for(int i=1,j=1;i<=10 || j<=10;i++,j++) {
		 * 
		 * j++; System.out.println("i= "+i + " j= " + j); }
		 */
		/*int i = 1, j = 1;
		do {
			i++;
			j++;
			System.out.println("i =" + i + "j= " + j);
		} while (i < 10 || j < 10);
		*/
	/*for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print("@");
		}
		System.out.println();
	}*/
		
		/*float x = 10.2f % 3 ;
		System.out.println(x);
	*/
	
		int value=1234;
		int sumofdigits=0;
		while(true) {
			sumofdigits+= value % 10;
			value=value/10;
			if(value<=10) {
				break;
			}
					
		}
		sumofdigits+=value;
		System.out.println("sum is = "+sumofdigits);
		
		
	}
}
