package org.sfg.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotes implements QuotesService
{
    @Override
    public String getRandomQuote()
    {
        return "temporary quote value";
    }
}
