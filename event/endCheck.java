package event;

import game.index;

public class endCheck {
	static void finalcheck(){//종료조건 확인
		event.fin = 0;
		for(int i=0;i<index.area.length;i++){//승리조건 검사.
			for(int j=0;j<index.area.length;j++){
				if(index.area[i][j]==2048){
					event.fin = 1;
					return;
				}
			}
		}
		for(int i=0;i<index.area.length;i++){//미종료 조건 검사.
			for(int j=0;j<index.area.length;j++){
				if(index.area[i][j]==0){
					event.fin = 0;
					return;
				}
			}
		}
		//패배조건 검사.
		for (int i=0; i<index.area.length;i++){
			for(int j=0;j<index.area.length;j++){
				if(i==0 || i==index.area.length-1)
					continue;
				else{
					if(index.area[i][j]==index.area[i+1][j]||
							index.area[i][j]==index.area[i-1][j]||
							index.area[j][i]==index.area[j][i+1]||
							index.area[j][i]==index.area[j][i-1]){
						event.fin=0;
						return;
					}else
						event.fin=2;
				}
			}
		}
		if(event.fin==2)
			return;
	}
}
