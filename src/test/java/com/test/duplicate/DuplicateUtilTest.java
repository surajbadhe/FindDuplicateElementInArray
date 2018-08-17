package com.test.duplicate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * @author Suraj_Badhe
 *
 */
public class DuplicateUtilTest {
	
	@Test
	public void testGetDuplicte() {
		int [] arry = {7,1,3,9,2};
		Integer duplicate =  CommonUtil.findDuplicateInArray(arry);
		assertEquals(duplicate.intValue(), 3);
	}
	
	@Test
	public void testFailedDuplicte() {
		int [] arry = {4,1,3,6,2};
		Integer duplicate =  CommonUtil.findDuplicateInArray(arry);
		assertNull(duplicate);
	}
	
	@Test
	public void testNotSameDuplicte() {
		int [] arry = {1,3,2,1,4};
		Integer duplicate =  CommonUtil.findDuplicateInArray(arry);
		assertNotSame(duplicate.intValue(), 5);
	}
	
	@Test
	public void testNotNullDuplicte() {
		int [] arry = {2,3,4,1,3};
		Integer duplicate =  CommonUtil.findDuplicateInArray(arry);
		assertNotNull(duplicate);
	}

}
