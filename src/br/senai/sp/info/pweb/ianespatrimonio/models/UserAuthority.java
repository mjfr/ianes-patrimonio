package br.senai.sp.info.pweb.ianespatrimonio.models;

public enum UserAuthority {
	ADMINISTRATOR("Admin"), COMMON("Com");
	
	private final String authority;
	
	private UserAuthority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return this.authority;
	}
}