package com.hotmartchallenger.service;

import com.hotmartchallenger.dto.GetCategoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "top_headlines_url", value = "https://newsapi.org/v2/top-headlines")
public interface CategoryService {

    @RequestMapping(method = RequestMethod.GET)
    public GetCategoryDTO getCategory(@RequestParam("country") String country,
                                      @RequestParam("category") String category,
                                      @RequestParam("sources") String sources,
                                      @RequestParam("q") String keywords,
                                      @RequestParam(value = "apiKey", required = true) String apikey);

}
