import React, { useEffect, useState } from 'react';
import api from "../services/api";
// Definição de um componente no React.
function CadastrarProcesso(){

    var [processo, listarProcessoUnico] = useState();

    useEffect(() => {
      api
        .get("/processo")
        .then((response) => listarProcessoUnico(response.data))
        .catch((err) => {
          console.error("Impossivel listar: " + err);
        });
    }, []);
    
    return (
        <div>
            <p>Número do Processo: {processo?.numero}</p>
            <p>Órgão judicante: {processo?.orgaoJudic}</p>
            <p>Relator: {processo?.relator}</p>
        </div>
    );
}

export default CadastrarProcesso;