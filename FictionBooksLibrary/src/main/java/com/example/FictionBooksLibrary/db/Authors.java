/**
 * 
 */
package com.example.FictionBooksLibrary.db;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author dimple.kataria
 *
 */
@Entity
public class Authors {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String city;

}
