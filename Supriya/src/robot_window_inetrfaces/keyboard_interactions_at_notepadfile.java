package robot_window_inetrfaces;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class keyboard_interactions_at_notepadfile 
{

	public static void main(String[] args) throws IOException,InterruptedException,AWTException
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_A);
		
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_H);
		
		
		
		
		
		
		
		
	}

}
