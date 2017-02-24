/**
* @Company ������ͨ   
* @Title: FileUtilTest.java 
* @Package org.bana.common.util.basic 
* @author Liu Wenjie   
* @date 2014-10-25 ����9:44:19 
* @version V1.0   
*/ 
package org.bana.common.util.basic;

import java.io.File;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: �ļ����ɹ��ߵĲ��Է��� 
 *  
 */
@Ignore
public class FileUtilTest {
	private File targetFile;
	
	@Before
	public void before(){
		targetFile = new File("D:/test/fileUtilTest.txt");
	}

	/**
	 * Test method for {@link org.bana.common.util.basic.FileUtil#generateFile(java.io.File, java.lang.String)}.
	 */
	@Test
	public void testGenerateFile() {
		String fileContent = "���������ļ����ݵ����⡣\n\r���к���ӵ�����";
		FileUtil.generateFile(targetFile, fileContent);
	}

	/**
	 * Test method for {@link org.bana.common.util.basic.FileUtil#appendFile(java.io.File, java.lang.String)}.
	 */
	@Test
	public void testAppendFile() {
		String fileContent = "����׷���ļ����ݵ����⡣\n\r���к���ӵ�����";
		FileUtil.appendFile(targetFile, fileContent);
	}

}
