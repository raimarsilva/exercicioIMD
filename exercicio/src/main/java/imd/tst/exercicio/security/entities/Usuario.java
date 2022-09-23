package imd.tst.exercicio.security.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_usuario")
public class Usuario{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(nullable = false, unique=true)
    @NotEmpty(message = "O Campo Login é obrigatório.")
    private String login;
    
    @Column(nullable = false)
    @NotEmpty(message = "O Campo Senha é obrigatório.")
    private String senha;

    @Column(nullable = false)
    private boolean admin;
}
