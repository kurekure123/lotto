package com.lotto.web.lottoservice;

import java.util.List;

import com.lotto.web.lottobean.LottoBean;

public interface LottoService {
	
	// public void makeRow();
	public void CreateLottos(LottoBean bean);
	public List<LottoBean> list();
}
