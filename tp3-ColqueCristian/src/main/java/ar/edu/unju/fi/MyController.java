
package ar.edu.unju.fi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/index") // Define la ruta para la página HTML
    public String index() {
        return "index"; // Retorna el nombre de la vista HTML (sin extensión)
    }
    
    @Controller
	public class formController {
			@GetMapping("/formularioCliente")
			public String getFormulario() {
				return "form-cliente";
			}
	}

}
