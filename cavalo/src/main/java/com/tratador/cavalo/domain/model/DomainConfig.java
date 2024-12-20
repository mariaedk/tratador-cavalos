package com.tratador.cavalo.domain.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DomainConfig {

    private static final Properties PROPERTIES = new Properties();

    static {
        try (InputStream input = DomainConfig.class.getClassLoader().getResourceAsStream("DomainResources.properties")) {
            if (input == null) {
                throw new IOException("Arquivo de propriedades não encontrado.");
            }
            PROPERTIES.load(input);
        } catch (IOException ex) {
            throw new ExceptionInInitializerError("Falha ao carregar o arquivo de propriedades: " + ex.getMessage());
        }
    }

    /**
     * Método para obter uma propriedade pelo nome.
     * @param key chave da propriedade
     * @return valor da propriedade ou null se não existir
     */
    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    /**
     * Método para obter uma propriedade com valor padrão caso não exista.
     * @param key chave da propriedade
     * @param defaultValue valor padrão caso a chave não seja encontrada
     * @return valor da propriedade ou o valor padrão
     *
     */
    public static String getProperty(String key, String defaultValue) {
        return PROPERTIES.getProperty(key, defaultValue);
    }

}
