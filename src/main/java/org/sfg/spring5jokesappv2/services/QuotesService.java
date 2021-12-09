package org.sfg.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

@Service
public interface QuotesService
{
    String getRandomQuote();
}
