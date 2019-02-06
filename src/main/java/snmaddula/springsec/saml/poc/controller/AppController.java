package snmaddula.springsec.saml.poc.controller;

import java.security.Principal;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	public String showView() {
		return "home";
	}

	@ModelAttribute("username")
	public String username() {
		try {
			Principal principal = (Principal) SecurityContextHolder.getContext().getAuthentication();
			return principal.getName();
		} catch (AuthenticationCredentialsNotFoundException ex) {
			return null;
		}
	}
}
