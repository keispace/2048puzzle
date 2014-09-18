package event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//윈도우 창 관련 이벤트 핸들러.
public class KEventHandler extends KeyAdapter{ 
	static char keyi;

	public void keyPressed(KeyEvent e) {//키가 눌렸을 때
		//상하좌우 판별식 들어가야 함.
		if(e.getKeyCode()==KeyEvent.VK_LEFT){// 왼쪽 방향키를 누르면
			keyi = 'a';
		}else if(e.getKeyCode()==KeyEvent.VK_UP){
			keyi = 'w';
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN){
			keyi = 's';
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			keyi = 'd';
		}else{
			return;
		}
			
		event.move();

	}
}

