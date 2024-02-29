package com.example;
import com.microsoft.azure.functions.HttpStatus;
import io.micronaut.azure.function.http.HttpRequestMessageBuilder;
import io.micronaut.http.HttpMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MicronautFunctionTestSflFunctionTest {

    @Test
    public void testFunction() throws Exception {
        try (Function function = new Function()) {
            HttpRequestMessageBuilder.AzureHttpResponseMessage response =
                function.request(HttpMethod.GET, "/micronautFunctionTestSfl")
                        .invoke();

            assertEquals(HttpStatus.OK, response.getStatus());
        }
    }
}
