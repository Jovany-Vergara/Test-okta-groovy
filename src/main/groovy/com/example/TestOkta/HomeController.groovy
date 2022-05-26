package com.example.TestOkta

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HomeController {
    @GetMapping("/")
    String getName (@AuthenticationPrincipal OidcUser user){
        return "Login En: "+ user.getFamilyName() + "!"
    }
}
