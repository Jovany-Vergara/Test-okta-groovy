package com.example.TestOkta

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AuthorizationController {
    @GetMapping("/oauth2/authorization/okta")
    String home(@AuthenticationPrincipal OidcUser user) {
        return "Welcome, "+ user.getFullName() + "!";
    }
}
