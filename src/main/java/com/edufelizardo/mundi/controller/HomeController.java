package com.edufelizardo.mundi.controller;

import com.edufelizardo.mundi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Monitor para PC Full HD UltraWide LG LED IPS 29” - 29WK600");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/61QUveKcmIL._AC_SL1103_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Monitor-para-Full-UltraWide-LG/dp/B07HJFN4L6/ref=sr_1_1?keywords=monitor+ultrawide+29+lg&qid=1636411339&sprefix=monitor+ultrawide+29+%2Caps%2C295&sr=8-1&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Usos específicos do produto\tDoméstico\n" +
                "Taxa de atualização\t75\n" +
                "Marca\tLG\n" +
                "Tamanho da tela\t73.7 Centímetros\n" +
                "Características especiais\tTela Ultrawide");
        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
