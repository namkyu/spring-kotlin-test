package com.example.springkotlintest.controller

import com.example.springkotlintest.dto.RegionDto
import com.example.springkotlintest.service.RegionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegionController(val regionService: RegionService) {

    @GetMapping("/regions")
    fun regions() = regionService.getRegionList()

    @PostMapping("/regions")
    fun saveRegions(@RequestBody regionDto: RegionDto) = regionService.saveRegion(regionDto)
}