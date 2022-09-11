
import logo from './logo.svg';
import './App.css';
import Processo from './components/Processo';
import Pauta from './components/Pauta';

function App() {
  
  
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Processo />
        <Pauta/>
      </header>
    </div>
  );
}

export default App;
