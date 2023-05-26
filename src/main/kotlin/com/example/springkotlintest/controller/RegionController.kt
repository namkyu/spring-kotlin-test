package com.example.springkotlintest.controller

import com.example.springkotlintest.controller.valid.ValidRegion
import com.example.springkotlintest.dto.RegionDto
import com.example.springkotlintest.service.RegionService
import jakarta.validation.Valid
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@Validated // custom validation 을 사용하기 위해서는 추가해야 한다.
@RestController
class RegionController(val regionService: RegionService) {

    @GetMapping("/exception")
    fun exception() = regionService.occursException()

    @GetMapping("/regions")
    fun regions() = regionService.getRegionList()

    @PostMapping("/regions")
    fun saveRegions(@RequestBody @Valid regionDto: RegionDto) = regionService.saveRegion(regionDto)

    @PostMapping("/regions2")
    fun saveRegions2(@RequestBody @ValidRegion regionDto: RegionDto) = regionService.saveRegion(regionDto)
}