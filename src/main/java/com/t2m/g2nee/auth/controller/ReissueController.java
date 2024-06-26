package com.t2m.g2nee.auth.controller;

import com.t2m.g2nee.auth.repository.RefreshTokenRepository;
import com.t2m.g2nee.auth.service.tokenService.ReissueService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Token Reissue Controller
 *
 * @author 김수현
 * @version 1.0
 */
@RestController
public class ReissueController {


    private final ReissueService reissueService;

    public ReissueController(ReissueService reissueService, RefreshTokenRepository refreshTokenRepository) {

        this.reissueService = reissueService;
    }

    @PostMapping("/api/v1/auth/reissue")
    public ResponseEntity<?> reissue(HttpServletRequest request, HttpServletResponse response) {

        return reissueService.reissue(request, response);

    }

}
