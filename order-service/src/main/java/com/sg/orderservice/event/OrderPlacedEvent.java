package com.sg.orderservice.event;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderPlacedEvent {
    private String orderNumber;
}
