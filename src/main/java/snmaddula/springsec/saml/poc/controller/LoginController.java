package snmaddula.springsec.saml.poc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.saml.metadata.MetadataManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@Autowired
	private MetadataManager metadataMgr;

	@RequestMapping("/login")
	public String showView(Map<String, Object> model) {
		model.put("idps", metadataMgr.getIDPEntityNames());
		return "login";
	}
}
