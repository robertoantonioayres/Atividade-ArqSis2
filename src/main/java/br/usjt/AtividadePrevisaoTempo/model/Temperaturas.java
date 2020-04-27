package br.usjt.AtividadePrevisaoTempo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="temperaturas")
public class Temperaturas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Long id;
	
    @Column(name = "descricao")
    private String descricao;
	    
    @Column(name = "temperatura_min")
    private String temperaturaMin; 
    
    @Column(name = "temperatura_max")
    private String temperaturaMax; 
    
    @Column(name = "humidade_relativa")
    private String humidadeRelativa; 
    
	@Column(name = "dia_semana")
    private String diaSemana;  
	
	@Column(name = "data_hora")
	private Date dataHora;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "longitude")
	private String longitude;
    

}
