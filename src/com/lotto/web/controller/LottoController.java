package com.lotto.web.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.lotto.web.lottoServiceImpl.LottoServiceImpl;
import com.lotto.web.lottobean.LottoBean;
import com.lotto.web.lottoservice.LottoService;

public class LottoController {
	public static void main(String[] args) {
		LottoService service = new LottoServiceImpl();
		LottoBean bean = new LottoBean();
		while(true) {
			switch(Integer.parseInt(JOptionPane.showInputDialog(
					"[Menu] 0. 종료, 1. 입금, 2. 화면보기, 3. 출력"))) {
			case 0 : 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case 1 : 
				bean.setMoney(Integer.parseInt(JOptionPane.showInputDialog("구매하려는 금액 입력")));
				service.CreateLottos(bean);
				break;
				
			case 2 :
				String message = service.list().toString();
				JOptionPane.showMessageDialog(null, service.list());
				break;
				
			case 3 :
				File f = new File("C:\\Users\\1027\\jse\\eclipse\\workspace\\lotto\\lotto.txt");
				BufferedWriter bw = null;
				try {
					bw = new BufferedWriter(new FileWriter(f));
					bw.write("로또번호 : 1 2 3 4 5 6");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						bw.flush(); // 물내려
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				} 
				// try catch 는 
				break;
				default :
					break;
			}
		}
	}
}
