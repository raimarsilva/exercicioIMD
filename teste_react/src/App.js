import logo from './logo.svg';
import './App.css';
import HelloWorld from './components/HelloWorld';
import Nomes from './components/Nomes';
import Processo from './components/Processo';

function App() {
  // declarando uma variavel de bloco para ser usada como valor no JSX.
  let nome='Raimar'

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Aprenda React, {nome.toUpperCase()}
        </a>
        <p><HelloWorld/></p>
        <Nomes nome="Izelma"></Nomes>
        <Nomes nome={nome}/>
        <Processo numeroProcesso='P1234' relator="Emanoel" autor="Raimar" reu="Izelma"/>
      </header>
    </div>
  );
}

export default App;
