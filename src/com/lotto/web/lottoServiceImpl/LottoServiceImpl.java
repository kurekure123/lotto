package com.lotto.web.lottoServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.lotto.web.lottobean.LottoBean;
import com.lotto.web.lottoservice.LottoService;

public class LottoServiceImpl implements LottoService{
	private List<LottoBean> lottos;
	
	public LottoServiceImpl() {
		lottos = new ArrayList<>();
	}
	/*
	@Override
	public void makeRow() {
		bean = new LottoBean();
		Random r = new Random();
		int res = 0;
		for(int i = 1; i < 6; i++) {
			res = r.nextInt();
			if(i == 0) {
				
			}
		}
	} **/
	
	@Override
	public void CreateLottos(LottoBean bean) {
		LottoBean lotto = null;
		String res = "";
		for(int i =0; i < bean.getMoney()/1000; i++) { 
			lotto = new LottoBean();
			
			lotto.setNum(String.valueOf(createLotto()));
			lottos.add(lotto);
		}
			
			/* int[] t = createLotto();
			res += t[i]+" , ";
			lotto.setNum(res);
			lottos.add(lotto); */
		}
		
			/* String temp = "";
			int[] arr = new int[6];
			for(int j = 0; j < 6; j++) {
				arr[j]= (int)(Math.random()*45)+1;
				// temp += j; // j 대신 랜덤 생성
			}
			for(int j = 0; j < 6; j++) {
				System.out.print(arr[j] + "\t");
			}
			System.out.println();
			lotto.setNum(temp + " \n ");
			lottos.add(lotto);
			// 각각의 값을 하나씩 여섯바퀴 돌려라
			 **/
	
	public int[] createLotto() {
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			int num =(int)(Math.random()*45)+1;
			boolean exist = false;
			for(int j = 0; j <lotto.length; j++) {
				if(num == lotto[j]) {
					exist = true;
					break;
				}
			}
			if(exist) {
				i--;
				continue;
			}else {
				lotto[i]=num;
			}
		}
		Arrays.sort(lotto);
		for(int i = 0; i < 6; i++ ) {
			System.out.print(lotto[i] + "\t");
		}
		return lotto;
	}
	
	@Override
	public List<LottoBean> list() {
		return lottos;
	}
	
}
		/* 
		 * LottoBean bean = null;
		 * switch(money.getMoney()/1000) {
		case 1 :
			for(int i =0; i < 1; i++) { 
			bean.setNum("1 2 3 4 5 6 \n");
			lottos.add(bean);
		}
		break;
		case 2 : 
			for(int i =0; i < 2; i++) { 
				bean.setNum("1 2 3 4 5 6 \n");
				lottos.add(bean);
			}
			break;
		case 3 : 
			for(int i =0; i < 3; i++) { 
				bean.setNum("1 2 3 4 5 6 \n");
				lottos.add(bean);
			}
			break;
		case 4 : 
			for(int i =0; i < 4; i++) { 
				bean.setNum("1 2 3 4 5 6 \n");
				lottos.add(bean);
			}
			break;
		case 5 : 
			for(int i =0; i < 5; i++) { 
				bean.setNum("1 2 3 4 5 6 \n");
				lottos.add(bean);
			}
			break;
		default :
			break;
		}  * */

/* for(){
 *  bean.setNum("1 2 3 4 5 6 ");
 *  lottos.add(bean);
 * }
 * 
 * */
