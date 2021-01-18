package br.com.gabrielmmendes;

import br.com.gabrielmmendes.annotations.Development;
import br.com.gabrielmmendes.annotations.Production;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    @Development
    public CommandLineRunner executarDev() {
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

    @Bean
    @Production
    public CommandLineRunner executarProd() {
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE PRODUÇÃO");
        };
    }
}
