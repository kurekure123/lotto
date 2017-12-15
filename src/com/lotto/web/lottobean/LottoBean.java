package com.lotto.web.lottobean;

public class LottoBean {
	private int money; 
	private String num;
	
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}
	@Override
	public String toString() {
		return " 로또번호 " + num;
	}
}
