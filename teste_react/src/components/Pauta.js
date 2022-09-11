import React, { useEffect, useState } from 'react';
import api from "../services/api";
// Definição de um componente no React.
function Pauta(){

    var [pauta, mostrarPauta] = useState();

    useEffect(() => {
      api
        .get("/pauta/1")
        .then((response) => mostrarPauta(response.data))
        .catch((err) => {
          console.error("Impossivel listar: " + err);
        });
    }, []);
    
    return (
        <div>
            <p>Data da pauta: {pauta?.data}</p>
            <p>Processos: {pauta?.processo}</p>
            <p>Órgão Judicante: {pauta?.orgaoJudicante}</p>
        </div>
    );
}

export default Pauta;