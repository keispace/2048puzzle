package field;
import java.awt.*;

import event.KEventHandler;
import event.WEventHandler;
import game.index;

public class fieldT {
	public static Frame f1 = new Frame();
	static Panel[][] p = new Panel[4][4];
	static Label[][] l = new Label[4][4];
	
	public static void Label(){ 	
		
		for(int i=0;i<4;i++){  //라벨 생성
			for(int j=0;j<4;j++){
				l[i][j] = new Label(String.valueOf(index.area[i][j]));
				l[i][j].setFont(new Font("arial",Font.BOLD,30));
				l[i][j].setAlignment(Label.CENTER);
			}
		}
	}
	public static void panel(){
		
		for(int i=0;i<4;i++){  //패널에 라벨 넣기
			for(int j=0;j<4;j++){
				p[i][j] = new Panel();//레이아웃 정리 및 초기화
				
				p[i][j].add("Center",l[i][j]);
			}
		}
		for(int i=0;i<p.length;i++){		// 패널 패턴 생성. 1차에선 X
			for(int j=0;j<p.length;j++){
				if(i==j || i==j+2 || j==i+2){
					p[i][j].setBackground(Color.LIGHT_GRAY);
				}
			}		
		}
	}
	public static void Field1(){
		fieldT.Label();
		fieldT.panel();
		f1.setSize(400, 400);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); // 화면 픽셀 계산
		Dimension frm = f1.getSize();//창 크기 계산

		int xpos = (int)(screen.getWidth() / 2 - frm.getWidth() / 2); // 창 중앙 위치 계산
		int ypos = (int)(screen.getHeight() / 2 - frm.getHeight() / 2);


		f1.setLayout(new GridLayout(4, 4));// 프레임 레이아웃
		f1.setBackground(Color.cyan); //프레임 배경
		f1.addWindowListener(new WEventHandler());
		f1.addKeyListener(new KEventHandler());
		f1.setResizable(false);
		for(int i =0;i<4;i++){
			for(int j=0;j<4;j++){
				f1.add(p[i][j]);
			}
		}
		f1.setLocation(xpos, ypos);
		f1.setVisible(true);
	}
}
