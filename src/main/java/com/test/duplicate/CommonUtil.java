package com.test.duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Suraj_Badhe
 *
 */
public class CommonUtil {

	public static Integer findDuplicateInArray(final int[] arr) {
		final Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				return arr[i];
			}
		}
		return null;

	}

}
