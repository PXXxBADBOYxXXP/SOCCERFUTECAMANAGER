package com.marcobolanos.soccerfutecamanager.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class CloudinaryConfig {

    @Bean
    Cloudinary cloudinary(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dmkdbo55l",
                "api_key", "388339471875132",
                "api_secret", "YF8OPBAhPO0a9i1pu2WDIKpjA8U"
        ));
    }
}
