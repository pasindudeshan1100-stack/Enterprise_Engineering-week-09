package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
   private Integer id;
   private String name;
   private Integer age;
   private String adress;
   private String phoneNumber;
   private String email;
}
