import React, { useState } from 'react';
import api from "../services/api";

// Definição de um componente no React.
const CadastrarUsuario = () => {

    var [usuario, cadastrarUsuario] = useState();

    function postar () {
        const nome = document.getElementById('nome').value;
        console.log(nome);
        const formData = new FormData();
        formData.append(nome,usuario);
        api.post("/usuario?nome=", usuario).then((response) => cadastrarUsuario(response)).catch((err) => {
          console.error("Impossivel cadastrar usuario: " + err);
        })
    };
    
    return (
        <div>
            <form>
                <input type="text" id='nome' placeholder='Digite o nome do usuário'></input>
                <input type="submit" onClick={postar} value="Cadastrar"></input>
            </form>
        </div>
    );
}

export default CadastrarUsuario;