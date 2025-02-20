package com.tablecount.dao;

import java.util.ArrayList;

import com.tablecount.model.TableCountModel;

public interface TableCountDao {

	int insert(TableCountModel tableCountModel);
	ArrayList<TableCountModel> fetchStatus();
	int truncate();
	int insertByTableNumber(TableCountModel tableCountModel);
}
