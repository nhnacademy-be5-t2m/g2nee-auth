package com.t2m.g2nee.auth.dto.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * shop에서 멤버 정보 중 username을 받아올 DTO
 *
 * @author 김수현
 * @version 1.0
 */

@Getter
@AllArgsConstructor
public class MemberInfoRequestDTO {

    private String username;

}
