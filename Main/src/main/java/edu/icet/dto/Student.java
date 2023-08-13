package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        if (null == firstName) return;
        this.firstName = firstName;
    }
}
