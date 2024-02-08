package com.example.Aula1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("pessoa")
public class PessoaController {
    @ResponseBody
    @GetMapping("/exemplo")
    public String exemplo(){

        return "Controller de Pessoa!";
    }
}
