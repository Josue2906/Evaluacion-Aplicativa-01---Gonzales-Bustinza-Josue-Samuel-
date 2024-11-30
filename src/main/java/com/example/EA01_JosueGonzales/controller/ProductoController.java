package com.example.EA01_JosueGonzales.controller;

import com.example.EA01_JosueGonzales.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductoController {
    @GetMapping("/formulario")    
    public String showForm(Model model){
        model.addAttribute("producto", new Producto());
        return "formulario";
    }
    
    @PostMapping("/guardar")
    public String submitForm(@ModelAttribute Producto producto, Model model){
        model.addAttribute("producto", producto);
        return "exito";
    }
}
