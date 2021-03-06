package com.avrios.sample.exchange.service;

import com.avrios.sample.exchange.dto.ConversionRateInDto;
import com.avrios.sample.exchange.dto.ConversionRateOutDto;

public interface ConversionRatesService {

    /**
     * Searches for a reference rate within rates list
     * @param conversionRateInDto - request with targetCurrency
     * @return current conversion rate for target currency using data from ECB
     */
    ConversionRateOutDto getConversionRate(ConversionRateInDto conversionRateInDto);

}
