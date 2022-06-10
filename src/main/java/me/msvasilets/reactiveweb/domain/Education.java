package me.msvasilets.reactiveweb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {

    private String degree;

    private String place;

    private LocalDate dateStart;

    private LocalDate graduationDate;

    private List<String> notes;

}
