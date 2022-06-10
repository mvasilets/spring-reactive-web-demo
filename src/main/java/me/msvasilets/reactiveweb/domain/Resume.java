package me.msvasilets.reactiveweb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "resumes")
public class Resume {

    @Id
    @Field(targetType = FieldType.OBJECT_ID)
    private String resumeId;

    private String firstName;

    private String middleName;

    private String lastName;

    private LocalDate birthDate;

    private Details details;

    private String profile;

    private Education education;

    private Experience experience;

    private List<String> skills;

}
