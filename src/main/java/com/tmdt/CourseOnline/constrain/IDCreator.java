package com.tmdt.CourseOnline.constrain;

import java.util.UUID;

public interface IDCreator {
	public static String createRandomId() {
		return UUID.randomUUID().toString().split("-")[0];
	}
}
