package com.syntax.class04;

public class NestingElseIf {
	public static void main(String[] args) {
		// if student completed the quiz we will check the score
		// if score > 90--> Great job!
		// if score > 80--> Well done!
		// if score > 70--> Just passed!
		// otherwise --> You failed!
		// if student didn't complete the quiz, Please finish the quiz!

		boolean quiz = true;
		int score = 97;

		if (quiz) {
			if (score > 90) {
				System.out.println("Great job!");
			} else if (score > 80) {
				System.out.println("Well done");
			} else if (score > 70) {
				System.out.println("Just passed");
			} else {
				System.out.println(" You failed!");
			}

		} else {
			System.out.println("Please finish your quiz!");
		}
		
		// boolean a=true;
		// boolean b=true;
		//boolean c= 
		// if (a) {
		// outer if code...
		//   if (b){
		//    inner code...
		//   }else if (c) {
		//     inner else if....
		//   } else {
		//      inner else code...
		//   } 
		//} else {
		//outer else code...
		//}

	}

}
