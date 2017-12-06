package com.test.abstraction;

public class BuyingShowTickets {
	static int waitingTime(int[] tickets,int p){
		int seconds=0;
		while(tickets[p]!=0){
		for(int i=0;i<tickets.length;i++){
			if(tickets[p]==0){
				break;
			}else{
				if(tickets[i]==0){					
					continue;
				}else{
					tickets[i]=tickets[i]-1;
					seconds=seconds+1;
				}
			}
		}		
		}
		
		return seconds;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tickets[]=new int[]{2,6,3,4,5};
		int p=2;
		System.out.println(waitingTime(tickets, p));

	}

}
