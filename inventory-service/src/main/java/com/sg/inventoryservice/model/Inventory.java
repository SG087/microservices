package com.sg.inventoryservice.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "sku_code")
    private String skuCode;
    @Column(name = "quantity")
    private Integer quantity;
}
