package Lombok.ClassLombok;

import Commons.Model.Common;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@Builder
@Table(name = "person")
public class Person extends Common  {

	private static final long serialVersionUID = 1L;

	@Column(name = "first_name", nullable = false)
	@Size(min = 10, max = 30)
	@NotNull(message = "It cannot be null.")
	@EqualsAndHashCode.Include
	private String firstName;

	@Column(name = "last_name", nullable = false)
	@Size(min = 20, max = 100)
	@NotNull(message = "It cannot be null.")
	@EqualsAndHashCode.Include
	private String lastName;
}
