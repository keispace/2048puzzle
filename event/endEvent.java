package event;

import field.renewfield;

public class endEvent {
	static void finalend(){//종료조건 확인/ 처리
		endCheck.finalcheck();
		if(event.fin==1||event.fin==2){//종료조건 달성
			renewfield.renew();//화면갱신.	
			endDialog ed = new endDialog(field.fieldT.f1, "게임 종료");
			ed.displayUI();
		}else if(event.fin ==0){//종료조건 아님
			renewfield.renew();	
			return;
		}
	}
}
