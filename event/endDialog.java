package event;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class endDialog extends Dialog implements ActionListener{
	private String msgv, msgf;
	private Button b1;
	Panel p1;
	public endDialog(Frame fieldT, String msg) {
		super(fieldT,msg,true);
		msgv="승리하셨습니다!";
		msgf="패배하셨습니다!";
		b1= new Button("게임 종료");
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
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.CENTER);
		
		if(event.fin==1)
			add("North", l1);
		else 
			add("North", l2);
		p1 = new Panel();
		p1.setLayout(new FlowLayout());
		p1.add(b1);
		add(p1);
		setLocation(xpos, ypos);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
