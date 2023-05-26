package com.example.springkotlintest.domain

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime


@Entity
@Table(name = "region")
class Region(

    @Column(nullable = false)
    @Convert(converter = RegionNameConverter::class)
    var region: String = "",

    @Column(nullable = false)
    var dataType: Int = 0,

    @Column(nullable = false)
    var dateTime: String = "",

    @CreationTimestamp
    @Column(name = "registered", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    var registered: LocalDateTime = LocalDateTime.now(),
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
}