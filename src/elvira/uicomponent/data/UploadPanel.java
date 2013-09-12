package elvira.uicomponent.data;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class UploadPanel extends JPanel
{
	private final JPanel northPanel = new JPanel();
	private final JPanel buttonPanel = new JPanel();
	private final JPanel namePanel = new JPanel();
	private final JPanel filePanel = new JPanel();
	private final JPanel typePanel = new JPanel();
	private final JButton uploadButton = new JButton("Upload");

	/**
	 * Create the panel.
	 */
	public UploadPanel()
	{
		setLayout(new BorderLayout(0, 0));
		
		add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		flowLayout.setVgap(1);
		flowLayout.setHgap(3);
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		northPanel.add(buttonPanel);
		uploadButton.setFont(new Font("Dialog", Font.PLAIN, 12));
		uploadButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		uploadButton.setPreferredSize(new Dimension(50, 22));
		
		buttonPanel.add(uploadButton);
		FlowLayout flowLayout_1 = (FlowLayout) namePanel.getLayout();
		flowLayout_1.setVgap(1);
		flowLayout_1.setHgap(3);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		
		northPanel.add(namePanel);
		FlowLayout flowLayout_2 = (FlowLayout) filePanel.getLayout();
		flowLayout_2.setVgap(1);
		flowLayout_2.setHgap(3);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		
		northPanel.add(filePanel);
		FlowLayout flowLayout_3 = (FlowLayout) typePanel.getLayout();
		flowLayout_3.setVgap(1);
		flowLayout_3.setHgap(3);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		
		northPanel.add(typePanel);

	}

}
