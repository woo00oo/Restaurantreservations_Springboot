package kr.co.kku.ByeonHyeonWoo.application;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SessionDto {

   private String accessToken;

}
