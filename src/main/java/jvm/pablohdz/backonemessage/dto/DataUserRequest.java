package jvm.pablohdz.backonemessage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataUserRequest {
    private String name;
    private String email;
    private String password;
}
