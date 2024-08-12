package org.avc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.LocalDateTime;

public class TransferDTO {
    @JsonProperty("_id")
    private Long id;

    private Long userId;

    private Long fighterId;

    private String transactionType;

    private double price;

    private LocalDateTime date;
}
