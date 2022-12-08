package org.cst8277.gibbons.caitlyn.ums.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oauth2Controller {

    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;

    @GetMapping(value="/user")
    public String sayHello(@AuthenticationPrincipal OAuth2User principal) {
        return "Hello, " + principal.getAttribute("name");
    }
}
