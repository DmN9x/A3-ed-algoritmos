package com.websocket.divertoland.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.websocket.divertoland.domain.Atracao;
import com.websocket.divertoland.domain.Usuario;
import com.websocket.divertoland.domain.structures.HashMap;

@Component
public class ComponentConfig {
    
    private HashMap<Atracao, List<Usuario>> filasAtracoes;

    public void AdicionarUsuarioFila(Usuario usuario, Atracao atracao){
        if (filasAtracoes.get(atracao).isEmpty()){
            filasAtracoes.get(atracao).add(usuario);
        } else {
            filasAtracoes.put(atracao, new ArrayList<Usuario>());
            filasAtracoes.get(atracao).add(usuario);
        }
    }

    public void RemoverUsuarioFila(Usuario usuario, Atracao atracao){
        if (!filasAtracoes.get(atracao).isEmpty()){
            filasAtracoes.get(atracao).remove(0);
        }
    }

    // public int ObterPosicaoFila(Usuario usuario, Atracao atracao){
    //     filasAtracoes.forEach((atracaoHash, usuariosHash) -> {
    //         if(atracaoHash == atracao){
    //             return usuariosHash.indexOf(usuario);
    //         }
    //     });
    // }
}
