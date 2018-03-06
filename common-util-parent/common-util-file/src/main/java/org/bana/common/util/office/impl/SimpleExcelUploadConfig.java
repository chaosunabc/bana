package org.bana.common.util.office.impl;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.bana.common.util.office.config.ColumnConfig;
import org.bana.common.util.office.config.ExcelUploadConfig;

/**
 * @author Liu Wenjie
 * 一个简单的excelUploadConfig对象，为了传递配置信息存在
 */
public class SimpleExcelUploadConfig extends SimpleExcelConfig implements ExcelUploadConfig{

	private static final long serialVersionUID = -5913182476925522636L;
	
	@Override
	public String getMutiConfigNameUseColName(String colName) {
		if(this.mutiTitleMap != null){
			Set<Entry<String, List<ColumnConfig>>> entrySet = mutiTitleMap.entrySet();
			for (Entry<String, List<ColumnConfig>> entry : entrySet) {
				List<ColumnConfig> mutiTilte = entry.getValue();
				for (ColumnConfig columnConfig : mutiTilte) {
					if(columnConfig.getName().equals(colName)){
						return entry.getKey();
					}
				}
			}
		}
		return null;
	}

}
