package event;

import game.*;

public class event{
	public static int fin;
	static void move(){//이동처리
		if(KEventHandler.keyi =='a'){ //좌
			for(int k=1;k<index.area.length;k++){//모든 숫자를 0없이 밀착
				for(int i=0;i<index.area.length;i++){
					if(index.area[i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i][k-1]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[l][j-1]==0){
							index.area[l][j-1]=index.area[l][j];
							index.area[l][j]=0;
							j--;
							if(j==0)
								break;
						}
					}
				}
			}			
			for(int k=1;k<index.area.length;k++){
				for(int i=0;i<index.area.length;i++){
					if(index.area[i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i][k]==index.area[i][k-1]){//같으면 합산
						index.area[i][k-1]*=2;
						index.area[i][k]=0;
					}
				}
			}
			for(int k=1;k<index.area.length;k++){//모든 숫자를 0없이 밀착
				for(int i=0;i<index.area.length;i++){
					if(index.area[i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i][k-1]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[l][j-1]==0){
							index.area[l][j-1]=index.area[l][j];
							index.area[l][j]=0;
							j--;
							if(j==0)
								break;
						}
					}
				}
			}
		}else if(KEventHandler.keyi =='d'){ //우
			for(int k=1;k<index.area.length;k++){//모든 숫자를 0없이 밀착
				for(int i=0;i<index.area.length;i++){
					if(index.area[i][3-k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i][3-k+1]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[l][3-j+1]==0){
							index.area[l][3-j+1]=index.area[l][3-j];
							index.area[l][3-j]=0;
							j--;
							if(j==0)
								break;
						}
					}
				}
			}
			for(int k=1;k<index.area.length;k++){
				for(int i=0;i<index.area.length;i++){
					if(index.area[i][3-k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i][3-k]==index.area[i][3-k+1]){//같으면 합산
						index.area[i][3-k+1]*=2;
						index.area[i][3-k]=0;
					}
				}
			}
			for(int k=1;k<index.area.length;k++){//모든 숫자를 0없이 밀착
				for(int i=0;i<index.area.length;i++){
					if(index.area[i][3-k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i][3-k+1]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[l][3-j+1]==0){
							index.area[l][3-j+1]=index.area[l][3-j];
							index.area[l][3-j]=0;
							j--;
							if(j==0)
								break;
						}
					}
				}
			}
		}else if(KEventHandler.keyi =='w'){//위
			for(int i=1;i<index.area.length;i++){//모든 숫자를 0없이 밀착
				for(int k=0;k<index.area.length;k++){
					if(index.area[i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i-1][k]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[l-1][j]==0){
							index.area[l-1][j]=index.area[l][j];
							index.area[l][j]=0;
							l--;
							if(l==0)
								break;
						}
					}
				}
			}
			for(int i=1;i<index.area.length;i++){
				for(int k=0;k<index.area.length;k++){
					if(index.area[i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i][k]==index.area[i-1][k]){//같으면 합산
						index.area[i-1][k]*=2;
						index.area[i][k]=0;
					}
				}
			}
			for(int i=1;i<index.area.length;i++){//모든 숫자를 0없이 밀착
				for(int k=0;k<index.area.length;k++){
					if(index.area[i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[i-1][k]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[l-1][j]==0){
							index.area[l-1][j]=index.area[l][j];
							index.area[l][j]=0;
							l--;
							if(l==0)
								break;
						}
					}
				}
			}
		}else if(KEventHandler.keyi =='s'){//아래
			for(int i=1;i<index.area.length;i++){//모든 숫자를 0없이 밀착
				for(int k=0;k<index.area.length;k++){
					if(index.area[3-i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[3-i+1][k]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[3-l+1][j]==0){
							index.area[3-l+1][j]=index.area[3-l][j];
							index.area[3-l][j]=0;
							l--;
							if(l==0)
								break;
						}
						
					}
					
				}
				
			}
			for(int i=1;i<index.area.length;i++){
				for(int k=0;k<index.area.length;k++){
					if(index.area[3-i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[3-i][k]==index.area[3-i+1][k]){//같으면 합산
						index.area[3-i+1][k]*=2;
						index.area[3-i][k]=0;
					}
					
				}
				
			}
			for(int i=1;i<index.area.length;i++){//모든 숫자를 0없이 밀착
				for(int k=0;k<index.area.length;k++){
					if(index.area[3-i][k]==0){//기준이 0이면 넘어감.
						continue;
					}
					if(index.area[3-i+1][k]==0){//앞값이 0이면 계속 이동
						int j=k, l=i;
						while(index.area[3-l+1][j]==0){
							index.area[3-l+1][j]=index.area[3-l][j];
							index.area[3-l][j]=0;
							l--;
							if(l==0)
								break;
						}
					}
				}
			}
		}
		
		for(int i=0;i<index.area.length;i++){
		  for(int j=0;j<index.area.length;j++){
		    if(index.score<index.area[i][j])
		    index.score=index.area[i][j];
		  }
		}
		endEvent.finalend();
	}




}
