package com.mithun.code.bo;
import com.mithun.code.model.Stock;

public interface StockBo {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
}