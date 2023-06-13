package Model;

import java.util.List;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@NotBlank(message = "{NotBlank.sv.name}")
	private String name;

	@NotBlank(message = "{NotBlank.sv.email}")
	@Email(message = "{Email.sv.email}")
	private String email;

	@NotNull(message = "{NotNull.sv.marks}")
	@Min(value = 0, message = "{Min.sv.marks}")
	@Max(value = 10, message = "{Max.sv.marks}")
	private Double marks;

	@NotNull(message = "{NotNull.sv.gender}")
	private Boolean gender;

	@NotBlank(message = "{NotBlank.sv.faculty}")
	private String faculty;

	@NotEmpty(message = "{NotEmpty.sv.hobbies}")
	private List<String> hobbies;

}
