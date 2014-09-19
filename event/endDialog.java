package event;

import game.index;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class endDialog extends Dialog implements ActionListener{
	private String msgg,msgv, msgf;
	private Button b1;
	Panel p1;
	public endDialog(Frame fieldT, String msg) {
		super(fieldT,msg,true);
		msgv="Victory!!";
		msgf=new String("Failed...");
		msgg = "score: ";
		b1= new Button("Game Over");
		b1.addActionListener(this);
	}
	public void displayUI(){
		setSize(150,100);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); // 화면 픽셀 계산
		Dimension frm = super.getSize();//창 크기 계산

		int xpos = (int)(screen.getWidth() / 2 - frm.getWidth() / 2); // 창 중앙 위치 계산
		int ypos = (int)(screen.getHeight() / 2 - frm.getHeight() / 2);

		Label l1 = new Label(msgv);
		Label l2 = new Label(msgf);
		Label l3 = new Label(msgg+index.score);
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.CENTER);
		l3.setAlignment(Label.CENTER);
		
		if(event.fin==1)
			add("North", l1);
		else 
			add("North", l2);
		add("Center", l3);
		p1 = new Panel();
		p1.setLayout(new FlowLayout());
		p1.add(b1);
		add("South",p1);
		setLocation(xpos, ypos);
		setResizable(false);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
