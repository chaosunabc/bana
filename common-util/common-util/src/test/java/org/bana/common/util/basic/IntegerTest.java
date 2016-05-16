/**
* @Company 青鸟软通   
* @Title: IntegerTest.java 
* @Package org.bana.common.util.basic 
* @author Liu Wenjie   
* @date 2015-10-19 下午2:16:39 
* @version V1.0   
*/ 
package org.bana.common.util.basic;

import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: IntegerTest 
 * @Description: 测试integer问题
 *  
 */
public class IntegerTest {

	@Test
	public void testEqual(){
		System.out.println(new Integer(2) == 2);
	}
	
	@Test
	public void testDate(){
		System.out.println(DateUtil.toString(new Date(1445592744000l),"yyyy-MM-dd HH:mm:ss"));
	}
}
