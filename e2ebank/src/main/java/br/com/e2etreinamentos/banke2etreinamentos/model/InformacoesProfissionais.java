package br.com.e2etreinamentos.banke2etreinamentos.model;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class InformacoesProfissionais {

	private String actualGroup;
	private String firstGroup;
	private String job;
	private BigDecimal salary;
	private String professionalEmail;

	public String getActualGroup() {
		return actualGroup;
	}

	public void setActualGroup(String actualGroup) {
		this.actualGroup = actualGroup;
	}

	public String getFirstGroup() {
		return firstGroup;
	}

	public void setFirstGroup(String firstGroup) {
		this.firstGroup = firstGroup;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getProfessionalEmail() {
		return professionalEmail;
	}

	public void setProfessionalEmail(String professionalEmail) {
		this.professionalEmail = professionalEmail;
	}

}
