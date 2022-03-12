//14-02-2022
package com.sa.sampleexamples;
/* Common Xpath for all languages same I mentioned in Demo24 file.
*/
public class Demo83 {
	public static void main(String[] args) throws InterruptedException {
		String[] all_lan= {"ಕನ್ನಡ","தமிழ்","हिन्दी"};
		
		for (String lan : all_lan) {
			String xp="//a[text()='"+lan+"']";
			System.out.println(xp);
		}
			
	}
}