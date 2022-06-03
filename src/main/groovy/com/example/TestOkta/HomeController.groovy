package com.example.TestOkta

import org.apache.catalina.User
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HomeController {
    @GetMapping("/")
    String home(@AuthenticationPrincipal User user) {
        return "Welcome, "+ user.getFullName() + "!";
    }
    @GetMapping("/helth")
    String helth(@AuthenticationPrincipal User user) {
        return "Welcome, "+ user.getFullName() + "!";
    }
}
