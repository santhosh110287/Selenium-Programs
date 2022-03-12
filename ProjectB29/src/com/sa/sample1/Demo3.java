package com.sa.sample1;

/*1. a common var between 2 statements --->k
 *2. for that common var there must be = in 1st statement  -->k
 *3. then in 2nd statement we can replace the  common var with its RHS from 1st statement 
 *4. we can delete 1st statement 
 */
public class Demo3 {
	public static void main(String[] args) {

		int i;
		int j;
		int k;
		i=10;
		j=20;
		/* k=i+j
		 * System.out.println(k);
		 * 
		 */
		System.out.println(i+j);

	}

}












