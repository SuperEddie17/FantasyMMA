package org.avc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {
    @JsonProperty("_id")
    private Long id;

    private String name;

    private LocalDate date;


}
