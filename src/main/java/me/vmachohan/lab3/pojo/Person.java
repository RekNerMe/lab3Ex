package me.vmachohan.lab3.pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import me.vmachohan.lab3.validator.EDDR;

import java.time.LocalDate;


public record Person(
        @NotBlank
        @Size(min = 7)
        @Pattern(regexp = ".*a.*", message = "must contain letter 'a'")
        String name,
        @EDDR
        String eddr,
        @Min(10)
        int count,
        LocalDate created_at
) {

}
