import api from "../services/api";

// Definição de um componente no React.
const CadastrarUsuario = () => {

    function postar (e) {
        e.preventDefault()
        let nome = document.getElementById('nome').value;
        console.log(nome);
        api.post("/usuario", {nome:nome})
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