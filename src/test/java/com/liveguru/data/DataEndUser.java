package com.liveguru.data;

import commons.DataHelper;

public class DataEndUser {

	public static class Register {
		public static String firstName = DataHelper.getData().getFirstName();
		public static String lastName = DataHelper.getData().getLastName();
		public static String email = DataHelper.getData().getEmail();
		public static String passWord = DataHelper.getData().getPassword();
	}

}
