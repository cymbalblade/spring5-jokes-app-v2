package org.sfg.spring5jokesappv2.controllers;

import org.sfg.spring5jokesappv2.services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController
{
    private QuotesService quotesService;

    public JokesController(QuotesService quotesService)
    {
        this.quotesService = quotesService;
    }

    @GetMapping("/")
    public String getJoke(Model model)
    {
        model.addAttribute("joke", quotesService.getRandomQuote());
        return "index";
    }
}
