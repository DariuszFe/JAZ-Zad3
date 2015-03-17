package com.example.servletjspdemo.domain;

public class User {
	
	private String login;
	private String password;
	private String email;

	private boolean admin;
	private boolean premium;

    public User() {

    }

    public User(String login, String password) {

    }

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    @Override
    public boolean equals(Object obj) {
        if(((User)obj).getLogin().equals(login) && ((User)obj).getPassword().equals(password))
            return true;

        return false;
    }
}
