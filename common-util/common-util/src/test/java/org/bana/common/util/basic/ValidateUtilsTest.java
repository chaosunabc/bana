/**
* @Company ������ͨ   
* @Title: ValidateUtilsTest.java 
* @Package org.bana.common.util.basic 
* @author Liu Wenjie   
* @date 2014-10-21 ����6:19:32 
* @version V1.0   
*/ 
package org.bana.common.util.basic;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: ValidateUtilsTest 
 * @Description: TODO(������һ�仰��������������) 
 *  
 */
public class ValidateUtilsTest {

	/**
	 * Test method for {@link org.bana.common.util.basic.ValidateUtils#isEmail(java.lang.String)}.
	 */
	@Test
	public void testIsEmail() {
		assertTrue(ValidateUtils.isEmail("liuwenjiegod@126.com"));
		assertTrue(ValidateUtils.isEmail("liuwenjiegod@126.com.cn"));
		assertFalse(ValidateUtils.isEmail("liuwenjiego126.com"));
		assertFalse(ValidateUtils.isEmail("l���god@126.com"));
	}

}
