package com.edureka.entities;


import lombok.*;

import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonEntity {
    private @Getter @Setter BigInteger id;
    private @Getter @Setter String name;
    private @Getter @Setter String designation;
}
