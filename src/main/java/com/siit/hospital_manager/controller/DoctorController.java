package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.dto.DoctorDto;
import com.siit.hospital_manager.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mvc/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping("/viewAll")
    public String viewAll(Model model){
        List<DoctorDto> doctors = doctorService.findAll();
        model.addAttribute("doctors", doctors);
        return "/doctor/viewAll";
    }

}