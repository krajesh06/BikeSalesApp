package model;

public class Registration {

		
		private String userName;
		private String usermail_id;
		private String userPassword;
		private String userMobileNumber;
		private static String sessionMail;
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUsermail_id() {
			return usermail_id;
		}
		public void setUsermail_id(String usermail_id) {
			this.usermail_id = usermail_id;
		}
		
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getUserMobileNumber() {
			return userMobileNumber;
		}
		public void setUserMobileNumber(String userMobileNumber) {
			this.userMobileNumber = userMobileNumber;
		}
		public static String getSessionMail() {
			return sessionMail;
		}
		public static void setSessionMail(String sessionMail) {
			Registration.sessionMail = sessionMail;
		}
		
		
	}

