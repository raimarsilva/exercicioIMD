import React, { useEffect, useState } from 'react';
import logo from './logo.svg';
import './App.css';
import Processo from './components/Processo';
import api from './services/api';

function App() {
  var [processo, listarProcessoUnico] = useState();

  useEffect(() => {
      api
        .get("/processo/3")
        .then((response) => listarProcessoUnico(response.data))
        .catch((err) => {
          console.error("Impossivel listar: " + err);
        });
    }, []);
  
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Processo numero={processo?.numero} orgaoJudic={processo?.orgaoJudic} relator={processo?.relator}/>
      </header>
    </div>
  );
}

export default App;
