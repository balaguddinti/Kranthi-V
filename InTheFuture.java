package com.test.abstraction;

public class InTheFuture {
	static int minNum(int A,int K,int P){
		int numDays=0;
		int range=0;
		if(A>K){
			range=A;
		}else {
			range=K;
		}
		for(int i=0;i<range;i++){
			int tmpA=A;
			int tmpK=K;
			tmpA=i*tmpA+P;
			tmpK=i*tmpK;
			if(tmpK>tmpA){
				numDays=i;
				break;
			}
		}
		if(numDays==0){
			numDays=-1;
		}
		return numDays;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=6;
		int K=5;
		int P=1;
		int numDays=minNum(A, K, P);
		System.out.println(numDays);

	}

}
