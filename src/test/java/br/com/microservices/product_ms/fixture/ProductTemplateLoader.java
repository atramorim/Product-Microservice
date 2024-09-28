package br.com.microservices.product_ms.fixture;

import br.com.microservices.product_ms.dto.ProductDTO;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class ProductTemplateLoader implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(ProductDTO.class).addTemplate("valid", new Rule(){{
            add("name", random("Iphone 14 Pro Max", "Iphone 14 Pro Max", "Samsumg S23 Ultra"));
            add("description", "Celular de última geração e tals. Parte da frente em ceramic shield, Parte de trás em cidro e estrutura de alumínio");
            add("price", random(Double.class, range(00.01, 7997.48)));
        }});
    }
}
