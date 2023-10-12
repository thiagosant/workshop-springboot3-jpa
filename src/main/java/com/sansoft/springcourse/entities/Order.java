package com.sansoft.springcourse.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "tb_order")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
}
