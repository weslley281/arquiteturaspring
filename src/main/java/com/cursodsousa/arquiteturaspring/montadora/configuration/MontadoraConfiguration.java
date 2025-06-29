package com.cursodsousa.arquiteturaspring.montadora.configuration;

import com.cursodsousa.arquiteturaspring.montadora.Motor;
import com.cursodsousa.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO");
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }
}
