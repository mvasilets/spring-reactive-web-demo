package me.msvasilets.reactiveweb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Details {

    private String address;

    private String email;

    private String phone;

}
