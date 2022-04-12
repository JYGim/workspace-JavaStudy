package kr.co.ezenac.collabration;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void subwayInfo() {
		System.out.println(lineNumber +"번 지하철 승객은 "+ passengerCount +"명이고, 수입은"+
	                       money + "원 입니다." );
	}
}
