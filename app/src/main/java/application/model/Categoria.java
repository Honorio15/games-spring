package application.model; 

import java.util.HashSet; 
import java.util.Set; 

import jakarta.persistence.Column; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence. Id; 
import jakarta.persistence.OneToMany; 
import jakarta.persistence.Table; 

@Entity 
@Table(name="categorias") 
public class Categoria { 
@Id 
@GeneratedValue(strategy GenerationType. IDENTITY) 
private long id; 
@Column(unique true, nullable = false) 
private String nome; 
@One ToMany (mappedBy "categoria") 
private Set<logo jogos new HashSet<>(); 
public long getId() {
return id; 
}
public void setId(long id) ( } 
this.id id; 
public String gethome() ( return nome; 
public void sethome (String nome) ( F 
this.nome nome; 
public Set<3ogo> getJogos() { 
return jogos; 
public void setJogos (Set<logos jogos) ( 
this.jogos jogos;
}
}