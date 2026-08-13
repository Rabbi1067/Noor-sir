package com.sparktech.hellospring;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String name;
    private String email;
    private String message;
}
