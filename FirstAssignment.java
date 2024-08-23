/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Kayden Yan
 *	@since	August 23, 2024
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	GLabel s2 = new GLabel("First, right after school, I", 10, 40);
    	GLabel s3 = new GLabel("decided to take a long break and through", 10, 60);
    	GLabel s4 = new GLabel("the first month, I slept until 1 everyday", 10, 80);
    	GLabel s5 = new GLabel("and I lazed around the house watching youtube", 10, 100);
    	GLabel s6 = new GLabel("I finally decided to be productive a month in", 10, 120);
    	GLabel s7 = new GLabel("and I started studying some material for java and math", 10, 140);
    	GLabel s8 = new GLabel("and I was taking a physics course for my physics class", 10, 160);
    	GLabel s9 = new GLabel("In July, I went to Orlando to play AAU volleyball", 10, 180);
    	GLabel s10 = new GLabel("And after the tournament was done, which took four days", 10, 200);
    	GLabel s11 = new GLabel("me and my family went on a cruise in Europe", 10, 220);
    	GLabel s12 = new GLabel("and we went to Italy, Greece, and Croatia", 10, 240);
    	GLabel s13 = new GLabel("And once I got back home, I decided to code a game with a few friends", 10, 260);
    	GLabel s14 = new GLabel("and I went back to volleyball, and we had tryouts", 10, 280);
    	GLabel s15 = new GLabel("Then school finally started. (7/10) summer", 10, 300);
    	
    	s1.setFont(f);
    	s2.setFont(f);
    	s3.setFont(f);
    	s4.setFont(f);
    	s5.setFont(f);
    	s6.setFont(f);
    	s7.setFont(f);
    	s8.setFont(f);
    	s9.setFont(f);
    	s10.setFont(f);
    	s11.setFont(f);
    	s12.setFont(f);
    	s13.setFont(f);
    	s14.setFont(f);
    	s15.setFont(f);
    	
    	add(s1);
    	add(s2);
    	add(s3);
    	add(s4);
    	add(s5);
    	add(s6);
    	add(s7);
    	add(s8);
    	add(s9);
    	add(s10);
    	add(s11);
    	add(s12);
    	add(s13);
    	add(s14);
    	add(s15);
    	    	
    	//	Continue adding lines until you have 12 to 15 lines
    	
    }
    
}
