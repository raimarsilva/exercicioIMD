package com.example.demoGradle.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Processo
 *
 */
@Entity

public class Processo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	public Processo() {
		super();
	}
   
}
