package users;

public abstract class User {
String userId ="admin";
String password ="admin";
String loginStatus ="";
abstract boolean verifyUser();
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getLoginStatus() {
	return loginStatus;
}
public void setLoginStatus(String loginStatus) {
	this.loginStatus = loginStatus;
}

}
