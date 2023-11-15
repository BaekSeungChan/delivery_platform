package org.delivery.db.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
//@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class) // snake 형식으로 변환
public class AccountMeResponse {

    private String email;

    private String name;

    private LocalDateTime registerAt;
}
