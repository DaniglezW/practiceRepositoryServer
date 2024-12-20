package com.practice.server.application.rest.api;

import com.practice.server.application.dto.request.LoginRequest;
import com.practice.server.application.dto.request.RefreshRequest;
import com.practice.server.application.dto.request.RegisterRequest;
import com.practice.server.application.dto.response.PracticeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.practice.server.application.constants.Constants.AUTH;

@RequestMapping(AUTH)
public interface IAuthControllerAPI {

    @PostMapping("/register")
    ResponseEntity<PracticeResponse> register(@RequestBody RegisterRequest request);

    @PostMapping("/login")
    ResponseEntity<PracticeResponse> login(@RequestBody LoginRequest request);

    @PostMapping("/refresh")
    ResponseEntity<PracticeResponse> refresh(@RequestBody RefreshRequest request);

}
