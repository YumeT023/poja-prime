package com.yumii.poja.repository.model;

import static java.util.UUID.randomUUID;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Prime {
  @Id private String id;

  private String value;

  private Instant creationDatetime;

  @PrePersist
  private void generateId() {
    this.id = randomUUID().toString();
  }
}
