package com.sg.orderservice.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDto;
}
