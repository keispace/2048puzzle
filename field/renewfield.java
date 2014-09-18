package field;

import game.getNum;

public class renewfield {
	public static void renew(){
		for(int i =0;i<4;i++){
			for(int j=0;j<4;j++){
				fieldT.f1.remove(fieldT.p[i][j]);
			}
		}
		getNum.genNum(4);
		fieldT.Label();
		fieldT.panel();
		for(int i =0;i<4;i++){
			for(int j=0;j<4;j++){
				fieldT.f1.add(fieldT.p[i][j]);
			}
		}
		fieldT.f1.setVisible(true);
		return;
}
}
