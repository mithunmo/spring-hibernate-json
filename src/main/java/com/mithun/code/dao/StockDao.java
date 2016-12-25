package com.mithun.code.dao;


import com.mithun.code.model.Stock;

public interface StockDao {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);

}