package elvira.uicomponent.data;

import javax.swing.*;

public class Test
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.getContentPane().add(new UploadPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
