package com.revature.p1.myp1.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ers_reimbursement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reimbursement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="reimb_id")
	private int id;
	@Column(name="reimb_amount")
	private float amount;
	@Column(name="reimb_submitted")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date submitted;
	@Column(name="reimb_resolved")
	private Date resolved;
	@Column(name="reimb_description")
	private String description;
	@Column(name="reimb_author")
	private int author;
	@Column(name="reimb_resolver")
	private int resolver;
	@Column(name="reimb_status_id")
	private int status;
	@Column(name="reimb_type_id")
	private int type;
	
	
	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", submitted=" + submitted + ", resolved=" + resolved
				+ ", description=" + description + ", author=" + author + ", resolver=" + resolver + ", status="
				+ status + ", type=" + type + "]";
	}
	
	
	public Reimbursement() {
		super();
	}
	
	public Reimbursement(int id, float amount, Date submitted, Date resolved, String description, int author,
			int resolver, int status, int type) {
		super();
		this.id = id;
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.author = author;
		this.resolver = resolver;
		this.status = status;
		this.type = type;
	}
	
	
	public Reimbursement(float amount, Date submitted, String description, int type) {
		super();
		this.amount = amount;
		this.submitted = submitted;
		this.description = description;
		this.type = type;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getSubmitted() {
		return submitted;
	}
	public void setSubmitted(Date submitted) {
		this.submitted = submitted;
	}
	public Date getResolved() {
		return resolved;
	}
	public void setResolved(Date resolved) {
		this.resolved = resolved;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public int getResolver() {
		return resolver;
	}
	public void setResolver(int resolver) {
		this.resolver = resolver;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		return Objects.hash(amount, author, description, id, resolved, resolver, status, submitted, type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		return Float.floatToIntBits(amount) == Float.floatToIntBits(other.amount) && author == other.author
				&& Objects.equals(description, other.description) && id == other.id
				&& Objects.equals(resolved, other.resolved) && resolver == other.resolver && status == other.status
				&& Objects.equals(submitted, other.submitted) && type == other.type;
	}

	
	
}
