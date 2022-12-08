package org.cst8277.gibbons.caitlyn.ums.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class oauth2Controller {

    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;

    @GetMapping(value="/user")
    public Map<String, Object> username(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("name", principal.getAttribute("name"));
    }

    @GetMapping(value="/getAuthentication", produces="application/json")
    public String getAuthentication(OAuth2AuthenticationToken auth) {
        return  auth.toString();
    }


}
