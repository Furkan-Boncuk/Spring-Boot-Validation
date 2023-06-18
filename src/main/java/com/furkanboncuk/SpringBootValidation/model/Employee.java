package com.furkanboncuk.SpringBootValidation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    @JsonProperty
    @Positive(message="Id parameters cannot take negative values")
    @Min(value=100, message="The id value must be between 3 and 10 digits")
    @Max(value=999999999, message="The id value must be between 3 and 10 digits")
    private long employeeId;
    @JsonProperty
    @NotEmpty
    @Size(min=3, max=15,message="Employee name length should be between 3 to 15")
    private String employeeName;
    @JsonProperty
    @NotEmpty
    @Size(min=3, max=15,message="Employee name length should be between 3 to 15")
    private String employeeCity;


}
