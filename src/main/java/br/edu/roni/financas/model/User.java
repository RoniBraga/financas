package br.edu.roni.financas.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
  @Id
  @GeneratedValue(strategy =  GenerationType.UUID) 
  private UUID id;
  private String nome;
  private String password;  
  private String email;
}
