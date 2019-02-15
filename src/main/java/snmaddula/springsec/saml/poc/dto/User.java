package snmaddula.springsec.saml.poc.dto;

import lombok.Data;

@Data
public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String userType;
}
