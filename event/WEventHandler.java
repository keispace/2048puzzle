package event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//윈도우 창 관련 이벤트 핸들러.
public class WEventHandler  implements WindowListener{
	public void windowActivated(WindowEvent e) {	}
	public void windowClosed(WindowEvent e) {	}
	public void windowClosing(WindowEvent e) {	//닫기 버튼
		e.getWindow().setVisible(false); //화면에 창이 보이지 않게 함.
		e.getWindow().dispose(); //메모리에서 제거함.
		System.exit(0);//프로그램 종료
	}
	public void windowDeactivated(WindowEvent e) {	}
	public void windowDeiconified(WindowEvent e) {	}
	public void windowIconified(WindowEvent e) {	}
	public void windowOpened(WindowEvent e) {	}
}
