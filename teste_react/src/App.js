
import logo from './logo.svg';
import './App.css';
import Processo from './components/Processo';
import Pauta from './components/Pauta';
import CadastrarUsuario from './components/CadastrarUsuario';
import Evento from './components/Evento';

function App() {
  
  
  return (
    <div className="App">
      <header className="App-header">
      <h1>Cadastrar processo</h1>
        <img src={logo} className="App-logo" alt="logo" />
        <Evento></Evento>
        <CadastrarUsuario></CadastrarUsuario>
        <Processo />
        <Pauta/>
      </header>
    </div>
  );
}

export default App;
