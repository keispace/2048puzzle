package game;

import java.util.Random;

public class getNum{
	public static void genNum(int GameSize){
		Random r = new Random();
		boolean flg=false;
		while(true){
			int x = (int)(r.nextInt(GameSize));//0~필드사이즈까지.
			int y = (int)(r.nextInt(GameSize));

			if(index.area[x][y]==0){
				index.area[x][y]= (r.nextInt(2)+1)*2;
				return;
			}else{
				for(int i=0;i<index.area.length;i++){
					for(int j=0;j<index.area.length;j++){
						if(index.area[i][j]==0)
							flg=true;
					}
				}
			}
			if(flg)
				continue;
			else
				return;
		}
	}
}