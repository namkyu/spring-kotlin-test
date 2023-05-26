package com.example.springkotlintest.repository

import com.example.springkotlintest.domain.Region
import org.springframework.data.jpa.repository.JpaRepository


interface RegionRepository : JpaRepository<Region, Long> {
}