package com.test.duplicate;

/**
 * 
 * @author Suraj_Badhe
 *
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		int [] arry = {8,6,2,3,8};
		
		Integer duplicateNum =  CommonUtil.findDuplicateInArray(arry);
		if(duplicateNum != null) {
			System.out.println("Duplicate number : === "+ duplicateNum);
		}
		
		
		
	}

}
