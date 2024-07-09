package br.com.e2etreinamentos.banke2etreinamentos.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private InformacoesPessoais personalInformation;

    @Embedded
    private InformacoesProfissionais professionalInformation;

    public Cliente() {
        this.personalInformation = new InformacoesPessoais();
        this.professionalInformation = new InformacoesProfissionais();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InformacoesPessoais getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(InformacoesPessoais personalInformation) {
        this.personalInformation = personalInformation;
    }

    public InformacoesProfissionais getProfessionalInformation() {
        return professionalInformation;
    }

    public void setProfessionalInformation(InformacoesProfissionais professionalInformation) {
        this.professionalInformation = professionalInformation;
    }

    
}
