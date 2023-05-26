package com.example.springkotlintest.service

import com.example.springkotlintest.controller.common.CustomException
import com.example.springkotlintest.controller.common.ErrorCode
import com.example.springkotlintest.domain.Region
import com.example.springkotlintest.dto.RegionDto
import com.example.springkotlintest.repository.RegionRepository
import org.springframework.stereotype.Service

@Service
class RegionService(val regionRepository: RegionRepository) {

    fun getRegionList(): List<Region> {
        return regionRepository.findAll()
    }

    fun saveRegion(regionDto: RegionDto) {
        regionRepository.save(regionDto.toEntity())
    }

    fun occursException() {
        throw CustomException(ErrorCode.MEMBER_NOT_FOUND)
    }
}