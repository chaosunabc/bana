package org.bana.common.util.office.config;

import java.util.List;
import java.util.Map;

/**
 * @author 导入一个流程时的excel配置
 *
 */
public interface ExcelUploadConfig extends ExcelConfig{

	/**
	 * @param colName
	 * @return
	 */
	String getMutiConfigNameUseColName(String colName);

}
