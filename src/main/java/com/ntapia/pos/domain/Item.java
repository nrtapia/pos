package com.ntapia.pos.domain;


import java.math.BigDecimal;
import java.time.Instant;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("items")
@TypeAlias("item")
public class Item {

  @Id
  private String id;

  @NotNull
  @Indexed(unique = true)
  private String code;

  @NotNull
  @Indexed(unique = true)
  private String name;

  private ItemType itemType;

  @NotNull
  private BigDecimal price;

  private int stock;



  @CreatedBy
  private String user;

  @CreatedDate
  private Instant createdDate;

  @LastModifiedBy
  private String lastModifiedUser;

  @LastModifiedDate
  private Instant lastModifiedDate;



}
