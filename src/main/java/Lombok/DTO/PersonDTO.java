package Lombok.DTO;

import Lombok.ClassLombok.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PersonDTO extends Person {

	private static final long serialVersionUID = 1L;

	public String getMessagePersonDTO() {
		
		return "Class Null";
	}
}
