package com.t2m.g2nee.auth.dto.member;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * 토큰 반환 DTO클래스
 *
 * @author 김수현
 */
@Getter
@NoArgsConstructor
public class MemberInfoResponseDTO {
    private Long memberId;
    private String username;
    private String password;
    private String email;
    private List<String> authorities;
}
