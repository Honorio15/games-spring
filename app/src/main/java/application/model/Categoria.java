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
    @GeneratedValue(strategy = GenerationType. IDENTITY) 
    private long Id; 
    @Column(unique = true, nullable = false) 
    private String nome;

    @OneToMany (mappedBy = "categoria") 
    private Set<Jogo> jogos = new HashSet<>();

    public long getId() {
    return id; 
    }

    public void setId(long id) { 
        this.id = id;
    }

    public String gethome() {
         return nome;
    }

    public void sethome (String nome) { 
    this.nome = nome;
    }

    public Set<Jogo> getJogos() { 
        return jogos; 
    }
    public void setJogos (Set<Jogos> jogos) { 
    this.jogos = jogos;
    }
}