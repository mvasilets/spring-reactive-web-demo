package me.msvasilets.reactiveweb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {

    private String workPlace;

    private String position;

    private LocalDate dateFrom;

    private LocalDate dateTo;

    private List<String> responsibilities;

}
